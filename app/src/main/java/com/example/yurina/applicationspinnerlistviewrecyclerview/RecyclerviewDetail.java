package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

import Data.DiseaseData;


public class RecyclerviewDetail extends AppCompatActivity {

    ArrayList<DiseaseData> array2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        DiseaseData save= new DiseaseData();

        save.setDiseaseName(intent.getExtras().getString("getDiseaseName"));
        save.setDiseaseImg(intent.getExtras().getInt("getDiseaseImg"));
        save.setDiseaseDesc(intent.getExtras().getString("getDiseaseDesc"));
        save.setDiseaseImg2(intent.getExtras().getInt("getDiseaseImg2"));



        imageView = findViewById(R.id.image2);

        imageView.setImageResource(save.getDiseaseImg2());

        Button backbtn = (Button) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerviewDetail.this, MainActivity_List.class);
                startActivity(intent);
            }
        });
    }

}
