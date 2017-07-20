package com.example.deltager.endlessrrunnerwithinsults;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by deltager on 06-07-17.
 */

public class Game {

    ArrayList<obstacles> obstacles;
    ArrayList<Points> Points;
    Player player;
    boolean isAlive;
    int obstPassed, points;
    InsultGenerator insultG;


    public Game(Context gameContext){
        obstacles = new ArrayList<>();
        Points = new ArrayList<>();
        player = new Player();
        isAlive = true;
        points = 0;
        obstPassed = 0;
        insultG = new InsultGenerator(gameContext);
    }

    public ArrayList<com.example.deltager.endlessrrunnerwithinsults.obstacles> getObstacles() {
        return obstacles;
    }

    public ArrayList<com.example.deltager.endlessrrunnerwithinsults.Points> getPoints() {
        return Points;
    }

    public void newObstacle(int playerPath){
        obstacles.add(new obstacles(playerPath, obstPassed));
    }

    public void newPoint(){
        Points.add(new Points());
    }

    public Player getPlayer(){
        return player;
    }

    public int getObstPassed() {
        return obstPassed;
    }
    public void setObstPassed(int obstP) {
        obstPassed = obstP;
    }

    public void checkObstacles(float height)    {
        for (int i = 0; i < obstacles.size(); i++) {
            if (obstacles.get(i).getyPos() > (int) (height+1))   {

                obstacles.remove(i);
                obstPassed++;
                newObstacle(getPlayer().getPath());
            }
        }
    }

    public void checkPoints(float height)    {
        for (int i = 0; i < Points.size(); i++) {
            if (Points.get(i).getyPos() > (int) (height+1))   {

                Points.remove(i);
                //newObstacle();
            }
        }
    }

    public void coll(float obstX, float obstY, float pm)    {
        pm = (float) (3/10.0*pm);
        if(obstX < player.getxPos() && player.getxPos() < obstX+pm && obstY < player.getyPos() && player.getyPos() < obstY+pm*1.3) {
            isAlive = false;
        }
    }

    public void poi(float poiX, float poiY, float pm)    {
        pm = (float) (3/10.0*pm);
        if(poiX < player.getxPos() && player.getxPos() < poiX+pm && poiY < player.getyPos() && player.getyPos() < poiY+pm*1.3) {
            points++;
        }
    }

    public boolean getIsAlive() {
        return isAlive;
    }


    //TODO lav en metode som kaldes regulært fra timeren og som finder ud af om spilleren er kollideret med et objekt
    //TODO lav en metode som kaldes regulært fra timeren som fjerer obstacles fra listen hvis de er ude af skærmen


}
