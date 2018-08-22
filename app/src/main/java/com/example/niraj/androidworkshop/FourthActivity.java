package com.example.niraj.androidworkshop;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONObject;

public class FourthActivity extends AppCompatActivity {


    TextView t1,t2,t3,t4;
    String name,mobile,address,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        t1=findViewById(R.id.name6);
        t2=findViewById(R.id.textView7);
        t3=findViewById(R.id.textView8);
        t4=findViewById(R.id.textView9);

        SharedPreferences sharedPreferences = getSharedPreferences("MainActivity",Context.MODE_PRIVATE);
if(sharedPreferences.contains("info")){
    try{
        JSONObject j = new JSONObject(sharedPreferences.getString("info",""));
        name=j.getString("Name");
        mobile=j.getString("Mobile");
        address=j.getString("Address");
        email=j.getString("Email");

    }catch (Exception e)
    {
        e.printStackTrace();
    }

    t1.setText(name);
    t2.setText(mobile);
    t3.setText(address);
    t4.setText(email);
}



        Intent intent = getIntent();


        name = intent.getStringExtra("Name");
        mobile = intent.getStringExtra("Mobile");
        address = intent.getStringExtra("Address");
        email = intent.getStringExtra("E-mail");









    }
}
