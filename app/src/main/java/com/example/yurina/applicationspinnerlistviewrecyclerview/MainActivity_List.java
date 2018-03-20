package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_List extends AppCompatActivity {

    private ArrayAdapter<CharSequence> adapter;
    //private ArrayList<String> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__list);















//        init();

//        Button nextbtn = (Button) findViewById(R.id.nextbtn);
//
//        nextbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity_List.this, List_ub_Activity.class);
//                startActivity(intent);
//            }
//        });
    }
}

//    private void init() {
//        Spinner spinner = (Spinner) findViewById(R.id.spinner);
//
//
//        //String[] favorite = {"apple", "strawberry", "lemon", "onion", "pepper"};
////        array.add("apple");
////        array.add("banana");
////
////        adapter = ArrayAdapter.createFromResource(
////                this, R.array.spinner_array, android.R.layout.simple_spinner_item);
////        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
////        spinner.setAdapter(adapter);
//
//        //  adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, array);
//
//
//        adapter = ArrayAdapter.createFromResource(
//                this, R.array.spinner_array, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity_List.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//
//    }
//
//
//}

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
//                this, R.array.spinner_array, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
//
//    @Override
//    public void onClick(View v) {
//
//        String style = spinner.getSelectedItem().toString();
//        Intent aa = new Intent(this, List_ub_Activity.class);
//        aa.putExtra("style1", style);
//        startActivity(aa);
//
//
//    }


//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity_List.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });