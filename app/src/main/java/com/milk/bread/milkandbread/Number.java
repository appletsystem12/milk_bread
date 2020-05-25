package com.milk.bread.milkandbread;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Number extends AppCompatActivity {
    TextView login,Already;
    ImageView logo;
    EditText mobile;
    Button generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        logo=findViewById(R.id.logo); // logo is here
        login=findViewById(R.id.login); // text view login account
        mobile=findViewById(R.id.Enter_number); // Enter mobile number
        generate=findViewById(R.id.Generate); // Button to send otp
        generate.setOnClickListener(new View.OnClickListener() {   //  From here otp will be send
            @Override
            public void onClick(View v) {

            }
        });



        Already=findViewById(R.id.already);   // text button to go to registration
        Already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Number.this, verify_otp.class);
                startActivity(i);

            }
        });



    }
}
