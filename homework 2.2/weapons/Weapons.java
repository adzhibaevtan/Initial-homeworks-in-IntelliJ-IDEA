public  abstract class Weapons implements Printable {
    private String typeArms;
    private String material;

    public String getMaterial() {
        return material;
    }

    public Weapons(String typeArms, String material) {
        this.typeArms = typeArms;
        this.material = material;
    }

    public String getTypeArms() {
        return typeArms;
    }
public String info(){
        return   typeArms + material;
}
    @Override
    public void print() {
    }
}
