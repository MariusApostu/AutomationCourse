package curs4;

import java.util.Scanner;

public class PunctajMinim {

    int number;

    public void askTheUserForTheNumber() {
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();

            if (number >= 0 && number <= 65) {
            System.out.println("Ai picat!");

        } else if (number > 65 && number <=100) {
            System.out.println("Felicitari! Ai trecut");
        }
            else {
                System.out.println("This is not a valid number!");
            }

    }
}



