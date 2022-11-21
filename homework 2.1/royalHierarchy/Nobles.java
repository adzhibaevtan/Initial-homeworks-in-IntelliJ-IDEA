import java.util.Random;

public class Nobles extends Royal {

    public Nobles(Rank rank, String responsibilities, String gender, Kingdom kingdom) {
        super(rank, responsibilities, gender, kingdom);
    }

    public void makeMoney(int coin) {
        System.out.println("Earnings : " + coin);
    }

    public void makeMoney() {
        System.out.println("Earnings : " + generateDefaultCoin());
    }

    public final void employment(String work) {
        System.out.println(work);
    }

    public String getInfo() {
        return "\nStatus: " + getRank() +
                "\nEmployment: " + getResponsibilities() +
                "\nGender: " + getGender() +
                "\nKingdom: " + getKingdom().getName() + " ,"
                + getKingdom().getLanguage() + " ,"
                + getKingdom().getCoffers();
    }

    private int generateDefaultCoin() {
        Random random = new Random();
        return random.nextInt(5, 10);

    }
}

