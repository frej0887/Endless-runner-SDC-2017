package com.example.deltager.endlessrrunnerwithinsults;

import android.util.Log;

/**
 * Created by deltager on 07-07-17.
 */

public class Player {

    float xPos;
    float yPos;

    public Player(){
        xPos = 0;
        yPos = 0;
        //TODO Lav et estimat på hvor spilleren skal starte. Gør det korrekt i OnDraw();
    }


    //Setter og getters
    public float getxPos() {
        return xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    public void objectPassed(float playerY, float obstY )
    {

    }



}
