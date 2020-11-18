package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Editpro_hod extends AppCompatActivity {
    Button btnAddImage,btnChngPwd,btnupdate;
    EditText txtEname,txtcontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editpro_hod);

        btnAddImage=findViewById(R.id.btnaddimag);
        btnChngPwd=findViewById(R.id.resetpsd);
        btnupdate=findViewById(R.id.btupdte);
        txtcontact=findViewById(R.id.edhcontact);
        txtEname=findViewById(R.id.ehname);



        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtEname.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter name", Toast.LENGTH_SHORT).show();
                }
                else if(txtEname.getText().length()<3){
                    Toast.makeText(getApplicationContext(), "enter a valied name ", Toast.LENGTH_SHORT).show();
                }
                else if(!(txtEname.getText().toString().matches("[a-zA-Z ]+"))){
                    Toast.makeText(getApplicationContext(), "enter a valied name ", Toast.LENGTH_SHORT).show();
                }
                else if (txtcontact.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter contact number", Toast.LENGTH_SHORT).show();
                }
                else if(txtcontact.getText().length() != 10){
                    Toast.makeText(getApplicationContext(), "enter a valied contact number ", Toast.LENGTH_SHORT).show();
                }
                else if(txtcontact.getText().toString().matches("[a-zA-Z ]+")){
                    Toast.makeText(getApplicationContext(), "enter a valied contact number ", Toast.LENGTH_SHORT).show();
                }
                else  {
                    //added to database
                    Toast.makeText(getApplicationContext(), "updated your contact details ", Toast.LENGTH_SHORT).show();
                }



            }
        });

        btnAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(getApplicationContext(),addimage.class);
                startActivity(in1);
            }
        });
        btnChngPwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(getApplicationContext(),hod_psdchng.class);
                startActivity(in2);
            }
        });

    }
}