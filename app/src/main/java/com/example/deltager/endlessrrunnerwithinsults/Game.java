package com.example.deltager.endlessrrunnerwithinsults;

import java.util.ArrayList;

/**
 * Created by deltager on 06-07-17.
 */

public class Game {

    ArrayList<obstacles> obstacles;
    Player player;

    public Game(){
        obstacles = new ArrayList<>();
        player = new Player();
    }

    public ArrayList<com.example.deltager.endlessrrunnerwithinsults.obstacles> getObstacles() {
        return obstacles;
    }

    public void newObstacle(){
        //TODO Lav en tilfældig obstacle og tilføj den til listen

    }

    public Player getPlayer(){
        return player;
    }

    public void background(int i)   {




    }

    //TODO lav en metode som kaldes regulært fra timeren og som finder ud af om spilleren er kollideret med et objekt
    //TODO lav en metode som kaldes regulært fra timeren som fjerer obstacles fra listen hvis de er ude af skærmen
}
