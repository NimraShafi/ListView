package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] std = {"Nimra", "Shafi", "Hira","Farah","Shabnam","shaharyar","Shahzaib","Laiba","Areeba","Ali","Kainat","Jannat","Ahmed","Khan","Areesha","Aliza","Kinza","Hadiqah","Zainab"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,std);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 2) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (position == 5){
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                }
            }
        });
   }
}