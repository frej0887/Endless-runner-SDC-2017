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
    Bitmap b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;
    boolean init, onDeathInsult;
    boolean printInsult = false;
    int ct;

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

    public void setup(Context context) {
        onDeathInsult = false;
        //TODO: Hent alt den grafik I skal bruge ind i feltvariabler
        træ1 = BitmapFactory.decodeResource(this.getResources(), R.mipmap.traeer_stor_web);
        player = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ball);
        deathscreen = BitmapFactory.decodeResource(this.getResources(), R.mipmap.deathscreenweb);
        //TODO: Brug den her som constructor for viewGame
        makeNewGame(context);

        b1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b1);
        b2 = BitmapFactory.decodeResource(this.getResources(),R.drawable.b2);
        b3 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b3);
        b4 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b4);
        b5 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b5);
        b6 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b6);
        b7 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b7);
        b8 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b8);
        b9 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b9);
        b10 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b10);
        b11 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b11);
        b12 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b12);
        b13 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b13);
        b14 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b14);
        b15 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b15);
        b16 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b16);
        b17 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b17);
        b18 = BitmapFactory.decodeResource(this.getResources(), R.drawable.b18);

    }

    public void makeNewGame(Context gameContext)    {
        if(!(timing == null)&&timing.isAlive())        {
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
    protected void onDraw(Canvas canvas) {
        //TODO: Tegn alt I jeres spil med canvas.drawBitMap(), canvas.drawRect() etc.
        //TODO: I kan få fat i jeres obstacles og spiller med game.getPlayer() og game.getObstacles()

        //Width and height
        height = canvas.getHeight();
        width = canvas.getWidth();
        if (init)    {
            init = false;

            //Player pos
            game.getPlayer().setyPos((float) (0.875 * height));
            game.getPlayer().setxPos((float) (width / 2));

            //Image scaling
            træ1 = Bitmap.createScaledBitmap(træ1, (int) (0.3 * width) + 1, (int) (0.3 * width) + 1, true);

            b1 = Bitmap.createScaledBitmap(b1, width, height , true);
            b2 = Bitmap.createScaledBitmap(b2, width, height, true);
            b3 = Bitmap.createScaledBitmap(b3, width, height, true);
            b4 = Bitmap.createScaledBitmap(b4, width, height, true);
            b5 = Bitmap.createScaledBitmap(b5, width, height, true);
            b6 = Bitmap.createScaledBitmap(b6, width, height, true);
            b7 = Bitmap.createScaledBitmap(b7, width, height, true);
            b8 = Bitmap.createScaledBitmap(b8, width, height, true);
            b9 = Bitmap.createScaledBitmap(b9, width, height, true);
            b10 = Bitmap.createScaledBitmap(b10, width, height, true);
            b11 = Bitmap.createScaledBitmap(b11, width, height, true);
            b12 = Bitmap.createScaledBitmap(b12, width, height, true);
            b13 = Bitmap.createScaledBitmap(b13, width, height, true);
            b14 = Bitmap.createScaledBitmap(b14, width, height, true);
            b15 = Bitmap.createScaledBitmap(b15, width, height, true);
            b16 = Bitmap.createScaledBitmap(b16, width, height, true);
            b17 = Bitmap.createScaledBitmap(b17, width, height, true);
            b18 = Bitmap.createScaledBitmap(b18, width, height, true);
        }
        //Background colour

        Paint backColor = new Paint();
        Paint backColor2 = new Paint();
        backColor.setColor(Color.GREEN);
        backColor2.setColor(Color.BLACK);



        //Background
        canvas.drawRect(0, 0, width, height, backColor);



        switch(ct)    {
            case 0:
                canvas.drawBitmap(b1, 0, 0, null);
                break;
            case 1:
                canvas.drawBitmap(b2, 0, 0, null);
                break;
            case 2:
                canvas.drawBitmap(b3, 0, 0, null);
                break;
            case 3:
                canvas.drawBitmap(b4, 0, 0, null);
                break;
            case 4:
                canvas.drawBitmap(b5, 0, 0, null);
                break;
            case 5:
                canvas.drawBitmap(b6, 0, 0, null);
                break;
            case 6:
                canvas.drawBitmap(b7, 0, 0, null);
                break;
            case 7:
                canvas.drawBitmap(b8, 0, 0, null);
                break;
            case 8:
                canvas.drawBitmap(b9, 0, 0, null);
                break;
            case 9:
                canvas.drawBitmap(b10, 0, 0, null);
                break;
            case 10:
                canvas.drawBitmap(b11, 0, 0, null);
                break;
            case 11:
                canvas.drawBitmap(b12, 0, 0, null);
                break;
            case 12:
                canvas.drawBitmap(b13, 0, 0, null);
                break;
            case 13:
                canvas.drawBitmap(b14, 0, 0, null);
                break;
            case 14:
                canvas.drawBitmap(b15, 0, 0, null);
                break;
            case 15:
                canvas.drawBitmap(b16, 0, 0, null);
                break;
            case 16:
                canvas.drawBitmap(b17, 0, 0, null);
                break;
            case 17:
                canvas.drawBitmap(b18, 0, 0, null);
                ct = 0;
                break;
        }

        //Colour of the obstacle
        obstColour = new Paint();
        obstColour.setColor(Color.BLUE);

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
            //Make insult when you die
            insultGenerator.insult(0);
            onDeathInsult = false;
        if(!game.getIsAlive()) {
            //Lav et insult når playeren dør
            //insultGenerator.insult(0);
            game.setObstPassed(0);
            canvas.drawRect(0, 0, width, height, backColor2);
            deathscreen = Bitmap.createScaledBitmap(deathscreen, width, (int) (0.85366 * width), true);
            canvas.drawBitmap(deathscreen, 0, height / 2 - deathscreen.getHeight() / 2, null);
        }
        }
    }

    public boolean getAlive(){
        return game.getIsAlive();
    }


    class Timer extends Thread
    {

        @Override
        public void run()  {
            try   {
                int j = 0;
                while (game.getIsAlive())    {
                    Thread.sleep(1000 / 60);
                    //60fp
                    j++;
                    insultTimer++;
                if (insultTimer >= 300)    {
                    printInsult = true;
                }
                if (j == 10)    {
                    ct++;
                    j = 0;
                }
                for (obstacles o : game.getObstacles())   {
                    o.setyPos((float)(o.getyPos() + width*.02));
                    game.coll(o.getxPos(), o.getyPos(), width);
                }
                game.checkObstacles(height);

                //TODO: Kald postInvalidate() når grafik skal opdateres
                postInvalidate();
                }
            onDeathInsult = true;
            postInvalidate();
            }
                catch (InterruptedException e)  {
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

