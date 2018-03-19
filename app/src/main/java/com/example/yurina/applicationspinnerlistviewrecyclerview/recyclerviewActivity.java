package com.example.yurina.applicationspinnerlistviewrecyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class recyclerviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ArrayList<String> array2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        array2.add("potato");
        array2.add("sweat potato");
        array2.add("tomato");
        array2.add("lettuce");



    }
}
