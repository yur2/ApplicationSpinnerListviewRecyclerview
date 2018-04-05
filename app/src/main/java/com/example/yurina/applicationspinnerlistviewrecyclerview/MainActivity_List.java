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

import Data.DiseaseData;

public class MainActivity_List extends AppCompatActivity {

    private ListView listView;
    public ArrayList<DiseaseData> datas;
    public DiseaseData data;


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


        data = new DiseaseData();

        data.setDiseaseName("눈");
        data.setDiseaseDesc("눈에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.eye);
        data.setDiseaseImg2(R.mipmap.eyedetail);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("입");
        data.setDiseaseDesc("입에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.lip);
        data.setDiseaseImg2(R.mipmap.lipdetail);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("척추");
        data.setDiseaseDesc("척추에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.back);
        data.setDiseaseImg2(R.mipmap.backdetail);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("미세먼지");
        data.setDiseaseDesc("미세먼지에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.air);
        data.setDiseaseImg2(R.mipmap.airdetail);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("손");
        data.setDiseaseDesc("손에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.hand);
        data.setDiseaseImg2(R.mipmap.handdetail);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("감기");
        data.setDiseaseDesc("감기에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.cold);
        data.setDiseaseImg2(R.mipmap.colddetail);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("암");
        data.setDiseaseDesc("암에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.disease1);
        data.setDiseaseImg2(R.mipmap.disease);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("질병");
        data.setDiseaseDesc("질병에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.diseases1);
        data.setDiseaseImg2(R.mipmap.diseases);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("우울");
        data.setDiseaseDesc("우울증에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.melancolie1);
        data.setDiseaseImg2(R.mipmap.melancolie);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("건강음식");
        data.setDiseaseDesc("건강음식에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.healthfood1);
        data.setDiseaseImg2(R.mipmap.healthfood);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("폭염");
        data.setDiseaseDesc("폭염에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.hothot1);
        data.setDiseaseImg2(R.mipmap.hothot);

        datas.add(data);

        data = new DiseaseData();

        data.setDiseaseName("수면");
        data.setDiseaseDesc("수면에 대한 건강 상식");
        data.setDiseaseImg(R.mipmap.sleep1);
        data.setDiseaseImg2(R.mipmap.sleep);

        datas.add(data);


    }


    class CustomAdapter extends BaseAdapter {

        ArrayList<DiseaseData> datas;
        LayoutInflater inflater;
        Context context;

        public CustomAdapter(ArrayList<DiseaseData> datas, Context context) {
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
            Glide.with(context).load(datas.get(position).getDiseaseImg()).into(imageView);

            textView.setText(datas.get(position).getDiseaseName());
            textview.setText(datas.get(position).getDiseaseDesc());

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("getDiseaseName", datas.get(position).getDiseaseName());
                    intent.putExtra("getDiseaseImg", datas.get(position).getDiseaseImg());
                    intent.putExtra("getDiseaseDesc", datas.get(position).getDiseaseDesc());
                    intent.putExtra("getDiseaseImg2",datas.get(position).getDiseaseImg2());


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

