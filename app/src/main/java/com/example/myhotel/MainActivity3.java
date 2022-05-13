package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.nio.channels.Channels;

public class MainActivity3 extends AppCompatActivity {


    private FloatingActionButton okeyTusu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        okeyTusu=(FloatingActionButton) findViewById(R.id.btnokayone);
        okeyTusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent okeyle=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(okeyle);
            }
        });









    }
}