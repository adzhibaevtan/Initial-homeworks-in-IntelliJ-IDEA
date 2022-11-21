
public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHeath(1000);
        boss.setDamage(100);
        boss.setDefenceType("Magical");
        System.out.println("Boss health: " + boss.getHeath());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss defence type: " + boss.getDefenceType() + "\n");

        createHeroes();

        for (int i = 0; i < createHeroes().length; i++) {
            if (createHeroes()[i].getSuperPower()==null) {
                System.out.println("Damage hero : " + createHeroes()[i].getDamage()
                        + " Health: " + createHeroes()[i].getHealth());
            } else {
            System.out.println("Damage hero : " + createHeroes()[i].getDamage()
                    + " Health: " + createHeroes()[i].getHealth()
                    + " Superpower: " + createHeroes()[i].getSuperPower());
            }
        }
    }

    public static Hero[] createHeroes() {
        Hero Warrior = new Hero(300, 30);
        Hero Wizard = new Hero(250, 50, "Magical");
        Hero Archer = new Hero(200, 30);
        return new Hero[]{Warrior, Wizard, Archer};
    }
}