package com.example.playstoreanother;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class CustomAdapterThird  extends  RecyclerView.Adapter<CustomAdapterThird.GViewHolder> {


    private Context gcontext;
    private ArrayList<String> gimg;
    private ArrayList<String> gtitle;
    private ArrayList<String> grate;

    public CustomAdapterThird(Context gcontext,
                              ArrayList<String> gimg,
                              ArrayList<String> gtitle,
                              ArrayList<String> grate) {
        this.gcontext = gcontext;
        this.gimg = gimg;
        this.gtitle = gtitle;
        this.grate = grate;
    }

    @NonNull
    @Override
    public GViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.third_layer,parent,false);
        GViewHolder holder = new GViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull GViewHolder holder, int position) {
        holder.textView1.setText(gtitle.get(position));
        holder.textView2.setText(grate.get(position));
        Glide.with(gcontext)
                .asBitmap()
                .load(gimg.get(position))
                .placeholder(R.drawable.img)
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return grate.size();
    }

    public class GViewHolder  extends RecyclerView.ViewHolder{

        ShapeableImageView img;
        TextView textView1,textView2;

        public GViewHolder(@NonNull View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.tv1);
            textView2 = itemView.findViewById(R.id.tv2);
            img = itemView.findViewById(R.id.imgButton1);

        }
    }
}
