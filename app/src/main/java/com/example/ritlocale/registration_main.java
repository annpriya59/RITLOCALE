package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class registration_main extends AppCompatActivity  {
        String[] country = { "Select","Staff", "Student", "Venue coordinator"};
        String[] dept={"Select","M.C.A","Mechanical","ECE","EEE","Civil"};//load data from department table @apt
        EditText txtFn,txtLn,txtPwd,txtChPwd,txtYear,txtEmail;
        Button btnReg;
        RadioButton rm,rf,ro;
        String gen,item1,item2;
        TextView lblY;
        String p1,p2;
        String emailPattern ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String psdptrn="[0-9a-zA-Z\\\\!@#$%^&*-_]+[0-9a-zA-Z\\\\!@#$%^&*-_]";





        @Override
    protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_registration_main);
            btnReg=findViewById(R.id.btnRegister);
            txtFn =findViewById(R.id.fname);
            txtLn =findViewById(R.id.lname);
            txtChPwd=findViewById(R.id.chpsd);
            txtPwd=findViewById(R.id.txtpsd);
            txtEmail=findViewById(R.id.txtemailR);
            txtYear=findViewById(R.id.year);
            rm=findViewById(R.id.radioMale);
            rf=findViewById(R.id.radioBFemale);
            ro=findViewById(R.id.radioOther);
            lblY=findViewById(R.id.lblYear);




            Spinner spin = (Spinner) findViewById(R.id.spinner);
            spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    item1= parent.getItemAtPosition(position).toString();
                    /*if(item1=="Student"){
                        txtYear.setVisibility(View.VISIBLE);
                        lblY.setVisibility(View.VISIBLE);

                    }*/
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//check @apt
            //Setting the ArrayAdapter data on the Spinner
            spin.setAdapter(aa);


            Spinner sp = (Spinner) findViewById(R.id.spinner2);
            sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    item2= parent.getItemAtPosition(position).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
            ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, dept);
            ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp.setAdapter(ad);




            btnReg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    gen=(rm.isChecked())?"Male":(rf.isChecked())?"Female":(ro.isChecked())?"Other":"";
                    txtFn.getText().toString();
                    p1=txtPwd.getText().toString();
                    p2=txtChPwd.getText().toString();


                    if (txtFn.getText().toString().isEmpty()) {//fname vaidation
                        Toast.makeText(getApplicationContext(), "Enter your first name", Toast.LENGTH_SHORT).show();
                    } else if (!(txtFn.getText().toString().matches("[a-zA-Z ]+"))) {
                        Toast.makeText(getApplicationContext(), "Invalid name", Toast.LENGTH_SHORT).show();
                    }
                    else if(gen==""){//gender check
                        Toast.makeText(getApplicationContext(), "select your gender", Toast.LENGTH_SHORT).show();
                    }
                    else if(item1=="Select")//check usr type
                        Toast.makeText(getApplicationContext(),"Select your usertype",Toast.LENGTH_SHORT).show();
                    else if(item2=="Select")//check department
                        Toast.makeText(getApplicationContext(),"Select your department",Toast.LENGTH_SHORT).show();
                    else if(txtYear.getText().toString().isEmpty()) {
                            Toast.makeText(getApplicationContext(), "Enter your Academic Year", Toast.LENGTH_SHORT).show();
                    }
                    else if (!(txtYear.getText().toString().matches("[0-9]+"))) {
                        Toast.makeText(getApplicationContext(), "Invalid Academic Year", Toast.LENGTH_SHORT).show();
                    }
                    else if(txtEmail.getText().toString().isEmpty()) {
                        Toast.makeText(getApplicationContext(), "enter your email address", Toast.LENGTH_SHORT).show();
                    }
                   else if (!(txtEmail.getText().toString().trim().matches(emailPattern))) {
                        Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
                    }

                    else if(txtPwd.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Create a new password", Toast.LENGTH_SHORT).show();
                    }
                    else if (txtPwd.getText().length()<8) {
                        Toast.makeText(getApplicationContext(), "please enter minimum 8 charecters for password", Toast.LENGTH_SHORT).show();
                    }
                    else if (!(txtPwd.getText().toString().matches(psdptrn))) {
                        Toast.makeText(getApplicationContext(), "please enter a valid password", Toast.LENGTH_SHORT).show();
                    }
                    else if(txtChPwd.getText().toString().isEmpty()){
                        Toast.makeText(getApplicationContext(), "Reenter  password", Toast.LENGTH_SHORT).show();
                    }

                   else if(!(txtChPwd.getText().toString().matches(p1))){
                        Toast.makeText(getApplicationContext(), "Entered Password are not same", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //details added to database
                        Toast.makeText(getApplicationContext(), "Registered ", Toast.LENGTH_SHORT).show();
                        //txtFn.setText("registered");
                    }
                }
            });





        }


}