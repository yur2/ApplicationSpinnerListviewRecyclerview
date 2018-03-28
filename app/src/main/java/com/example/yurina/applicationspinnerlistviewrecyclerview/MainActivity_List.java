package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import Data.FruitData;

public class
MainActivity_List extends AppCompatActivity {

    private ListView listView;
    ArrayList<FruitData> datas;
    FruitData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__list);

        datas = new ArrayList<>();
        dataLoader();

        listView = findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter(datas, this);
        listView.setAdapter(customAdapter);


    }


    private void dataLoader() {

        data = new FruitData();

        data.setFruitName("눈");
        data.setFruitDesc("눈에 대한 건강 상식");
        data.setFruitImg(R.mipmap.eye);
        //data.setFruitImg(Glide.with(this).load("http://cfile10.uf.tistory.com/image/272E043C51A54D3F05F7FF"));


        datas.add(data);

        data = new FruitData();

        data.setFruitName("입");
        data.setFruitDesc("입에 대한 건강 상식");
        data.setFruitImg(R.mipmap.lip);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("척추");
        data.setFruitDesc("척추에 대한 건강 상식");
        data.setFruitImg(R.mipmap.back);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("미세먼지");
        data.setFruitDesc("미세먼지에 대한 건강 상식");
        data.setFruitImg(R.mipmap.air);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("손");
        data.setFruitDesc("손에 대한 건강 상식");
        data.setFruitImg(R.mipmap.hand);

        datas.add(data);
        data = new FruitData();

        data.setFruitName("감기");
        data.setFruitDesc("감기에 대한 건강 상식");
        data.setFruitImg(R.mipmap.cold);

        datas.add(data);
        data = new FruitData();

        data.setFruitName("입");
        data.setFruitDesc("입에 대한 건강 상식");
        data.setFruitImg(R.mipmap.lip);

        datas.add(data);


//        data.FruitName = "strawberry";
//        data.FruitDesc = "귀 귀요밍 귀";
//        data.FruitImg = R.mipmap.strawberry;
//
//        datas.add(data);
//
//        data.FruitName = "avocado";
//        data.FruitDesc = "내가 젤 좋아흐는 놈";
//        data.FruitImg = R.mipmap.avocado;
//
//        datas.add(data);


//        (R.mipmap.avocado, "avocado", "내가 젤 좋아흐는 놈"));
//        (R.mipmap.kiwe, "kiwi", "새콤이달콩잉"));
//        (R.mipmap.peach, "peach", "향개좋~"));
//        (R.mipmap.banana, "banana", "나보면 바나나"));
//        (R.mipmap.cherry, "cherry", "둘이먹다 하나가죽어도모른다능"));
//        (R.mipmap.mango, "mango", "필리핀이 진리지"));
//        (R.mipmap.pear, "pear", "배애애애뱀"));
//        (R.mipmap.pineapple, "pineapple", "썩은 사과는?"));
//        (R.mipmap.melon, "melon", "지리고 오지고 노란색도 있찌여"));
    }

    static class CustomAdapter extends BaseAdapter {

        ArrayList<FruitData> datas;
        LayoutInflater inflater;
        Context context;

        public CustomAdapter(ArrayList<FruitData> datas, Context context) {
            this.context = context;
            this.datas = datas;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        // 데이터의 전체 크기를 반환해주는 메소드
        @Override
        public int getCount() {

            return datas.size();
        }

        // 데이터의 값을 반환해주는 메소드
        @Override
        public Object getItem(int position) {


            return datas.get(position);
        }

        // 눌린 item의 번호를 리턴해주는 메소드
        @Override
        public long getItemId(int position) {


            return position;


        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                convertView = inflater.inflate(R.layout.item, null);
            }
            // FindViewById
            ImageView imageView = convertView.findViewById(R.id.imageView);
            TextView textView = convertView.findViewById(R.id.textView);
            TextView textview = convertView.findViewById(R.id.textview);
            Button btn = convertView.findViewById(R.id.btn1);

            // setData
            Glide.with(context).load(datas.get(position).getFruitImg()).into(imageView);
            // Glide.with(context).load("http://ext.fmkorea.com/files/attach/new/20170811/486616/638771632/739224727/99b983892094b5c6d2fc3736e15da7d1.jpg");

            textView.setText(datas.get(position).getFruitName());
            textview.setText(datas.get(position).getFruitDesc());

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailActivity.class);
                    context.startActivity(intent);
                }
            });


            // 1. Call by vaule, Call by reference 차이점
            // 2. Glide 사용법
            // >> RecyclerView 신경쓰지말고
            // >> listView 로만 좀 데이터다운 데이터를 셋팅하고
            // >> 과일 이딴거 말고
            // 아이템에 더 많은 데이터가 들어가는걸로 꼴랑 이미지하나 텍스트하나큰 너무 양아치같음


            return convertView;
        }


    }
}