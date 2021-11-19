package com.example.mainmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void donateActivity(View view){
        Toast.makeText(getApplicationContext(), "opening", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, donate.class);
        startActivity(intent);

    }
    public void gethelpActivity(View view){
        Toast.makeText(getApplicationContext(), "opening", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, getHelp.class);
        startActivity(intent);

    }
    public void volunteerActivity(View view){
        Toast.makeText(getApplicationContext(), "opening", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, volunteer.class);
        startActivity(intent);

    }
}