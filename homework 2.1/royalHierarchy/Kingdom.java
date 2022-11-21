public class Kingdom {
    private int coffers;
    private String name;
    private String language;

    public Kingdom(String name, int coffers, String language) {
        this.name = name;
        this.coffers = coffers;
        this.language = language;
    }

    public int getCoffers() {
        return coffers;
    }

    public String getLanguage() {
        return language;
    }

    public String getName() {
        return name;
    }
}
