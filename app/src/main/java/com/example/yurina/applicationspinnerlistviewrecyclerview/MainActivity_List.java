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

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class
MainActivity_List extends AppCompatActivity {

    private ListView listView;
    ArrayList<CustomAdapter.Item> datas;

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
        datas.add(new CustomAdapter.Item(R.mipmap.tomato, "tomoato", "토메이토 토네이도"));
        datas.add(new CustomAdapter.Item(R.mipmap.apple, "apple", "먹으면 이뻐진데~"));
        datas.add(new CustomAdapter.Item(R.mipmap.strawberry, "strawberry", "귀 귀요밍 귀"));
        datas.add(new CustomAdapter.Item(R.mipmap.avocado, "avocado", "내가 젤 좋아흐는 놈"));
        datas.add(new CustomAdapter.Item(R.mipmap.kiwe, "kiwi", "새콤이달콩잉"));
        datas.add(new CustomAdapter.Item(R.mipmap.peach, "peach", "향개좋~"));
        datas.add(new CustomAdapter.Item(R.mipmap.banana, "banana", "나보면 바나나"));
        datas.add(new CustomAdapter.Item(R.mipmap.cherry, "cherry", "둘이먹다 하나가죽어도모른다능"));
        datas.add(new CustomAdapter.Item(R.mipmap.mango, "mango", "필리핀이 진리지"));
        datas.add(new CustomAdapter.Item(R.mipmap.pear, "pear", "배애애애뱀"));
        datas.add(new CustomAdapter.Item(R.mipmap.pineapple, "pineapple", "썩은 사과는?"));
        datas.add(new CustomAdapter.Item(R.mipmap.melon, "melon", "지리고 오지고 노란색도 있찌여"));
    }

    static class CustomAdapter extends BaseAdapter {

        ArrayList<Item> datas;
        LayoutInflater inflater;
        Context context;

        public CustomAdapter(ArrayList<Item> datas, Context context) {
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
            ImageView imageView = convertView.findViewById(R.id.imageView);
            imageView.setImageResource(datas.get(position).imageView);

            TextView textView = convertView.findViewById(R.id.textView);
            textView.setText(datas.get(position).textView);

            TextView textview = convertView.findViewById(R.id.textview);
            textview.setText(datas.get(position).textview);

            Button btn1 = convertView.findViewById(R.id.btn1);
            final View finalConvertView = convertView;
            final View finalConvertView1 = convertView;
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(finalConvertView.getContext(), recyclerviewActivity.class);
                    context.startActivity(intent);
                }
            });


            return convertView;
        }


}