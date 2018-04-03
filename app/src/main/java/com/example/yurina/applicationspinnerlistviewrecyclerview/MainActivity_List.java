package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import Data.FruitData;

public class MainActivity_List extends AppCompatActivity {

    private ListView listView;
    public ArrayList<FruitData> datas;
    public FruitData data;


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
        data.setDetailImg(R.mipmap.eyedetail);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("입");
        data.setFruitDesc("입에 대한 건강 상식");
        data.setFruitImg(R.mipmap.lip);
        data.setDetailImg(R.mipmap.lipdetail);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("척추");
        data.setFruitDesc("척추에 대한 건강 상식");
        data.setFruitImg(R.mipmap.back);
        data.setDetailImg(R.mipmap.backdetail);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("미세먼지");
        data.setFruitDesc("미세먼지에 대한 건강 상식");
        data.setFruitImg(R.mipmap.air);
        data.setDetailImg(R.mipmap.airdetail);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("손");
        data.setFruitDesc("손에 대한 건강 상식");
        data.setFruitImg(R.mipmap.hand);
        data.setDetailImg(R.mipmap.handdetail);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("감기");
        data.setFruitDesc("감기에 대한 건강 상식");
        data.setFruitImg(R.mipmap.cold);
        data.setDetailImg(R.mipmap.colddetail);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("암");
        data.setFruitDesc("암에 대한 건강 상식");
        data.setFruitImg(R.mipmap.disease1);
        data.setDetailImg(R.mipmap.disease);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("질병");
        data.setFruitDesc("질병에 대한 건강 상식");
        data.setFruitImg(R.mipmap.diseases1);
        data.setDetailImg(R.mipmap.diseases);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("우울");
        data.setFruitDesc("우울증에 대한 건강 상식");
        data.setFruitImg(R.mipmap.melancolie1);
        data.setDetailImg(R.mipmap.melancolie);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("건강음식");
        data.setFruitDesc("건강음식에 대한 건강 상식");
        data.setFruitImg(R.mipmap.healthfood1);
        data.setDetailImg(R.mipmap.healthfood);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("폭염");
        data.setFruitDesc("폭염에 대한 건강 상식");
        data.setFruitImg(R.mipmap.hothot1);
        data.setDetailImg(R.mipmap.hothot);

        datas.add(data);

        data = new FruitData();

        data.setFruitName("수면");
        data.setFruitDesc("수면에 대한 건강 상식");
        data.setFruitImg(R.mipmap.sleep1);
        data.setDetailImg(R.mipmap.sleep);

        datas.add(data);


    }


    class CustomAdapter extends BaseAdapter {

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
        public View getView(final int position, View convertView, ViewGroup parent) {

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

            textView.setText(datas.get(position).getFruitName());
            textview.setText(datas.get(position).getFruitDesc());

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("getFruitName", datas.get(position).getFruitName());
                    intent.putExtra("getFruitImg", datas.get(position).getFruitImg());
                    intent.putExtra("getFruitDesc", datas.get(position).getFruitDesc());
                    intent.putExtra("getDetailImg",datas.get(position).getDetailImg());


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

