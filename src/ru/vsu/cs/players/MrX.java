package ru.vsu.cs.players;

public class MrX extends Player{
    private int doubleMove;
    private int blackTicket;

    public MrX(int detectiveCount) {
        this.busTickets = 3;
        this.metroTickets = 3;
        this.taxiTickets = 4;
        this.doubleMove = 2;
        this.blackTicket = detectiveCount;
    }


}