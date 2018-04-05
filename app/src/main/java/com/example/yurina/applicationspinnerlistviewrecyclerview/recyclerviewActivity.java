package com.example.yurina.applicationspinnerlistviewrecyclerview;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Data.DiseaseData;


public class recyclerviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private ArrayList<DiseaseData> array2;
    private DiseaseData save;
    private Adapter2 adapter2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        array2 = new ArrayList<>();

        values();

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter2 = new Adapter2(array2, this);
        recyclerView.setAdapter(adapter2);


    }

    private void values() {
        save = new DiseaseData();

        save.setDiseaseName("눈");
        save.setDiseaseDesc("눈에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.eye);
        save.setDiseaseImg2(R.mipmap.eyedetail);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("입");
        save.setDiseaseDesc("입에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.lip);
        save.setDiseaseImg2(R.mipmap.lipdetail);

        array2.add(save);


    }
}

class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {
    ArrayList<DiseaseData> array2;
    LayoutInflater inflater;
    Context context;

    public Adapter2(ArrayList<DiseaseData> array2, Context context) {
        this.context = context;
        this.array2 = array2;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(array2.get(position).getDiseaseImg());
        holder.textView.setText((array2.get(position).getDiseaseName()));
        holder.textview.setText(array2.get(position).getDiseaseDesc());

    }

    @Override
    public int getItemCount() {

        return array2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ImageView imageView;
        public TextView textView;
        public TextView textview;
        public Button btn1;

        public ViewHolder(final View view) {

            super(view);

            imageView = (ImageView) view.findViewById(R.id.imageView);
            textView = (TextView) view.findViewById(R.id.textView);
            textview = (TextView) view.findViewById(R.id.textview);
            btn1 = (Button) view.findViewById(R.id.btn1);

//            view.setOnClickListener(this);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, RecyclerviewDetail.class);
                    intent.putExtra("getDiseaseName", array2.get(getAdapterPosition()).getDiseaseName());
                    intent.putExtra("getDiseaseImg", array2.get(getAdapterPosition()).getDiseaseImg());
                    intent.putExtra("getDiseaseDesc", array2.get(getAdapterPosition()).getDiseaseDesc());
                    intent.putExtra("getDiseaseImg2", array2.get(getAdapterPosition()).getDiseaseImg2());

                    context.startActivity(intent);
                }
            });


        }
    }
}

//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(context, RecyclerviewDetail.class);
//            intent.putExtra("getFruitName", array2.get(getAdapterPosition()).getFruitName());
//            intent.putExtra("getFruitImg", array2.get(getAdapterPosition()).getFruitImg());
//            intent.putExtra("getFruitDesc", array2.get(getAdapterPosition()).getFruitDesc());
//            intent.putExtra("getDetailImg", array2.get(getAdapterPosition()).getDetailImg());
//
//            context.startActivity(intent);
//
//        }
//    }








