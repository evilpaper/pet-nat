package lesson4;

import java.util.Scanner;

public class MadLibsGame {

    public static void run() {

        String adjective1;
        String noun1;
        String verb1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter an noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an verb end with -ing (action): ");
        verb1 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + " " +  verb1 + ".");
    }




}
