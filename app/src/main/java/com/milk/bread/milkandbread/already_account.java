package com.milk.bread.milkandbread;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class already_account extends AppCompatActivity {
    TextView logins,forgot,create;
    ImageView log;
    EditText username,password;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_already_account);

        log=findViewById(R.id.logo); // logo is here
        logins=findViewById(R.id.login); // text view login account
        username=findViewById(R.id.username); // Enter the username
        password=findViewById(R.id.password);//Enter the password
        submit=findViewById(R.id.submit);//submit ur password
        submit.setOnClickListener(new View.OnClickListener() { // When we click on the submit button
            @Override
            public void onClick(View v) {
                Intent i = new Intent(already_account.this, Home.class);
                startActivity(i);
            }
        });


        forgot=findViewById(R.id.forgot);//forgot password
        forgot.setOnClickListener(new View.OnClickListener() { // When we click on the forgot password button
            @Override
            public void onClick(View v) {

            }
        });


        create=findViewById(R.id.create_account); //It is used when a new user wants to register himself
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(already_account.this, Number.class);
               startActivity(i);
            }
        });
    }

}
