package com.example.yurina.applicationspinnerlistviewrecyclerview;


import android.content.Context;
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
        layoutManager = new GridLayoutManager(recyclerviewActivity.this, 3);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        Adapter2 arrayAdapter2 = new Adapter2(array2, this);
        recyclerView.setAdapter(arrayAdapter2);


        array2.add(new Data2("strawberry", R.mipmap.strawberry));
        array2.add(new Data2("apple", R.mipmap.apple));
        array2.add(new Data2("tomato", R.mipmap.tomato));


    }
}

class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {
    ArrayList<Data2> array2;
    LayoutInflater inflater;
    Context context;

    public Adapter2(ArrayList<Data2> array2, Context context) {
        this.context = context;
        this.array2 = array2;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.apple.setImageResource(array2.get(position).img);
        holder.strawberry.setImageResource((array2.get(position).img));
        holder.tomato.setImageResource(array2.get(position).img);

    }

    @Override
    public int getItemCount() {

        return array2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ImageView apple, strawberry, tomato;

        public ViewHolder(View view) {

            super(view);

            apple = (ImageView) view.findViewById(R.id.apple);
            strawberry = (ImageView) view.findViewById(R.id.strawberry);
            tomato = (ImageView) view.findViewById(R.id.tomato);

        }
    }


}





