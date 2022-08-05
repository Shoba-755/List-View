package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - Declare ListView
        ListView listview = findViewById(R.id.lview);

        // 2 - Data Source
        String[] androidVerisons={
                "Lollipop",
                "Oreo",
                "kitkat",
                "Marshmellow",
                "Android 11",
                "Android 12"
        };

        // 3 -  Adapter = ArrayAdapter
        ArrayAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                androidVerisons
        );
        listview.setAdapter(adapter);
    }
}