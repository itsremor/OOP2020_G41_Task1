package ru.vsu.cs.players;

import ru.vsu.cs.map.GameMap;

public class Player {
    protected int busTickets;
    protected int metroTickets;
    protected int taxiTickets;
    protected int currentPosition;

    public void move(int N, GameMap gameMap){

    }

    public int getCurrentPosition(){
        return currentPosition;
    }

}