package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class pc_editprofile extends AppCompatActivity {
Button b1,b2,b3;
EditText txtfn,txtyear,txtAddr,txtDept,txtContact,txtln;
    RadioButton rm,rf,ro;
    String gen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_editprofile);
        b1 = findViewById(R.id.btpic);
        b2 = findViewById(R.id.pc_chpsd);
        b3= findViewById(R.id.pc_update);
        txtfn=findViewById(R.id.pcfname);
        txtln=findViewById(R.id.pclname);
        txtAddr=findViewById(R.id.pcaddress);
        txtyear=findViewById(R.id.pcYname);
        txtContact=findViewById(R.id.pc_conatct);
        txtDept=findViewById(R.id.pcDeptn);
        rm=findViewById(R.id.radioMale);
        rf=findViewById(R.id.radioBFemale);
        ro=findViewById(R.id.radioOther);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), addimage.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), hod_psdchng.class);
                startActivity(i);
            }
        });




        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gen=(rm.isChecked())?"Male":(rf.isChecked())?"Female":(ro.isChecked())?"Other":"";


                if (txtfn.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter First name", Toast.LENGTH_SHORT).show();
                }
                else if(txtfn.getText().length()<3){
                    Toast.makeText(getApplicationContext(), "enter a valied name ", Toast.LENGTH_SHORT).show();
                }
                else if(!(txtfn.getText().toString().matches("[a-zA-Z ]+"))){
                    Toast.makeText(getApplicationContext(), "enter a valied name ", Toast.LENGTH_SHORT).show();
                }
                else if(gen==""){//gender check
                    Toast.makeText(getApplicationContext(), "select your gender", Toast.LENGTH_SHORT).show();
                }
                else if(txtyear.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "enter Academic  year ", Toast.LENGTH_SHORT).show();
                }
                else if (txtContact.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter contact number", Toast.LENGTH_SHORT).show();
                }
                else if(txtContact.getText().length() != 10){
                    Toast.makeText(getApplicationContext(), "enter a valied contact number ", Toast.LENGTH_SHORT).show();
                }
                else if(txtContact.getText().toString().matches("[a-zA-Z ]+")){
                    Toast.makeText(getApplicationContext(), "enter a valied contact number ", Toast.LENGTH_SHORT).show();
                }
                else  {
                    //added to database
                    Toast.makeText(getApplicationContext(), "updated your details ", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}