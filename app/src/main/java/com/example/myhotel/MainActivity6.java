package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    private Button ayar;
    private Button harita;
    private Button ev;
    private Button mesaj;
    private Button kullanıcı;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ayar=(Button)findViewById(R.id.setget1);
        ayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayar=new Intent(MainActivity6.this,MainActivity11.class);
                startActivity(ayar);
            }
        });

        harita=(Button)findViewById(R.id.locget1);
        harita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent harita=new Intent(MainActivity6.this,MainActivity10.class);
                startActivity(harita);
            }
        });

        ev=(Button) findViewById(R.id.buttonHometwo);
        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ev=new Intent(MainActivity6.this,MainActivity4.class);
                startActivity(ev);
            }
        });

        mesaj=(Button) findViewById(R.id.mesget1);
        mesaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesaj=new Intent(MainActivity6.this,MainActivity13.class);
                startActivity(mesaj);
            }
        });

        kullanıcı=(Button) findViewById(R.id.useget1);
        kullanıcı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kullanıcı=new Intent(MainActivity6.this,MainActivity12.class);
                startActivity(kullanıcı);
            }
        });

    }
}