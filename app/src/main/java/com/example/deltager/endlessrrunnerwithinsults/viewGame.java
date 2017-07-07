package com.example.deltager.endlessrrunnerwithinsults;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
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
        //TODO: Hent alt den grafik I skal bruge ind i feltvariabler
        //TODO: Brug den her som constructor for viewGame
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //TODO: Tegn alt I jeres spil med canvas.drawBitMap(), canvas.drawRect() etc.
        //TODO I kan få fat i jeres obstacles og spiller med game.getPlayer() og game.getObstacles()
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

