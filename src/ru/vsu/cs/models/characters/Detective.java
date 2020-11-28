package ru.vsu.cs.models.characters;

public class Detective extends Character {
    private String name;


    public Detective(String name) {
        this.busTickets = 8;
        this.metroTickets = 4;
        this.taxiTickets = 10;
        this.name = name;
        this.characterType = CharacterType.DETECTIVE;
    }

    public String getName() {
        return name;
    }
}