package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Bastard extends Hero {
    public static int currentBastardHealth;
    private boolean hasBastardPretendedToBeDead = false;

    public Bastard(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.ROGUE);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        int rogue = RPG_Game.random.nextInt(5);
        if (rogue == 1 && this.getHealth() != 0 && !hasBastardPretendedToBeDead) {
            this.setHealth(0);
            this.setDamage(0);
            System.out.println(" Ratface pretended to be dead");
            hasBastardPretendedToBeDead = true;
        } else if (hasBastardPretendedToBeDead) {
            this.setHealth(currentBastardHealth);
            this.setDamage(10);
            hasBastardPretendedToBeDead = false;
        }
    }

}
