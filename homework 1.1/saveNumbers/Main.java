import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите пять имён: ");

        final int number = 0;
        String word = "Word";
        String aNameThatConsistsOfSeveralWords;
        aNameThatConsistsOfSeveralWords = number + word;
        System.out.println(aNameThatConsistsOfSeveralWords);

        if (number < 0) {
            System.out.println("You saved a negative number");
        } else if (number > 0) {
            System.out.println("You saved a positive number");
        } else {
            System.out.println("You saved zero");
        }

        //Additional task

        Scanner input = new Scanner(System.in);
        System.out.print(" \nEnter your name: ");
        String Name = input.next();
        System.out.println(" \nHello " + Name);
    }
}
