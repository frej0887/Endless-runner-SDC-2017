package com.example.deltager.endlessrrunnerwithinsults;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.Timer;

/**
 * Created by deltager on 06-07-17.
 */

public class viewGame extends View
{
    ArrayList<obstacles> obstacle;
    Game game;
    int width, height, insultTimer;
    Paint obstColour, playerColour, textColour;
    Timer timing;
    Bitmap background, træ1, player, deathscreen;
    boolean init, onDeathInsult;
    boolean printInsult = false;

    InsultGenerator insultGenerator = new InsultGenerator(getContext());


    public viewGame(Context context)
    {
        super(context);
        setup(context);
    }

    public viewGame(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        setup(context);
    }

    public viewGame(Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        setup(context);
    }

    public void setup(Context context)
    {
        onDeathInsult = false;
        //TODO: Hent alt den grafik I skal bruge ind i feltvariabler
        træ1 = BitmapFactory.decodeResource(this.getResources(), R.mipmap.traeer_stor_web);
        player = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ballweb);
        deathscreen = BitmapFactory.decodeResource(this.getResources(), R.mipmap.deathscreenweb);
        //TODO: Brug den her som constructor for viewGame
        makeNewGame(context);


    }
    public void makeNewGame(Context gameContext)
    {
        if(!(timing == null)&&timing.isAlive())
        {
            timing.interrupt();
        }
        game = new Game(gameContext);
        game.newObstacle();
        game.newObstacle();
        init = true;
        insultTimer = 0;

        postInvalidate();
        timing = new Timer();
        timing.start();

    }

    public InsultGenerator getInsultGenerator() {
        return insultGenerator;
    }

    public void setPlayerX(float x) {
       game.getPlayer().setxPos(x);
    }

    public float getViewGameWidth() {
        return width;
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        //TODO: Tegn alt I jeres spil med canvas.drawBitMap(), canvas.drawRect() etc.
        //TODO: I kan få fat i jeres obstacles og spiller med game.getPlayer() og game.getObstacles()

        //Width and height
        height = canvas.getHeight();
        width = canvas.getWidth();
        if (init)
        {
            init = false;

            //Player pos
            game.getPlayer().setyPos((float) (0.875 * height));
            game.getPlayer().setxPos((float) (width / 2));

            //Image scaling
            træ1 = Bitmap.createScaledBitmap(træ1, (int) (0.3 * width) + 1, (int) (0.3 * width) + 1, true);

        }
        //Background colour

        Paint backColor = new Paint();
        Paint backColor2 = new Paint();
        backColor.setColor(Color.GREEN);
        backColor2.setColor(Color.BLACK);

        //Background
        canvas.drawRect(0, 0, width, height, backColor);


        //Arraylist of the current obstacles
        ArrayList<obstacles> obstacles = game.getObstacles();

        //Draw obstacle for ones which are currently in use
        for (obstacles o : obstacles)
        {
            float p = (float) (0.05 * width + o.getPath() * 0.3 * width);
            o.setxPos(p);
            float temp = (float) (0.3 * width);
            //canvas.drawBitmap(p, o.getyPos(), p + temp, o.getyPos() + temp, null);
            canvas.drawBitmap(træ1, o.getxPos(), o.getyPos(), null);
            //canvas.drawBitmap(træ1, 0, height - træ1.getHeight(), null);


        }

        //canvas.drawBitmap(træ1, 0, height - træ1.getHeight(), null);



//        canvas.drawCircle(width/2, game.getPlayer().getyPos(), (float) (.1*width), playerColour);
        player = Bitmap.createScaledBitmap(player, (int) (width*.2), (int) (.2*width), true);
        canvas.drawBitmap(player, (float) (game.getPlayer().getxPos() - .1 * width), (float) (game.getPlayer().getyPos() - .1 * width), null);


        checkObstaclesPassed(game.getObstPassed());

        if(onDeathInsult){
            //Lav et insult når playeren dør
            //insultGenerator.insult(0);
            onDeathInsult = false;
            canvas.drawRect(0, 0, width, height, backColor2);
            deathscreen = Bitmap.createScaledBitmap(deathscreen, width, (int) (0.85366*width), true);
            canvas.drawBitmap(deathscreen, 0, height/2 - deathscreen.getHeight()/2, null);
        }
    }

    public boolean getAlive(){
        return game.getIsAlive();
    }


    class Timer extends Thread
    {

        @Override
        public void run()
        {
            try
            {
            while (game.getIsAlive())
            {
                    Thread.sleep(1000 / 60);
                    //60fps

                insultTimer++;
                if (insultTimer >= 300){
                    printInsult = true;
                }
                for (obstacles o : game.getObstacles())
                {
                    o.setyPos((float)(o.getyPos() + width*.02));
                    game.coll(o.getxPos(), o.getyPos(), width);
                }
                game.checkObstacles(height);
                //TODO: Få obstacles til at spawne på korrekte tidspunkter


                //TODO: Kald postInvalidate() når grafik skal opdateres
                postInvalidate();
            }
            onDeathInsult = true;
            postInvalidate();
                } catch (InterruptedException e)
            {
                //Do nothing here
            }
        }
    }

    public void checkObstaclesPassed (int obstPassed)
    {
        if(obstPassed >= 10 && printInsult) {
            insultGenerator.insult(1);
            printInsult = false;
            insultTimer = 0;
        }

    }
}

