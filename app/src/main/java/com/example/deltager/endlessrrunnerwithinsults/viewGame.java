package com.example.deltager.endlessrrunnerwithinsults;

import android.app.Activity;
import android.content.Context;
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
    }

    //Tilføj draw

    class Timer extends Thread{
        //Tilføj run
    }
}

