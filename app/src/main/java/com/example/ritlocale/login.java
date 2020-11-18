package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button btnevtList,btnlogin;
    EditText txtemail,txtpassword;
    TextView txtregform;
    String emailPattern ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            //"[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnlogin = findViewById(R.id.btnLogin);
        btnevtList = findViewById(R.id.btnexplore);
        txtemail=findViewById(R.id.txtOpwd);
        txtpassword = findViewById(R.id.txtPwd);
        txtregform =findViewById(R.id.lnkRegister);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtemail.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter email address", Toast.LENGTH_SHORT).show();
                } else if (!(txtemail.getText().toString().trim().matches(emailPattern))) {
                        Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                } else if(txtpassword.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "enter password", Toast.LENGTH_SHORT).show();
                } //else if(){
                    //write passwrd matching
               // }
                else {
                    Intent in1 = new Intent(getApplicationContext(), pc_home.class);
                    startActivity(in1);
                }
            }
        });
        btnevtList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(getApplicationContext(), events.class);
                startActivity(in2);
            }
        });
        txtregform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3=new Intent(getApplicationContext(),registration_main.class);
                startActivity(in3);
            }
        });

    }
}