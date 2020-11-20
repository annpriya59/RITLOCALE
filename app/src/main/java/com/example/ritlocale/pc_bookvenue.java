package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
//import android.widget.Toast;

public class pc_bookvenue extends AppCompatActivity   {

    String[] vs={"Select","Full time","Specified Time Only"};
    String item;
    Button btnbbok;
    EditText txtename,txtdescription,txtContact;//txtstrtDate,txtendDate,txtstrtTime,txtendTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_bookvenue);
        Spinner spin = (Spinner) findViewById(R.id.vstatus);
        btnbbok=findViewById(R.id.btnrehod);
        txtename=findViewById(R.id.evntName);
        txtdescription=findViewById(R.id.desptn);
        txtContact=findViewById(R.id.usercontact);




        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item= parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_spinner_item, vs);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(ad);
       btnbbok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* if (txtename.getText().toString().isEmpty()) {//fname vaidation
                    Toast.makeText(getApplicationContext(), "Enter Event name", Toast.LENGTH_SHORT).show();
                }
                else if (txtContact.getText().toString().isEmpty()) {//fname vaidation
                    Toast.makeText(getApplicationContext(), "Enter contact number", Toast.LENGTH_SHORT).show();
                }
                else if(txtContact.getText().length()!=10)
                    Toast.makeText(getApplicationContext(), "Invalid contact number", Toast.LENGTH_SHORT).show();
                else if (!(txtContact.getText().toString().matches("[0-9]+"))) {
                    Toast.makeText(getApplicationContext(), "Invalid contact number", Toast.LENGTH_SHORT).show();
                }
                else if(item == "Select")//check usr type
                    Toast.makeText(getApplicationContext(),"Select your venue occupation status",Toast.LENGTH_SHORT).show();

                else{
                    //details added to database
                    Toast.makeText(getApplicationContext(), "REquest sent ", Toast.LENGTH_SHORT).show();
                    //txtFn.setText("registered");
                }*/
            }
        });




    }


}