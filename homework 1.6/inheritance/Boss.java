
public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info() {
        return "Boss health: " + getHealth()
                + "\nBoss damage: " + getDamage()
                + "\nBoss weapon type: " + weapon.getWeaponType()
                + "\nBoss weapon: " + weapon.getWeapon();
    }
}

