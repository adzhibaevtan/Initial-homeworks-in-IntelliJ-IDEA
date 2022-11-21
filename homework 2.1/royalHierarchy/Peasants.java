
public final class Peasants extends Nobles {

    public Peasants(Rank rank, String responsibilities, String gender, Kingdom kingdom) {
        super(rank, responsibilities, gender, kingdom);
    }

    public String getInfo() {
        return "\nEmployment: " + getResponsibilities() +
                "\nGender: " + getGender() +
                "\nKingdom: " +getKingdom().getName() + " ,"
                + getKingdom().getLanguage() + " ,"
                + getKingdom().getCoffers();
    }

}
