package com.example.yurina.applicationspinnerlistviewrecyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class MainActivity_List extends AppCompatActivity {

    private ListView listView;
    //    TextView textView;
    private Myadapter myadapter;

    //ArrayList<String> datas = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__list);


        listView = (ListView) findViewById(R.id.listview);
//        myadapter = new Myadapter();

        //어뎁터에 아이템 추가
//        myadapter.addItem("apple", R.mipmap.apple);
//        myadapter.addItem("strawberry", R.mipmap.strawberry);
//        myadapter.addItem("tomato", R.mipmap.tomato);
        myadapter.addItem("apple", 3);
//

        listView.setAdapter(myadapter);
    }
}


class Myadapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<Item> arrayList;
    LayoutInflater inflater;

    public Myadapter(Context context, int layout, ArrayList<Item> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            //LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context, Layout_In)
            convertView = inflater.inflate(R.layout.activity_main__list, parent, false);
        }
        TextView text1 = (TextView) convertView.findViewById(R.id.text1);
        ImageView image1 = (ImageView) convertView.findViewById(R.id.image1);

        GridLayout gridLayout = (GridLayout) convertView.findViewById(R.id.gridlayout);

        Item item  = arrayList.get(position);

        text1.setText(arrayList.get(position).getContent());
        image1.setImageResource(arrayList.get(position).getImg());
//
//        gridLayout.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                arrayList.remove(position);
////            Intent intent = new Intent(MainActivity_List.this, recyclerviewActivity.class);
////            startAc
//
//            }
//        });
//

        return convertView;
    }

    public void addItem(String content, int img) {
        Item item = new Item();
        item.setContent(content);
        item.setImg(img);

        arrayList.add(item);

    }

}


class Item {
    String content;
    int img;
//
//    public Item(String content, int img) {
//        this.content = content;
//        this.img = img;
//    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }


//    public void addItem(String content, int img) {
//        Item item = new Item();
//        item.setContent(content);
//        item.setImg(img);
//
//        Item.add(item);
//    }

}
//        setContentView(R.layout.activity_main__list);
//
//        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//        GridLayout gridLayout = (GridLayout) findViewById(R.id.gridlayout);
//inflater.inflate(R.layout.)

// ImageView imageView = (ImageView)inflater.inflate(R.layout.)

// LayoutInflater inflater1 = LayoutInflater.from(context);

//        for (int i = 0; i < 100; i++) {
//            datas.add(i + "");
//
//        }
//        datas.add("나는");
//        datas.add("귀요밍");
//        datas.add("뀨");
//
//        listView = findViewById(R.id.listview);
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, datas);
//
//        listView.setAdapter(adapter);

//        convertView = Inflater.inflate(layoutId, parent,false);
//
//        TextView text2 = (TextView)convertView.findViewById(R.id.text2);
//        text2.setText(datas.get(position).phone);
//        ImageView image1 = (ImageView)convertView.findViewById(R.id.image1);

//        String[] content = {"apple","strawberry","tomato"};
//        int[] img = {R.mipmap.apple, R.mipmap.strawberry, R.mipmap.tomato};

//        String[] strDate = {"2017-01-03", "1965-02-23", "2016-04-13", "2010-01-01", "2017-06-20",
//                "2012-07-08", "1980-04-14", "2016-09-26", "2014-10-11", "2010-12-24"};
//        int nDatCnt=0;
//        ArrayList<Item> oData = new ArrayList<>();
//        for (int i=0; i<1000; ++i)
//        {
//            Item oItem = new Item();
//            oItem.content = "데이터 " + (i+1);
//            oItem.img = img[nDatCnt++];
//            oData.add(oItem);
//            if (nDatCnt >= content.length) nDatCnt = 0;
//        }
//
//        listView = (ListView)findViewById(R.id.listview);
//        Myadapter myadapter = new Myadapter(oData);
//        listView.setAdapter(myadapter);