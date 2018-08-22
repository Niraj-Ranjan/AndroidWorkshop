package com.example.niraj.androidworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e,e2;


    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.l);
        e2=(EditText)findViewById(R.id.l2);

        b=(Button)findViewById(R.id.button);

    }

    public void log(View v)
    {
        String p=e2.getText().toString();
        String l=e.getText().toString();

        if(l=="admin"&&p=="pass")
        {
            Intent i=new Intent(this,Login.class);
            startActivity(i);

        }
    }


    public void register(View v)
    {

        Intent i=new Intent(this,RegisterActivity.class);
        startActivity(i);




    }
}
