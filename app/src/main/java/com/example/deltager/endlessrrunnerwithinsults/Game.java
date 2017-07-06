package com.example.deltager.endlessrrunnerwithinsults;

import java.util.ArrayList;

/**
 * Created by deltager on 06-07-17.
 */

public class Game {

    ArrayList<obstacles> obstacles;

    public Game(){
        obstacles = new ArrayList<>();
    }

    public ArrayList<com.example.deltager.endlessrrunnerwithinsults.obstacles> getObstacles() {
        return obstacles;
    }

    public void addObstacle(obstacles obstacle){
        obstacles.add(obstacle);
    }
}
