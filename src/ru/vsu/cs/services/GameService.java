package ru.vsu.cs.services;

import ru.vsu.cs.models.GameMap;
import ru.vsu.cs.models.GraphHelper;
import ru.vsu.cs.models.Station;
import ru.vsu.cs.models.WayType;
import ru.vsu.cs.models.characters.Detective;
import ru.vsu.cs.models.characters.MrX;

import java.util.Scanner;

public class GameService {

    public static GameMap initGameMap(){
        Station[] mapStations = new Station[33];
        Station station;

        for (int i = 0; i < 33; i++) {
            station = new Station();
            mapStations[i] = station;
        }
//(Зелёный=Такси, Оранжевый=метро, Голубой=Автобус)

        /*На данный момент здесь всё инициализируется вручную, но к конечной версии я планирую довести это до автоматизма
        Добавив парсер SVG-шки карты и всё происходило бы автоматически. Но ввиду ограниченного времени к этой
        аттестации реализация сделана вот так паршиво. Очень неприятно что не успел сделать по-хорошему
        но всё равно это лучше, чем ничего

        P.S. Если речь зайдёт о том, что это можно было бы на данном этапе как-то запихнуть в отдельный метод, то
        вряд ли, ввиду необходимости ручного ввода данных о вершинах. Но всё же, постарался
        свести к автоматизму это
        */

        GraphHelper bus = new GraphHelper();
        GraphHelper taxi = new GraphHelper();
        GraphHelper metro = new GraphHelper();

        taxi.addEdge(0, 1);
        taxi.addEdge(0, 2);
        taxi.addEdge(4, 2);
        taxi.addEdge(4, 7);
        taxi.addEdge(3, 1);
        taxi.addEdge(3, 7);
        taxi.addEdge(12, 7);
        taxi.addEdge(18, 7);
        taxi.addEdge(6, 7);
        taxi.addEdge(6, 5);
        taxi.addEdge(6, 8);
        taxi.addEdge(11, 8);
        taxi.addEdge(12, 8);
        taxi.addEdge(12, 18);
        taxi.addEdge(9, 18);
        taxi.addEdge(9, 16);
        taxi.addEdge(9, 15);
        taxi.addEdge(11, 15);
        taxi.addEdge(11, 13);
        taxi.addEdge(15, 13);
        taxi.addEdge(15, 17);
        taxi.addEdge(15, 14);
        taxi.addEdge(31, 14);
        taxi.addEdge(31, 30);
        taxi.addEdge(10, 30);
        taxi.addEdge(10, 15);
        taxi.addEdge(10, 17);
        taxi.addEdge(10, 29);
        taxi.addEdge(19, 13);
        taxi.addEdge(19, 20);
        taxi.addEdge(21, 20);
        taxi.addEdge(21, 32);
        taxi.addEdge(23, 32);
        taxi.addEdge(22, 24);
        taxi.addEdge(25, 26);
        taxi.addEdge(28, 26);

        metro.addEdge(0, 3);
        metro.addEdge(5, 3);
        metro.addEdge(5, 1);
        metro.addEdge(15, 17);
        metro.addEdge(29, 17);
        metro.addEdge(29, 32);
        metro.addEdge(21, 32);
        metro.addEdge(21, 22);
        metro.addEdge(23, 22);
        metro.addEdge(24, 25);
        metro.addEdge(27, 25);
        metro.addEdge(28, 25);

        bus.addEdge(0, 2);
        bus.addEdge(0, 3);
        bus.addEdge(7, 3);
        bus.addEdge(1, 5);
        bus.addEdge(6, 5);
        bus.addEdge(18, 12);
        bus.addEdge(15, 12);
        bus.addEdge(15, 14);
        bus.addEdge(15, 17);
        bus.addEdge(20, 17);
        bus.addEdge(21, 32);
        bus.addEdge(22, 24);
        bus.addEdge(23, 26);
        bus.addEdge(25, 26);
        bus.addEdge(27, 28);


        return null;
    }

    private static void addWaysForStation(Station[] allStations, int[] busIndexes,
                                   int[] taxiIndexes, int[] metroIndexes,
                                   int currentStationIndex){
        Station[] busStations = new Station[busIndexes.length];
        Station[] taxiStations = new Station[taxiIndexes.length];
        Station[] metroStations = new Station[metroIndexes.length];

        for (int i = 0; i < busStations.length; i++) {
            busStations[i] = allStations[busIndexes[i]];
        }
        allStations[currentStationIndex].getWays().put(WayType.BUS, busStations);

        for (int i = 0; i < taxiStations.length; i++) {
            taxiStations[i] = allStations[taxiIndexes[i]];
        }
        allStations[currentStationIndex].getWays().put(WayType.TAXI, taxiStations);

        for (int i = 0; i < metroStations.length; i++) {
            metroStations[i] = allStations[metroIndexes[i]];
        }
        allStations[currentStationIndex].getWays().put(WayType.METRO, metroStations);
    }

    // TODO: 17.10.2020 init game, after that START
    public static void startGame(){
        Scanner scn = new Scanner(System.in);
        int turn = 1;
        int countOfDetectives;
        GameMap gmap;
        MrX mrx;
        Detective[] detectives;

        System.out.print("Добро пожаловать в ScotlandYard! \nВведите кол-во детективов, которые будут в этой игре: ");

        //Europe europe = new Europe();
        //gmap = new GameMap(europe.getStations(), Europe.getStartPoints());

        while (true){
            countOfDetectives = scn.nextInt();
            if(countOfDetectives > 6) System.out.print("Максимальное кол-во детективов 6. Повторите ввод:");
            else if (countOfDetectives < 1 ) System.out.print("Некорректный ввод. Повторите ввод: ");
            else{
                detectives = new Detective[countOfDetectives];
                //toDo also I need to add MrX and detectives StartPoint realisation
                 mrx = new MrX(countOfDetectives);
                break;
            }
        }

        String name;

        for (int i = 0; i < countOfDetectives; i++) {
            System.out.print("Детектив " + (i+1) + ", введите своё имя: ");
            name = scn.next();
            detectives[i] = new Detective(name);
        }

        while (turn < 23){
            GameUtils.writeGameLog(countOfDetectives, turn, detectives, mrx);
            turn++;

            //toDo gameplay realisation, and If MrX.pos == Detective.pos than Det.Win

            if(turn == 23) System.out.println("\n♠♠♠Мистер Икс победил!♠♠♠");
        }
    }
}