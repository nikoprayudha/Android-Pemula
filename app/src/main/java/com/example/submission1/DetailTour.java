package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailTour extends AppCompatActivity {

    private Context context;
    ImageView photo;
    TextView name,detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tour);

        photo = findViewById(R.id.img_item_photo);
        name = findViewById(R.id.tv_item_name);
        detail = findViewById(R.id.tv_item_detail);

        Intent intent = getIntent();
        String[] data = intent.getStringArrayExtra("data");

        name.setText(data[0]);
        detail.setText(data[1]);
        photo.setImageResource(Integer.parseInt(data[2]));

    }
}