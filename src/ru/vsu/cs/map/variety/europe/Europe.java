package ru.vsu.cs.map.variety.europe;

import ru.vsu.cs.map.variety.Station;

import java.util.ArrayList;

public class Europe {
    final static int[] startPoints = {1, 16, 26, 30, 12, 8, 17, 32};
    private ArrayList<Station> stations = new ArrayList<>();

    public static int[] getStartPoints() {
        return startPoints;
    }

    public Europe() {
        //toDo there stations must be added
    }

    public ArrayList<Station> getStations() {
        return stations;
    }
}
