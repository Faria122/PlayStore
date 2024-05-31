package com.example.playstoreanother;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {

    ImageView Image;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getIncomingContent();
    }

    private void  getIncomingContent(){
        if(getIntent().hasExtra("Image Url1")&& getIntent().hasExtra("Image Name1")){
            String imageurl = getIntent().getStringExtra("Image Url1");
            String imageName= getIntent().getStringExtra("Image Name1");
            setImage (imageurl, imageName);
        } else if (getIntent().hasExtra("Image Url2")&& getIntent().hasExtra("Image Name2")) {
            String imageurl = getIntent().getStringExtra("Image Url2");
            String imageName = getIntent().getStringExtra("Image Name2");
            setImage (imageurl, imageName);
        } else if (getIntent().hasExtra("Image Url3")&& getIntent().hasExtra("Image Name3")) {
            String imageurl = getIntent().getStringExtra("Image Url3");
            String imageName = getIntent().getStringExtra("Image Name3");
            setImage (imageurl, imageName);
        }
    }

    private void setImage(String imageurl, String imageName){

        textview = findViewById(R.id.sec_textview1);
        textview.setText(imageName);


        Image = findViewById(R.id.sec_img);
        Glide.with(this)
                .asBitmap()
                .load(imageurl)
                .into(Image);
    }
}