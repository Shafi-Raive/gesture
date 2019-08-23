package com.example.shafi.gesture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shafi.gesture.adapter.custom;

public class MainActivity extends AppCompatActivity {

    String[] title, dsc;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        custom custom;
        recyclerView = findViewById(R.id.recyclerView);
        title = getResources().getStringArray(R.array.name);
        dsc = getResources().getStringArray(R.array.name1);

        custom = new custom(MainActivity.this, title, dsc);

        recyclerView.setAdapter(custom);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
