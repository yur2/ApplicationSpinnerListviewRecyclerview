package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class List_ub_Activity extends AppCompatActivity {
    private TextView text;
    private List<String> data;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ub_);

        ListView listView = (ListView) findViewById(R.id.listview);
        text = (TextView) findViewById(R.id.text);
        Button nextbtn2 = (Button) findViewById(R.id.nextbtn2);

        init();

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                String selected_text = (String) adapterView.getItemAtPosition(position);
//
//                text.setText(selected_text);
                Toast.makeText(List_ub_Activity.this, adapterView.getSelectedItem().toString(),Toast.LENGTH_LONG).show();


            }
        });


        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_ub_Activity.this, recyclerviewActivity.class);
                startActivity(intent);

            }
        });


    }

    private void init() {
        data = new ArrayList<>();
        data.add("book");
        data.add("cloth");
        data.add("shoes");
        data.add("tie");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
    }


}


//    public class Listview {
//        private int a;
//        private String b;
//
//        public int getA() {
//            return a;
//        }
//
//        public String getB() {
//            return b;
//        }
//
//        public void setA(int a) {
//            this.a = a;
//        }
//
//        public void setB(String b) {
//            this.b = b;
//        }
//    }


//        Listview book = new Listview();
//        Listview cloth = new Listview();
//        Listview shoes = new Listview();


//        Intent aa = getIntent();
//
//        String style = aa.getStringExtra("style1");