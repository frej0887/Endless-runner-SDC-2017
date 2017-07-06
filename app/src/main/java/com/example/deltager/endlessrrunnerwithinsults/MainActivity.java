package com.example.deltager.endlessrrunnerwithinsults;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
    ImageView image3;

    float pxHeight;
    float pxWidth;

    int r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        image1 = (ImageView) findViewById(R.id.obst1);
        image2 = (ImageView) findViewById(R.id.obst2);

        Display display = getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics ();
        display.getMetrics(outMetrics);

        pxHeight = outMetrics.heightPixels;
        pxWidth  = outMetrics.widthPixels;


        randomObst(image1);
//        randomObst(image2);
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    void randomObst(ImageView image)   {
        r = randInt(1, 3);
        switch (r){
            case 1:
                doStuff(image, 0);
                break;

            case 2:
                doStuff(image, 3/10);
                break;

            case 3:
                doStuff(image, 6/10);
                break;
        }
    }
    }

        void doStuff(ImageView image, double place) {
            image.setY(-300);
            image.setX(pxWidth * (float) place);
            image.animate().y(pxHeight).setDuration(1000);
            if (image.getY() > pxHeight) {
                image.setY(-300);
            }

        }

}


