public class Main {
    public static void main(String[] args) {

        Kingdom England = new Kingdom("England", 1000, "English");

        Nobles objectA = new Nobles(Rank.KNIGHTLY, "Fight", "Male", England);
        Peasants objectB = new Peasants(Rank.SERVANT, "Mining", "Female", England);
        Peasants objectС = new Peasants(Rank.SERVANT, "Serve", "Female", England);

        System.out.println(objectA.getInfo());
        objectA.makeMoney(15);
        objectA.employment("Priest");

        System.out.println(objectB.getInfo());
        objectB.employment("Farming");
        objectB.makeMoney();

        System.out.println(objectС.getInfo());
        objectС.employment("Slave");
        objectС.makeMoney();

    }
}