package com.example.demoex;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singup);
    }
    public void onClickPass(View v){
        EditText pas1 = (EditText)findViewById(R.id.pass1);
        EditText pas2 = (EditText)findViewById(R.id.pass2);

        if(pas1.getText().toString().equals(pas2.getText().toString())){
            Toast.makeText(this, "Пароли совпадают", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Пароли не совпадают!", Toast.LENGTH_SHORT).show();
        }

    }
}
