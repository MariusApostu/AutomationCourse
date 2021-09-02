package curs6;

import java.util.Scanner;

public class SwitchExample {
    /**
     * intrebam utilizatorul ce nota a obtinut
     * pe baza notei intoarcem un mesaj :
     * nota A - Felicitari
     * nota B -Destul de bine
     * nota C - Suficinet
     * nota D - insuficient
     * daca intoruce ceva invalid printam te rog introdu o nota valida
     */

    public static void main(String[] args) {

        System.out.println("Te rog introdu o nota :");
        Scanner scan = new Scanner(System.in);
        String nota = scan.next();

        switch (nota.toUpperCase()) {

            case "A" :
                System.out.println("Felicitari");
                break;
            case "B" :
                System.out.println("Destul de bine");
                break;
            case "C" :
                System.out.println("Suficient");
                break;
            case "D" :
                System.out.println("Insuficient");
                break;
            default:
                System.out.println("te rog introdu o nota valida");
        }

    }
}