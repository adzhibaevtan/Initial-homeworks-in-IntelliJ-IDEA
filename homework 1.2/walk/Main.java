import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(walk(21, -19));
        System.out.println(walk(15, 1));
        System.out.println(walk(46, -9));
        System.out.println(walk(57, -11));
        System.out.println(walk(1, -1));

        //Additional task

        System.out.println(walk(generateRandomAge(), 30));
    }

    public static String walk(int age, int temperature) {
        if (age > 20 && age < 45 && (temperature > -20 && temperature < 45)) {
            return "You can go for a walk";
        }
        if (age < 20 && (temperature > 0 && temperature < 28)) {
            return "You can go for a walk";
        }
        if (age > 45 && (temperature > -10 && temperature < 25)) {
            return "You can go for a walk";
        } else {
            return "Stay home";
        }
    }

    //Additional task

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(1,100);
    }
}