public abstract class  Hero {

    private  int health;

    private  int damage;

    private String superPowerType;

    public abstract String applySuperAbility();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPowerType() {
        return superPowerType;
    }

    public void setSuperPowerType(String superPowerType) {
        this.superPowerType = superPowerType;
    }
}
