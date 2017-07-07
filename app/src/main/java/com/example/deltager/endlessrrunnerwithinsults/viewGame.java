package com.example.deltager.endlessrrunnerwithinsults;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

import static com.example.deltager.endlessrrunnerwithinsults.R.drawable.backgroundstart;

/**
 * Created by deltager on 06-07-17.
 */

public class viewGame extends View  {

    ArrayList<obstacles> obstacle;
    Game game;
    int width, height;
    Paint obstColour;
    Bitmap background;
    Timer timing;

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
        game.newObstacle();
        game.newObstacle();

        //TODO: Hent alt den grafik I skal bruge ind i feltvariabler
        //TODO: Brug den her som constructor for viewGame
        postInvalidate();

        timing = new Timer();
        timing.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //TODO: Tegn alt I jeres spil med canvas.drawBitMap(), canvas.drawRect() etc.
        //TODO: I kan få fat i jeres obstacles og spiller med game.getPlayer() og game.getObstacles()

        height = canvas.getHeight();
        width = canvas.getWidth();

        Paint backColor = new Paint();
        backColor.setColor(Color.GREEN);

        canvas.drawRect(0, 0, width, height, backColor);

        //Colour of the obstacle
        obstColour = new Paint();
        obstColour.setColor(Color.BLUE);

        //Arraylist of the current obstacles
        ArrayList<obstacles> obstacles = game.getObstacles();

        //Draw obstacle for ones which are currently in use
        for(obstacles o : obstacles)    {
            float p = (float) (0.05*width + o.getPath()*0.3*width);
            float temp = (float) (0.3*width);
            canvas.drawRect(p, o.getyPos(), p + temp, o.getyPos() + temp, obstColour);
        }
//        background = BitmapFactory.decodeResource(this.getResources(), R.drawable.backgroundstart);
//        canvas.drawBitmap(background, 0, height - background.getHeight(), null);

//        game.getObstacles();
//        game.getPlayer();

    }

    class Timer extends Thread{
        @Override
        public void run() {
            //TODO: Dette er jeres timer. Det er det eneste sted at I kan lave et delay. Et delay ser således ud:
            for (int i = 0; i < 5000; i++) {
                try {
                    Thread.sleep(1000 / 60);
                    //60fps
                } catch (InterruptedException e) {
                    //Do nothing here
                }

                //TODO: Få obstacles til at bevæge sig
                for (obstacles o : game.getObstacles()) {
                    o.setyPos(o.getyPos() + 20);
                }
                game.checkObstacles(height);
                //TODO: Få obstacles til at spawne på korrekte tidspunkter

                //TODO: Kald postInvalidate() når grafik skal opdateres
                postInvalidate();
            }
        }
    }
}

