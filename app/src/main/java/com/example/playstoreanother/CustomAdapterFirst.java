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

public class CustomAdapterFirst extends RecyclerView.Adapter<CustomAdapterFirst.NViewHolder> {


    private Context Ncontext;
    private ArrayList<String> Nimage1, Nimage2, Ntextview1,
            Ntextview2,Ntextview3,Nbutton;

    public CustomAdapterFirst(Context ncontext, ArrayList<String> nimage1, ArrayList<String> nimage2, ArrayList<String> ntextview1, ArrayList<String> ntextview2, ArrayList<String> ntextview3, ArrayList<String> nbutton) {
        Ncontext = ncontext;
        Nimage1 = nimage1;
        Nimage2 = nimage2;
        Ntextview1 = ntextview1;
        Ntextview2 = ntextview2;
        Ntextview3 = ntextview3;
        Nbutton = nbutton;
    }

    @NonNull
    @Override
    public NViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.first_layer,parent,false);
        NViewHolder holder = new NViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull NViewHolder holder, int position) {

        holder.tv1.setText(Ntextview1.get(position));
        holder.tv2.setText(Ntextview2.get(position));
        holder.tv3.setText(Nbutton.get(position));
        holder.tv4.setText(Ntextview3.get(position));
        Glide.with(Ncontext)
                .asBitmap()
                .load(Nimage1.get(position))
                .placeholder(R.drawable.img)
                .into(holder.img1);
        Glide.with(Ncontext)
                .asBitmap()
                .load(Nimage2.get(position))
                .placeholder(R.drawable.img)
                .into(holder.img2);

    }

    @Override
    public int getItemCount() {
       return Ntextview1.size();
    }


    public class NViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView img1,img2;
        TextView tv1,tv2,tv3,tv4;


        public NViewHolder(@NonNull View itemView) {
            super(itemView);
            img1 = itemView.findViewById(R.id.imageButton1);
            img2 = itemView.findViewById(R.id.imageButton2);
            tv1 = itemView.findViewById(R.id.textView1);
            tv2 = itemView.findViewById(R.id.textView2);
            tv3 = itemView.findViewById(R.id.button1);
            tv4 = itemView.findViewById(R.id.textView3);
        }
    }
}
