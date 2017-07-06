package com.example.deltager.endlessrrunnerwithinsults;

import android.widget.ImageView;
import java.util.Random;

public class obstacles extends MainActivity {

    private float xPos, yPos;
    private int path;

    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public obstacles(){
        yPos = 0;
        path = randInt(1, 3);
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

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    void doStuff(ImageView image, double place) {
        image.setY(0-300);
        image.setX(pxWidth * (float) place);
        image.animate().y(pxHeight).setDuration(1000);
        if (image.getY() > pxHeight) {
            image.setY(0-300);
        }

    }

    public void randomObst(ImageView image)  {
        r = randInt(1, 3);
        switch (r) {
            case 1:
                doStuff(image, 0);
                break;

            case 2:
                doStuff(image, 3/10);
                break;

            case 3:
                doStuff(image, 6/10);
                break;
        }
    }



}