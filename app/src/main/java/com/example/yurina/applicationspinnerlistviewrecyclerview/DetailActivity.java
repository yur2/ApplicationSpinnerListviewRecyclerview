package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView image2 = findViewById(R.id.image2);

        Intent intent = getIntent();
        MainActivity_List main = new MainActivity_List();

        if (main.datas.get(0).equals("눈")) {
            int data = intent.getIntExtra("eye", R.mipmap.eyedetail);
            image2.setImageResource(data);
        } else if (main.datas.get(3).equals("입")) {
            int data1 = intent.getIntExtra("lip", R.mipmap.lipdetail);
            image2.setImageResource(data1);
        } else if (main.datas.get(6).equals("척추")) {
            int data2 = intent.getIntExtra("back", R.mipmap.backdetail);
            image2.setImageResource(data2);
        } else if (main.datas.get(9).equals("미세먼지")) {
            int data3 = intent.getIntExtra("air", R.mipmap.airdetail);
            image2.setImageResource(data3);
        } else if (main.datas.get(12).equals("손")) {
            int data4 = intent.getIntExtra("hand", R.mipmap.handdetail);
            image2.setImageResource(data4);
        } else if (main.datas.get(15).equals("감기")) {
            int data5 = intent.getIntExtra("cold", R.mipmap.colddetail);
            image2.setImageResource(data5);
        }
        else if (main.datas.get(18).equals("암")) {
            int data5 = intent.getIntExtra("disease", R.mipmap.disease1);
            image2.setImageResource(data5);
        }
        else if (main.datas.get(21).equals("질병")) {
            int data5 = intent.getIntExtra("diseases1", R.mipmap.diseases1);
            image2.setImageResource(data5);
        }
        else if (main.datas.get(24).equals("우울")) {
            int data5 = intent.getIntExtra("melancolie", R.mipmap.melancolie1);
            image2.setImageResource(data5);
        }
        else if (main.datas.get(27).equals("건강음식")) {
            int data5 = intent.getIntExtra("healthfood", R.mipmap.healthfood1);
            image2.setImageResource(data5);
        }
        else if (main.datas.get(30).equals("폭염")) {
            int data5 = intent.getIntExtra("hothot", R.mipmap.hothot1);
            image2.setImageResource(data5);
        }
        else if (main.datas.get(33).equals("수면")) {
            int data5 = intent.getIntExtra("sleep", R.mipmap.sleep1);
            image2.setImageResource(data5);
        }


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


//        Bundle bundle = getIntent().getExtras();
//        String data = bundle.getString("eye");
//        String data1 = bundle.getString("lip");
//        String data2 = bundle.getString("back");

