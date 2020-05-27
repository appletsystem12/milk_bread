package com.milk.bread.milkandbread;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MyAccount extends AppCompatActivity {
    ImageButton back;
    Button edit,wallets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        setContentView(R.layout.activity_my_account);
        back=findViewById(R.id.backbutton);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MyAccount.this,Home.class);
                startActivity(i);
            }
        });

        edit=findViewById(R.id.edit);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MyAccount.this,Edit_Account.class);
                startActivity(intent1);
            }
        });

        wallets=findViewById(R.id.wallets);
        wallets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =  new Intent(MyAccount.this,Wallet.class);
                startActivity(intent2);
            }
        });
    }
}
