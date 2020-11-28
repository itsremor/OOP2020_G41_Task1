package ru.vsu.cs.models.characters;

import ru.vsu.cs.models.Station;

public class Character {
    protected int busTickets;
    protected int metroTickets;
    protected int taxiTickets;

    protected Station currentPosition;

    protected CharacterType characterType;

    public void setCurrentPosition(Station currentPosition){
        this.currentPosition = currentPosition;
    }

    public Station getCurrentPosition(){
        return currentPosition;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public int getBusTickets() {
        return busTickets;
    }

    public int getMetroTickets() {
        return metroTickets;
    }

    public int getTaxiTickets() {
        return taxiTickets;
    }

    public void setBusTickets(int busTickets) {
        this.busTickets = busTickets;
    }

    public void setMetroTickets(int metroTickets) {
        this.metroTickets = metroTickets;
    }

    public void setTaxiTickets(int taxiTickets) {
        this.taxiTickets = taxiTickets;
    }
}