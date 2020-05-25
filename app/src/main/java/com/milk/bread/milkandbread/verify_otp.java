package com.milk.bread.milkandbread;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class verify_otp extends AppCompatActivity {
    ImageView logo;
    TextView Register,Resend;
    EditText otp;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);

        logo=findViewById(R.id.logo); // logo is here
        Register=findViewById(R.id.registration);// Verify your Number
        otp=findViewById(R.id.Enter_otp);// otp must be entered here
        Resend=findViewById(R.id.resend);//resend otp
        Resend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        submit=findViewById(R.id.submit);//finally submit the credentials
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(verify_otp.this, Form_Details.class);
                startActivity(i);
            }
        });




    }
}
