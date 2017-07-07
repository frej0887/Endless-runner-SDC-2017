package com.example.deltager.endlessrrunnerwithinsults;

import android.util.Log;

/**
 * Created by deltager on 07-07-17.
 */

public class Player {

    int xPos;
    int yPos;

    public Player(){
        xPos = 0;
        yPos = 0;
        //TODO Lav et estimat på hvor spilleren skal starte. Gør det korrekt i OnDraw();
    }


    //Setter og getters
    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }




    public void collY(int playerY, int obstY)    {
        int yDist = playerY - obstY;
        if (yDist < 20 && yDist> -20)    {

        }


    }


    public void collX(int playerX, int obstX)    {
        int xDist = playerX - obstX;

        if (xDist < 20 && xDist > -20)    {

        }
    }


}
