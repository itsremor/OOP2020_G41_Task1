package ru.vsu.cs.mechanic;

import ru.vsu.cs.map.GameMap;
import ru.vsu.cs.map.variety.europe.Europe;
import ru.vsu.cs.players.Detective;
import ru.vsu.cs.players.MrX;

import java.util.Scanner;

public class Mechanic {
    public static void startGame(){
        Scanner scn = new Scanner(System.in);
        int turn = 1;
        int countOfDetectives;
        GameMap gmap;
        MrX mrx;
        Detective[] detectives;

        System.out.print("Добро пожаловать в ScotlandYard! \nВведите кол-во детективов, которые будут в этой игре: ");

        Europe europe = new Europe();
        gmap = new GameMap(europe.getStations(), Europe.getStartPoints());

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

            //toDo gameplay realisation

            if(turn == 23) System.out.println("\n♠♠♠Мистер Икс победил!♠♠♠");
        }
    }
}