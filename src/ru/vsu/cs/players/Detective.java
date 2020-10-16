package ru.vsu.cs.players;

public class Detective extends Player{
    private String name;

    public Detective(String name) {
        this.busTickets = 8;
        this.metroTickets = 4;
        this.taxiTickets = 10;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}