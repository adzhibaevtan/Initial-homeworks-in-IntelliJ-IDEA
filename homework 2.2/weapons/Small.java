public class Small extends Weapons {
    private int tensionForce;
    public Small(String typeArms, String material, int tensionForce) {
        super(typeArms, material);
        this.tensionForce = tensionForce;
    }

    public int getTensionForce() {
        return tensionForce;
    }

    @Override
    public void print() {
        System.out.println(
                info() + "\nTension Force: " + getTensionForce());

    }
}
