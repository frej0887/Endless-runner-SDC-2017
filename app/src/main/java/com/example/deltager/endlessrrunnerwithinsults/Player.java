package com.example.deltager.endlessrrunnerwithinsults;

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

    public void collY(int playerY, int obstY)
    {
        if (playerY == obstY)
        {
            System.out.println("Du blev ramt af et obejekt");
        }


    }
    public void collX(int playerX, int obstX)
    {
        if (playerX == obstX)
        {
            System.out.println("Du blev også ramt af et objekt");
        }
    }


}
