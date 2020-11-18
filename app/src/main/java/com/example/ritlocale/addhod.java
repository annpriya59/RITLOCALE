package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class addhod extends AppCompatActivity  {

    String[] dept={"Select","M.C.A","Mechanical","ECE","EEE","Civil"};
    String item1;
    EditText txtFn,txtLn,txtUn,txtHodPwd;
    Button btnAddHod;
    String emailPattern ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addhod);
        btnAddHod=findViewById(R.id.btnaddHod);
        txtFn=findViewById(R.id.fname);
        txtLn=findViewById(R.id.lname);
        txtUn=findViewById(R.id.uname);
        txtHodPwd=findViewById(R.id.psd);


        Spinner sp = (Spinner) findViewById(R.id.dep);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item1= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dept);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        sp.setAdapter(ad);


        btnAddHod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (txtFn.getText().toString().isEmpty()) {//fname vaidation
                    Toast.makeText(getApplicationContext(), "Enter  first name of HOD", Toast.LENGTH_SHORT).show();
                } else if (!(txtFn.getText().toString().matches("[a-zA-Z ]+"))) {
                    Toast.makeText(getApplicationContext(), "Invalid name", Toast.LENGTH_SHORT).show();
                }
                else if(txtUn.getText().toString().isEmpty()){//
                    Toast.makeText(getApplicationContext(), "enter username or email id", Toast.LENGTH_SHORT).show();
                }
                else if (!(txtUn.getText().toString().matches(emailPattern))) {
                    Toast.makeText(getApplicationContext(), "Invalid user name", Toast.LENGTH_SHORT).show();
                }
                else if(txtHodPwd.getText().toString().isEmpty()){//
                    Toast.makeText(getApplicationContext(), "create new password ", Toast.LENGTH_SHORT).show();
                }
               // else if (!(txtUn.getText().toString().matches("[a-zA-Z ]+"))) {
                 //   Toast.makeText(getApplicationContext(), "Invalid password", Toast.LENGTH_SHORT).show();
                //}
                else if(item1=="Select")//check usr type
                    Toast.makeText(getApplicationContext(),"Select department",Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(), "Added HOD", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}