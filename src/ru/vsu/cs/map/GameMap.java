package ru.vsu.cs.map;

import ru.vsu.cs.map.variety.Station;
import java.util.ArrayList;

public class GameMap {

    private ArrayList<Station> stations;
    private int[] startPoints;

    public GameMap(ArrayList<Station> stations, int[] startPoints) {
        this.stations = stations;
        this.startPoints = startPoints;
    }
}