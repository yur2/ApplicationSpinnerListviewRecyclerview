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
    private ArrayList<DiseaseData> array2;
    private DiseaseData save;
    private Adapter2 adapter2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        array2 = new ArrayList<>();
        values();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(new Adapter2(array2, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    private void values() {

        save = new DiseaseData();

        save.setDiseaseName("눈");
        save.setDiseaseDesc("눈에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.eye);
        save.setDiseaseImg2(R.mipmap.eyedetail);
       // save.setMusicImg("http://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/048/893/81048893_1522824043725_1_600x600.JPG");

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("입");
        save.setDiseaseDesc("입에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.lip);
        save.setDiseaseImg2(R.mipmap.lipdetail);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("척추");
        save.setDiseaseDesc("척추에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.back);
        save.setDiseaseImg2(R.mipmap.backdetail);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("미세먼지");
        save.setDiseaseDesc("미세먼지에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.air);
        save.setDiseaseImg2(R.mipmap.airdetail);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("손");
        save.setDiseaseDesc("손에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.hand);
        save.setDiseaseImg2(R.mipmap.handdetail);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("감기");
        save.setDiseaseDesc("감기에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.cold);
        save.setDiseaseImg2(R.mipmap.colddetail);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("암");
        save.setDiseaseDesc("암에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.disease1);
        save.setDiseaseImg2(R.mipmap.disease);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("질병");
        save.setDiseaseDesc("질병에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.diseases1);
        save.setDiseaseImg2(R.mipmap.diseases);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("우울");
        save.setDiseaseDesc("우울증에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.melancolie1);
        save.setDiseaseImg2(R.mipmap.melancolie);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("건강음식");
        save.setDiseaseDesc("건강음식에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.healthfood1);
        save.setDiseaseImg2(R.mipmap.healthfood);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("폭염");
        save.setDiseaseDesc("폭염에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.hothot1);
        save.setDiseaseImg2(R.mipmap.hothot);

        array2.add(save);

        save = new DiseaseData();

        save.setDiseaseName("수면");
        save.setDiseaseDesc("수면에 대한 건강 상식");
        save.setDiseaseImg(R.mipmap.sleep1);
        save.setDiseaseImg2(R.mipmap.sleep);

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

        View view = inflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        //Glide.with(context).load(Uri.parse(array2.get(position).getMusicImg())).into(holder.imageView);
        holder.imageView.setImageResource(array2.get(position).getDiseaseImg());
        holder.textView.setText((array2.get(position).getDiseaseName()));
        holder.textview.setText(array2.get(position).getDiseaseDesc());

        holder.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RecyclerviewDetail.class);

                intent.putExtra("getDiseaseName", array2.get(position).getDiseaseName());
                intent.putExtra("getDiseaseImg", array2.get(position).getDiseaseImg());
                intent.putExtra("getDiseaseDesc", array2.get(position).getDiseaseDesc());
                intent.putExtra("getDiseaseImg2", array2.get(position).getDiseaseImg2());

                context.startActivity(intent);
            }
        });

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

            imageView = view.findViewById(R.id.imageView);
            textView = view.findViewById(R.id.textView);
            textview = view.findViewById(R.id.textview);
            btn1 = view.findViewById(R.id.btn1);


        }
    }
}







