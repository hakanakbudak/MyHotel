package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    private Button ayar;
    private Button harita;
    private Button ev;
    private Button mesaj;
    private Button kullanıcı;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        ayar=(Button)findViewById(R.id.setget2);
        ayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayar=new Intent(MainActivity9.this,MainActivity11.class);
                startActivity(ayar);
            }
        });

        harita=(Button)findViewById(R.id.locget2);
        harita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent harita=new Intent(MainActivity9.this,MainActivity10.class);
                startActivity(harita);
            }
        });

        ev=(Button) findViewById(R.id.buttonHomethree);
        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ev=new Intent(MainActivity9.this,MainActivity4.class);
                startActivity(ev);
            }
        });

        mesaj=(Button) findViewById(R.id.mesget2);
        mesaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mesaj=new Intent(MainActivity9.this,MainActivity13.class);
                startActivity(mesaj);
            }
        });

        kullanıcı=(Button) findViewById(R.id.useget2);
        kullanıcı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kullanıcı=new Intent(MainActivity9.this,MainActivity12.class);
                startActivity(kullanıcı);
            }
        });


    }
}