public abstract class Residents {
    private Rank rank;
    private String responsibilities;
    private String gender;
    private Kingdom kingdom;

    public Residents(Rank rank, String responsibilities, String gender, Kingdom kingdom) {
        this.rank = rank;
        this.responsibilities = responsibilities;
        this.gender = gender;
        this.kingdom = kingdom;
    }

    public Rank getRank() {
        return rank;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public String getGender() {
        return gender;
    }

    public Kingdom getKingdom() {
        return kingdom;
    }
}

