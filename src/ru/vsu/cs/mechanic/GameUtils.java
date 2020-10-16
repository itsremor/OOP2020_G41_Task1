package ru.vsu.cs.mechanic;

import ru.vsu.cs.players.Detective;
import ru.vsu.cs.players.MrX;

class GameUtils {

    protected static void writeGameLog(int countOfDetectives, int turn, Detective[] detectives, MrX mrx){
        System.out.println("\n↓Ход номер " + turn + '↓');
        for (int i = 0; i < countOfDetectives; i++) {
            System.out.println("♥Детектив " + detectives[i].getName() + " находится на станции " + detectives[i].getCurrentPosition());
        }
        if(turn == 4 || turn == 9 || turn == 14 || turn == 19)
            System.out.println("♠Мистер Икс находится на станции " + mrx.getCurrentPosition());
    }



}
