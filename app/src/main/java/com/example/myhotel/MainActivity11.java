package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity11 extends AppCompatActivity {

    private Button butYerbir;
    private Button butYeriki;
    private Button butYeruc;
    private Button butYerdorduncu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        butYerbir=(Button)findViewById(R.id.button10);
        butYerbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butYerbir=new Intent(MainActivity11.this,MainActivity11.class);
                startActivity(butYerbir);
            }
        });

        butYeriki=(Button)findViewById(R.id.button12);
        butYeriki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butYeriki=new Intent(MainActivity11.this,MainActivity4.class);
                startActivity(butYeriki);
            }
        });

        butYeruc=(Button) findViewById(R.id.button13);
        butYeruc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butYeruc=new Intent(MainActivity11.this,MainActivity13.class);
                startActivity(butYeruc);
            }
        });

        butYerdorduncu=(Button) findViewById(R.id.button14);
        butYerdorduncu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dorduncuButon=new Intent(MainActivity11.this,MainActivity12.class);
                startActivity(dorduncuButon);
            }
        });




    }
}