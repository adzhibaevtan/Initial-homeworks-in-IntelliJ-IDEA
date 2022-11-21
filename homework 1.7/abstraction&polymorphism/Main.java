public class Main {

    public static void main(String[] args) {

        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        Hero[] heroes = {medic, warrior, wizard};

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].applySuperAbility());
            System.out.println(medic.increaseExperience());
        }
    }
}
