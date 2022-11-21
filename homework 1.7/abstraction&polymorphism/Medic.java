public class Medic extends Hero {
    @Override
    public String applySuperAbility() {
        return "Medic used a HEAL ability";
    }

    private int healPoints;

    public String increaseExperience() {
        return "Health upped on 10%";
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
