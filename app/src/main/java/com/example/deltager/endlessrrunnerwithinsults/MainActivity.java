package com.example.deltager.endlessrrunnerwithinsults;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends Activity  {
    viewGame view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        view = (viewGame) findViewById(R.id.gameView);
        final Context me = this;

        view.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch (View view, MotionEvent event)
            {
                float x = event.getX();
                int y = (int) event.getY();
                viewGame screen = (viewGame) view;

                switch (event.getAction())
                {
                    case MotionEvent.ACTION_DOWN:
                        if(!screen.getAlive()){
                            screen.makeNewGame(me);
                        }

                        if( x < (screen.getViewGameWidth() / 3))
                        {
                            screen.setPlayerX( (screen.getViewGameWidth() / 2) * 3/10);
                        }
                        if(x > (screen.getViewGameWidth() / 3) && x < ((screen.getViewGameWidth()) / 3) * 2)
                        {
                            screen.setPlayerX( (screen.getViewGameWidth() / 2));
                        }
                        if(x > ((screen.getViewGameWidth()) / 3) * 2 )
                        {
                            screen.setPlayerX( (screen.getViewGameWidth() / 2) * (float)(1.7));
                        }

                        //Trykkes
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        //Swipes
                        return false;
                    case MotionEvent.ACTION_UP:
                        //Stop af tryk
                        //screen.setPlayerX(screen.getViewGameWidth() / 2);
                        return false;
                }
                return true;
            }
        });
    }




}


