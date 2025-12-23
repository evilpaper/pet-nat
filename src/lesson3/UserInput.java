package lesson3;

import java.util.Scanner;

public class UserInput {

    public static void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);

    }
}
