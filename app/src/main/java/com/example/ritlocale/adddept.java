package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adddept extends AppCompatActivity {

    EditText txtdname;
    Button btnadd;
    boolean b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddept);
        txtdname=findViewById(R.id.txtdName);
        btnadd=findViewById(R.id.adddep);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b= TextUtils.isDigitsOnly(txtdname.getText());
                if (txtdname.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "enter name of Department", Toast.LENGTH_SHORT).show();
                }
                else if(txtdname.getText().length()<3){
                    Toast.makeText(getApplicationContext(), "enter a valied name of Department", Toast.LENGTH_SHORT).show();
                }
                else if(b){
                    Toast.makeText(getApplicationContext(), "enter a valied name of Department", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "added DEpartment name", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}