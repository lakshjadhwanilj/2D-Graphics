package com.example.a2dgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Creating a bitmap
        Bitmap bg = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);

//        Setting the bitmap as background for the imageview
        ImageView i = (ImageView) findViewById(R.id.imageView);
        i.setBackground(new BitmapDrawable((bg)));

//        Creating the canvas object
        Canvas canvas = new Canvas((bg));

//        Creating paint object & set its color
        Paint rectpaint = new Paint();
        rectpaint.setColor(Color.rgb(0,128,255));

        Paint circlepaint = new Paint();
        circlepaint.setColor(Color.rgb(210,45,45));

        Paint squarepaint = new Paint();
        squarepaint.setColor(Color.rgb(255,191,0));

//        Draw a rectangle
        canvas.drawRect(400,200,650,700,rectpaint);

//        Draw a square
        canvas.drawRect(50,850,350,1150,squarepaint);

//        Draw a circle
        canvas.drawCircle(200,350,150,circlepaint);
    }
}