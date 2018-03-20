package com.example.yurina.applicationspinnerlistviewrecyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;


public class recyclerviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridLayoutManager layoutManager;
    private ArrayList<Data2> array2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(layoutManager);

        Adapter2 arrayAdapter2 = new Adapter2();
        recyclerView.setAdapter(arrayAdapter2);

        //recyclerviewActivity adapter = new recyclerviewActivity(getActivity(),R.layout.)

//        array2.add("potato");
//        array2.add("sweat potato");
//        array2.add("tomato");
//        array2.add("lettuce");

        array2.add(new Data2("strawberry", R.mipmap.strawberry));
        array2.add(new Data2("apple", R.mipmap.apple));
        array2.add(new Data2("tomato", R.mipmap.tomato));


    }
}

class Adapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    int images[] = {R.mipmap.apple, R.mipmap.strawberry, R.mipmap.tomato};


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //holder.apple.setImageResource(Data2.get(position).img);
                //setImageResource(images[position]);v

    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    private class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView apple, strawberry, tomato;

        public ViewHolder(View view) {

            super(view);

            apple = (ImageView) view.findViewById(R.id.apple);
            strawberry = (ImageView) view.findViewById(R.id.strawberry);
            tomato = (ImageView) view.findViewById(R.id.tomato);

        }
    }
}





