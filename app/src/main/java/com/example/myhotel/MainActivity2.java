package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private ListView aListView;
    private ArrayAdapter<String> adapter;
    private String[] oteller={"Grand Asya ","Bandırma Palas Hotel","Eken Hotel"};

    private Intent detailsIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        aListView=(ListView) findViewById(R.id.listoteller);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,oteller);
        aListView.setAdapter(adapter);

        aListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                detailsIntent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(detailsIntent);
            }
        });




    }
}