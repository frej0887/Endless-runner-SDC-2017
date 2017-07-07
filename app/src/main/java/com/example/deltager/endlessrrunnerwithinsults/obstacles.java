package com.example.deltager.endlessrrunnerwithinsults;

import android.widget.ImageView;
import java.util.Random;

public class obstacles {

    private float xPos, yPos;
    private int path;

    static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public obstacles(){
        yPos = 0;
        xPos = 0;
        path = randInt(0, 2);
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