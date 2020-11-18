package com.example.ritlocale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class hod_psdchng extends AppCompatActivity {
    Button btnSubmit;
    EditText txtOldPwd,txtNewPwd,txtRepwd;
    String psdptrn="[0-9a-zA-Z\\\\!@#$%^&*-_]+[0-9a-zA-Z\\\\!@#$%^&*-_]";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hod_psdchng);

        btnSubmit=findViewById(R.id.btnpsdchng);
        txtNewPwd=findViewById(R.id.txtPwd);
        txtOldPwd=findViewById(R.id.txtOpwd);
        txtRepwd=findViewById(R.id.txtRePwd);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String p=txtNewPwd.getText().toString();

                if(txtOldPwd.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Enter Your old password", Toast.LENGTH_SHORT).show();
                }
                //else if(check old password is correct){
                    //msg;
                //}
                else if(txtNewPwd.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Create a new password", Toast.LENGTH_SHORT).show();
                }
                else if (txtNewPwd.getText().length()<8) {
                    Toast.makeText(getApplicationContext(), "please enter minimum 8 charecters for password", Toast.LENGTH_SHORT).show();
                }
                else if (!(txtNewPwd.getText().toString().matches(psdptrn))) {
                    Toast.makeText(getApplicationContext(), "please enter a valid password", Toast.LENGTH_SHORT).show();
                }
                else if(txtRepwd.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Reenter  password", Toast.LENGTH_SHORT).show();
                }

                else if(!(txtRepwd.getText().toString().matches(p))){
                    Toast.makeText(getApplicationContext(), "Entered Password are not same", Toast.LENGTH_SHORT).show();
                }
                else{
                    //details added to database
                    Toast.makeText(getApplicationContext(), "Password changed ", Toast.LENGTH_SHORT).show();
                    //txtFn.setText("registered");
                }
            }
        });


    }
}