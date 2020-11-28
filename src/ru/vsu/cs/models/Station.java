package ru.vsu.cs.models;

import ru.vsu.cs.models.characters.Character;

import java.util.HashMap;

// TODO: 17.10.2020 Class edge, that can see only ways between stations. Map: Type -> Edge[], try to make 1 collection for every edge

public class Station{
    private HashMap<WayType, Station[]> ways;
    private Character character;

    public HashMap<WayType, Station[]> getWays() {
        return ways;
    }

    public Character getCharacter() {
        return character;
    }
}
