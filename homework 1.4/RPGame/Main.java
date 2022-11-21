import java.util.Random;

public class Main {
    public static int bossHealth = 3000;
    public static int bossDamage = 50;
    public static String bossDefence;
    public static int[] heroesHealth = {280, 270, 250, 240, 250, 1000, 200, 300};
    public static int[] heroesDamage = {10, 15, 20, 0, 20, 5, 10, 25};
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Medic", "Thor", "Golem", "Dodger", "Berserk"};
    public static int roundNumber = 0;



    public static void main(String[] args) {
        printStatistics();
        while (!isGameFinished()) {
            playRound();
        }
    }

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        //thor();
        bossHits();
        heroesHit();
        medic();
        golem();
        lucky();
        berserk();
        printStatistics();
    }

    public static void medic() {

        Random random = new Random();

        int randomIndex = random.nextInt(heroesAttackType.length);

        for (int i = 0; i < heroesHealth.length; i++) {

            if (heroesHealth[i] != heroesHealth[3] && heroesHealth[randomIndex] < 100 && heroesHealth[3] != 0) {
                heroesHealth[randomIndex] += 50;
                System.out.println("Medic healed the following character: " + heroesAttackType[randomIndex]);
                break;
            }
        }
    }

    public static void thor() {

        Random random = new Random();

        boolean randomIndex = random.nextBoolean();

        if (heroesHealth[4] != 0 && randomIndex) {
            bossDamage = 0;
            System.out.println("Boss stunned");
        } else {
            bossDamage = 50;
        }
    }

    public static void golem() {

        int absorbedDamage = 0;

        for (int i = 0; i < heroesHealth.length; i++) {

            if (heroesHealth[i] != heroesHealth[5] && heroesHealth[5] > 0 && heroesHealth[i] > 0) {
                absorbedDamage += bossDamage / 5;
                heroesHealth[5] -= absorbedDamage;
            }
        }
        System.out.println("Golem absorbed the following damage : " + absorbedDamage);

    }

    public static void lucky() {

        Random evasion = new Random();

        int random = evasion.nextInt(3);

        if (heroesHealth[6] > 0 ) {
            switch (random) {
                case 0:
                    heroesHealth[5] += 50;
                    System.out.println("Lucky dodged");
            }
        }
    }

    public static void berserk() {

        int damageBoss = bossDamage / 2;

        if (heroesHealth[7] > 0) {
                heroesHealth[7] += damageBoss;
                bossHealth -= damageBoss;
        }
    }

    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void bossHits() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                if (heroesHealth[i] - bossDamage < 0) {
                    heroesHealth[i] = 0;
                } else {
                    heroesHealth[i] = heroesHealth[i] - bossDamage;
                }
            }
        }
    }

    public static void heroesHit() {
        for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                if (bossDefence == heroesAttackType[i]) {
                    Random random = new Random();
                    int coef = random.nextInt(9) + 2;
                    if (bossHealth - heroesDamage[i] * coef < 0) {
                        bossHealth = 0;
                    } else {
                        bossHealth = bossHealth - heroesDamage[i] * coef;
                    }
                    System.out.println("Critical damage: " + heroesDamage[i] * coef);
                } else {
                    if (bossHealth - heroesDamage[i] < 0) {
                        bossHealth = 0;
                    } else {
                        bossHealth = bossHealth - heroesDamage[i];
                    }
                }
            }
        }
    }

    public static boolean isGameFinished() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }


        boolean allHeroesDead = true;
        for (int healthOfCurrentHero : heroesHealth) {
            if (healthOfCurrentHero > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }

    public static void printStatistics() {
        if (roundNumber == 0) {
            System.out.println("BEFORE START");
        } else {
            System.out.println("\n");
            System.out.println("ROUND " + roundNumber);
        }

        System.out.println("Boss health: " + bossHealth + "; damage: "
                + bossDamage + "; defence: "
                + (bossDefence == null ? "No defence" : bossDefence));
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " +
                    heroesHealth[i] + "; damage: " + heroesDamage[i]);
        }
    }
}