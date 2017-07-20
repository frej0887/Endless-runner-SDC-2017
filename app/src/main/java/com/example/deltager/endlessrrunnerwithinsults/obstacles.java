package com.example.deltager.endlessrrunnerwithinsults;

import android.widget.ImageView;
import java.util.Random;

public class obstacles {

    private float xPos, yPos;
    private int path;
    private int i;


    public int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public obstacles(int playerPath, int obstMade)  {
        yPos = 0;
        xPos = 0;
        path = obstChance(playerPath, obstMade);
//        path = randInt(0, 2);
    }

    int obstChance(int plPa, int obstMade)   {
        int p;  //Path of object
        switch (obstMade % 2) {
            case 0:
                i = randInt(0, 1000);
                if (i < 800) {
                    p = plPa;
                } else if (800 <= i && i < 900) {
                    p = (plPa + 1)%3;
                } else  {
                    p = (plPa + 2)%3;
                }
                return p;
            default:
                p = (plPa + randInt(1, 2)) % 3;
                return p;
        }
    }

    public float getxPos() {
        return xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public int getPath() {
        return path;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public void setyPos(float y) {
        this.yPos = y;
    }
}