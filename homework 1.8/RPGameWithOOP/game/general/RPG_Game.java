package kg.geektech.game.general;

import kg.geektech.game.players.*;

import java.util.Random;

public class RPG_Game {
    public static int roundNumber;
    public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss(3000, 25, "");
        Warrior warrior = new Warrior(300, 10, "Warrior");
        Medic doc = new Medic(200, 5, 15, "Medic  ");
        Magic magic = new Magic(250, 15, "Wizard ");
        Berserk berserk = new Berserk(200, 20, "Berserk");
        Medic assistant = new Medic(200, 10, 5, "Healer ");
        Thor thor = new Thor(300, 20, "Thor   ");
       Burglar burglar = new Burglar(100, 10, "Burglar");
        Bastard bastard = new Bastard(200, 10, "Ratface");
        Hero[] heroes = {warrior, doc, berserk, magic, assistant, thor, bastard, burglar};


        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence(heroes);
        if (heroes[6].getHealth() != 0) {
            Bastard.currentBastardHealth = heroes[6].getHealth();

        }
        boss.hit(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getDefence() != heroes[i].getAbility()) {
                heroes[i].hit(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("\nROUND " +
                (roundNumber == 0 ? "BEFORE FIGHT " : roundNumber)
                + " \n");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}
