package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    private Button birinciButon;
    private Button ikinciButon;
    private Button ucuncuButon;
    private Button dorduncuButon;
    private Button besinciButon;
    private Button altıncıButon;

    private Button butYerbir;
    private Button butYeriki;
    private Button butYeruc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        birinciButon=(Button)findViewById(R.id.lay4but1);
        birinciButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent birinciButon=new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(birinciButon);
            }
        });

        ikinciButon=(Button)findViewById(R.id.lay4but2);
        ikinciButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ikinciButon=new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(ikinciButon);
            }
        });

        ucuncuButon=(Button)findViewById(R.id.lay4but3);
        ucuncuButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ucuncuButon=new Intent(MainActivity4.this,MainActivity7.class);
                startActivity(ucuncuButon);
            }
        });

        dorduncuButon=(Button) findViewById(R.id.lay4but4);
        dorduncuButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dorduncuButon=new Intent(MainActivity4.this,MainActivity8.class);
                startActivity(dorduncuButon);
            }
        });

        besinciButon=(Button)findViewById(R.id.lay4but5);
        besinciButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent besinciButon=new Intent(MainActivity4.this,MainActivity9.class);
                startActivity(besinciButon);
            }
        });

        butYerbir=(Button) findViewById(R.id.button10);
        butYerbir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butYerbir=new Intent(MainActivity4.this,MainActivity10.class);
                startActivity(butYerbir);
            }
        });

        butYeriki=(Button) findViewById(R.id.button9);
        butYeriki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butYeriki=new Intent(MainActivity4.this,MainActivity11.class);
                startActivity(butYeriki);
            }
        });

        butYeruc=(Button) findViewById(R.id.button14);
        butYeruc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butYeruc=new Intent(MainActivity4.this,MainActivity12.class);
                startActivity(butYeruc);
            }
        });

        altıncıButon=(Button) findViewById(R.id.button13);
        altıncıButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent altıncıButon=new Intent(MainActivity4.this,MainActivity12.class);
                startActivity(altıncıButon);
            }
        });













    }
}