package com.example.alcphase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myprofileActivityBtn = (Button)findViewById(R.id.myprofileActivityBtn);
        myprofileActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MyProfileActivity.class);
                startActivity(startIntent);
            }
        });

        Button aboutalcActivityBtn = (Button)findViewById(R.id.aboutalcActivityBtn);
        aboutalcActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String andela = "https://andela.com/alc";
                Uri webaddress = Uri.parse(andela);

                Intent gotoandela = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoandela.resolveActivity(getPackageManager()) !=null) {
                    startActivity(gotoandela);
                }
            }
        });
    }
}
