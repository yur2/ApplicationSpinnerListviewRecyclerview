package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import Data.FruitData;

public class DetailActivity extends AppCompatActivity {

    ArrayList<FruitData> datas;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        FruitData data = new FruitData();

        data.setFruitName(intent.getExtras().getString("getFruitName"));
        data.setFruitImg(intent.getExtras().getInt("getFruitImg"));
        data.setFruitDesc(intent.getExtras().getString("getFruitDesc"));
        data.setDetailImg(intent.getExtras().getInt("getDetailImg"));

        imageView = findViewById(R.id.image2);

        imageView.setImageResource(data.getDetailImg());

        Button backbtn = (Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, MainActivity_List.class);
                startActivity(intent);
            }
        });
    }
}

