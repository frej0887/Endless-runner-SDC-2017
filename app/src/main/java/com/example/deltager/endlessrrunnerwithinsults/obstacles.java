package com.example.deltager.endlessrrunnerwithinsults;

import android.widget.ImageView;
import java.util.Random;

public class obstacles {

    private float xPos, yPos;
    private int path;

    public int randInt(int min, int max) {
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

    public void obst() {
        int r = randInt(0, 2);

        switch (r) {
            case 0:
                //canvas.drawBitmap(træ1, p, o.getyPos() - træ1.getHeight(), null);
            case 1:
                //canvas.drawBitmap(træ2, p, o.getyPos() - træ2.getHeight(), null);
            case 2:
                //canvas.drawBitmap(træ3, p, o.getyPos() - træ2.getHeight(), null);

                //MANGLER
        }
    }
}