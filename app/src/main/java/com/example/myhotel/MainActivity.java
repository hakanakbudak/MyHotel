package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnHosgeldin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHosgeldin=(Button)findViewById(R.id.buttonwelcome);
        btnHosgeldin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent basla=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(basla);
            }
        });





    }

}
