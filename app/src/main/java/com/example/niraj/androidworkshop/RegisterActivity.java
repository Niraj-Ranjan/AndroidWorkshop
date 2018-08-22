package com.example.niraj.androidworkshop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.json.JSONObject;


public class RegisterActivity extends Activity {

    EditText name,mobile,address,email;
    public RadioGroup radioSexGroup;
    public RadioButton radioSexButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        radioSexGroup = findViewById(R.id.radiogroup);

        name=findViewById(R.id.editText4);
        mobile=findViewById(R.id.editText3);
        address=findViewById(R.id.editText5);
        email=findViewById(R.id.editText6);

        int selectedId=radioSexGroup.getCheckedRadioButtonId();
        radioSexButton=findViewById(selectedId);



    }


    public void regdata(View v)
    {
        String name1,mobile1,address1,email1;
        name1=name.getText().toString();
        mobile1=mobile.getText().toString();
        address1=address.getText().toString();
        email1=email.getText().toString();

        Intent i=new Intent(this,ThirdActivity.class);
        JSONObject jsonObject = new JSONObject();
        try{


            jsonObject.put("Name",name1);
            jsonObject.put("Mobile",mobile1);
            jsonObject.put("Address",address1);
            jsonObject.put("Email",email1);

        }catch (Exception e)
        {
            e.printStackTrace();

        }



        SharedPreferences sharedPreferences = getSharedPreferences("MainActivity", Context.MODE_PRIVATE);
SharedPreferences.Editor editor = sharedPreferences.edit();
editor.putString("info",jsonObject.toString());
editor.apply();




Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
 startActivity(intent);

    }
}
