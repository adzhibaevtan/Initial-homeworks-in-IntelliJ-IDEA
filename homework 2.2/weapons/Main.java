
public class Main {
    public static void main(String[] args) {

        Printable[] printables = {
                createObject("Steel"),
                createObject("Small"),
                createObject("Gun")};

        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Steel":
                Cold sword = new Cold("Katana", "Steel", 100);
                return sword;
            case "Small":
                Small bow = new Small("Yumi", "Wood", 5);
                return bow;
            case "Gun":
                Gun pistol = new Gun("Revolver", "Metal", 6);
                return pistol;
        }
        return null;
    }
}