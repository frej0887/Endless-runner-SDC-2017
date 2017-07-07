package com.example.deltager.endlessrrunnerwithinsults;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity
{
    CanvasView cv;

    ImageView image1;
    ImageView image2;

    public float pxHeight;
    public float pxWidth;

    public ArrayList<obstacles> obstacles;

    //public obstacles obst = new obstacles(); Throws StackOverflowException

    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //cv = (CanvasView) findViewById(R.id.canvasView); //Det her virker åbenbart ikke


/*
        image1 = (ImageView) findViewById(R.id.obst1);
        image2 = (ImageView) findViewById(R.id.obst2);

        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics ();
        display.getMetrics(outMetrics);

        pxHeight = outMetrics.heightPixels;
        pxWidth  = outMetrics.widthPixels;

        obst.randomObst(image1);
        obst.randomObst(image2);
        */
    }

    public void animation(View view) {
        cv.animation();
    }
}



