package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hod_home extends AppCompatActivity {
    ImageView venue,profile,logout,vrequest,usrapproval,notifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod_home);
        venue=findViewById(R.id.bus);
        profile=findViewById(R.id.userpro);
        usrapproval=findViewById(R.id.userappro);
        notifi=findViewById(R.id.notification);
        logout=findViewById(R.id.logout);
        vrequest=findViewById(R.id.vrequest);

        venue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent in1=new Intent(getApplicationContext(),viewvenues.class);
                 startActivity(in1);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),hod_userprofile.class);
                startActivity(in2);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),login.class);
                startActivity(in3);
            }
        });

        vrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(getApplicationContext(),venuerequest_hod.class);
                startActivity(in4);
            }
        });
        notifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent in5=new Intent(getApplicationContext(),notifications.class);
                startActivity(in5);
            }
        });

        usrapproval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent in6=new Intent(getApplicationContext(),registration_approval.class);
                startActivity(in6);
            }
        });
    }
}