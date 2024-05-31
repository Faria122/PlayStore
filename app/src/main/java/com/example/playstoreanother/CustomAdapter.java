package com.example.playstoreanother;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    private Context mcontext;
    private ArrayList<String> mImage1, mImage2, mImage3;
    private ArrayList<String> mimgName1, mimgName2, mimgName3;
    private ArrayList<String> mimgDes1, mimgDes2, mimgDes3;
    private ArrayList<String> mimgRate1, mimgRate2, mimgRate3;

    public CustomAdapter(Context mcontext,
                         ArrayList<String> mImage1, ArrayList<String> mImage2, ArrayList<String> mImage3,
                         ArrayList<String> mimgName1, ArrayList<String> mimgName2, ArrayList<String> mimgName3,
                         ArrayList<String> mimgDes1, ArrayList<String> mimgDes2, ArrayList<String> mimgDes3,
                         ArrayList<String> mimgRate1, ArrayList<String> mimgRate2, ArrayList<String> mimgRate3) {
        this.mcontext = mcontext;
        this.mImage1 = mImage1;
        this.mImage2 = mImage2;
        this.mImage3 = mImage3;
        this.mimgName1 = mimgName1;
        this.mimgName2 = mimgName2;
        this.mimgName3 = mimgName3;
        this.mimgDes1 = mimgDes1;
        this.mimgDes2 = mimgDes2;
        this.mimgDes3 = mimgDes3;
        this.mimgRate1 = mimgRate1;
        this.mimgRate2 = mimgRate2;
        this.mimgRate3 = mimgRate3;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_layer,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.imgname1.setText(mimgName1.get(position));
        holder.imgdes1.setText(mimgDes1.get(position));
        holder.imgrate1.setText(mimgRate1.get(position));
        // for 1st Image
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, MainActivity2.class);
                intent.putExtra("Image Url1",mImage1.get(position));
                intent.putExtra("Image Name1",mimgName1.get(position));
                mcontext.startActivity(intent);
            }
        });
        Glide.with(mcontext)
                .asBitmap()
                .load(mImage1.get(position))
                .placeholder(R.drawable.img)
                .into(holder.img1);


        holder.imgname2.setText(mimgName2.get(position));
        holder.imgdes2.setText(mimgDes2.get(position));
        holder.imgrate2.setText(mimgRate2.get(position));
        // for 2nd Image
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, MainActivity2.class);
                intent.putExtra("Image Url2",mImage2.get(position));
                intent.putExtra("Image Name2",mimgName2.get(position));
                mcontext.startActivity(intent);
            }
        });
        Glide.with(mcontext)
                .asBitmap()
                .load(mImage2.get(position))
                .placeholder(R.drawable.img)
                .into(holder.img2);


        holder.imgname3.setText(mimgName3.get(position));
        holder.imgdes3.setText(mimgDes3.get(position));
        holder.imgrate3.setText(mimgRate3.get(position));
        // for 3rd Image
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, MainActivity2.class);
                intent.putExtra("Image Url3",mImage3.get(position));
                intent.putExtra("Image Name3",mimgName3.get(position));
                mcontext.startActivity(intent);
            }
        });
        Glide.with(mcontext)
                .asBitmap()
                .load(mImage3.get(position))
                .placeholder(R.drawable.img)
                .into(holder.img3);

    }

    @Override
    public int getItemCount() {
        return mimgName1.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView img1,img2,img3;
    TextView imgname1,imgname2,imgname3,imgdes1,
            imgdes2,imgdes3,imgrate1,imgrate2,imgrate3;
    LinearLayout parentLayout;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        parentLayout = itemView.findViewById(R.id.parent_layout);

        img1= itemView.findViewById(R.id.image1);
        img2= itemView.findViewById(R.id.image2);
        img3= itemView.findViewById(R.id.image3);

        imgname1= itemView.findViewById(R.id.g_tv1a);
        imgname2= itemView.findViewById(R.id.g_tv2a);
        imgname3= itemView.findViewById(R.id.g_tv3a);

        imgdes1 = itemView.findViewById(R.id.g_tv1b);
        imgdes2 = itemView.findViewById(R.id.g_tv2b);
        imgdes3 = itemView.findViewById(R.id.g_tv3b);

        imgrate1 = itemView.findViewById(R.id.g_tv1c);
        imgrate2 = itemView.findViewById(R.id.g_tv2c);
        imgrate3 = itemView.findViewById(R.id.g_tv3c);
    }
}

}
