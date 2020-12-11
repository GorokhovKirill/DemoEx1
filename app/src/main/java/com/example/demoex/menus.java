package com.example.demoex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class menus extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menus);
    }
    public void onClickSettings(View v) {
        TextView textView22 = (TextView) findViewById(R.id.textView22);
        Intent o = new Intent(menus.this, Settings.class);
        startActivity(o);
        finish();
    }
    public void onClickHistory(View v) {
        TextView textView21 = (TextView) findViewById(R.id.textView21);
        Intent o = new Intent(menus.this, History.class);
        startActivity(o);
        finish();
    }
}
