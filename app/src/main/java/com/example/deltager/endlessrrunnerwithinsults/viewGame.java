package com.example.deltager.endlessrrunnerwithinsults;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by deltager on 06-07-17.
 */

public class viewGame extends View  {

    ArrayList<obstacles> obstacles;
    Game game;
    Bitmap background;
    int width, height, backgroundY;
    boolean init;

    public viewGame(Context context)
    {
        super(context);
        setup();
    }

    public viewGame(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        setup();
    }

    public viewGame(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        setup();
    }

    public void setup(){
        game = new Game();
        //background = BitmapFactory.decodeResource(this.getResources(),
        //        R.drawable.backgroundstart);
        backgroundY = 0;
        init = true;

        //TODO: Hent alt den grafik I skal bruge ind i feltvariabler
        //TODO: Brug den her som constructor for viewGame
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //TODO: Tegn alt I jeres spil med canvas.drawBitMap(), canvas.drawRect() etc.
        //TODO I kan få fat i jeres obstacles og spiller med game.getPlayer() og game.getObstacles()

        height = canvas.getHeight();
        width = canvas.getWidth();
        if (init)   {
            init = false;
            backgroundY = 0-width*13;
        }

        Paint temp = new Paint();
        temp.setColor(Color.RED);
        canvas.drawRect(0, 0, width/2, height, temp);

        //background = Bitmap.createScaledBitmap(background, width, height, true);
        //canvas.drawBitmap(background, 0, 0, null);

        //canvas.drawRect(1/20*width + 3/10*i*width, yMovement - 3/10*width, 7/20*width + 3/10*width*i, yMovement);

    }

    class Timer extends Thread{
        @Override
        public void run() {
            //TODO Dette er jeres timer. Det er det eneste sted at I kan lave et delay. Et delay ser således ud:
            try {
                Thread.sleep(1000);
                //Er 1 sekund
            } catch (InterruptedException e){
                //Do nothing here
            }

            //TODO: Få obstacles til at bevæge sig
            //TODO: Få obstacles til at spawne på korrekte tidspunkter
            //TODO: Kald postInvalidate() når grafik skal opdateres
        }
    }
}

