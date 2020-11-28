package ru.vsu.cs.models.characters;

public class MrX extends Character {
    private int doubleMove;
    private int blackTicket;

    public MrX(int detectiveCount) {
        this.busTickets = 3;
        this.metroTickets = 3;
        this.taxiTickets = 4;
        this.doubleMove = 2;
        this.blackTicket = detectiveCount;
        this.characterType = CharacterType.MRX;
    }

    public int getDoubleMove() {
        return doubleMove;
    }

    public int getBlackTicket() {
        return blackTicket;
    }

    public void setDoubleMove(int doubleMove) {
        this.doubleMove = doubleMove;
    }

    public void setBlackTicket(int blackTicket) {
        this.blackTicket = blackTicket;
    }
}