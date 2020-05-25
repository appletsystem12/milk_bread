package com.milk.bread.milkandbread;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Form_Details extends AppCompatActivity {
    TextView contact;
    ImageView logo;
    EditText pin,society,blk,flat,name,email;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__details);

        logo=findViewById(R.id.logo); // logo is here
        contact=findViewById(R.id.contact); // enter the cotact details
        pin=findViewById(R.id.Pincode); // Enter the pincode here
        society=findViewById(R.id.society);//Enter the society
        blk=findViewById(R.id.blk);//Enter the block code
        flat=findViewById(R.id.flat);//Enter the flat no.
        name=findViewById(R.id.name);//Enter the full name
        email=findViewById(R.id.email);//Enter the email id
        submit=findViewById(R.id.submit);// submit the form
        submit.setOnClickListener(new View.OnClickListener() { // submit button will send all the application form to the database.
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Form_Details.this, Home.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Form submitted",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
