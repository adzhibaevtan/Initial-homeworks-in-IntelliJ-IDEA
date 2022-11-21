public class Gun extends Weapons {
    private int clipCapacity;
    public Gun(String typeArms, String material, int clipCapacity) {
        super(typeArms, material);
        this.clipCapacity = clipCapacity;
    }

    public int getClipCapacity() {
        return clipCapacity;
    }

    @Override
    public void print() {
        System.out.println(
                info() + "\nClip capasity: " + clipCapacity);

    }
}
