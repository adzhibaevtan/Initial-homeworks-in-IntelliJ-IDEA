public class Cold extends Weapons {
    private int bladeLength;
    public Cold(String typeArms, String material, int bladeLength) {
        super(typeArms, material);
        this.bladeLength = bladeLength;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    @Override
    public void print() {
        System.out.println(info() +
                "\nBlade length: " + bladeLength);
    }

}