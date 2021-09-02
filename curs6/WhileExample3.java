package curs6;

import java.util.Scanner;

public class WhileExample3 {

    /**
     * vom folosi un while loop
     * aveam 2 variabile care sunt ratePerHour si hoursWorked
     * calculam salariu intreband userl cate ore a lucrat
     * conditia este sa nu poata introudce zero sau mai mult de 40 h pe sapt
     */
    public static void main(String[] args) {

        //ce stim
        int ratePerHour = 15;
        int hoursWorked = 40;
        //ce nu stim
        System.out.println("Cate ore ai lucrat sapt aceasta ?");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        //validam
        while (hours < 1 || hours > hoursWorked) {
            System.out.println("Numar invalid de ore");
            System.out.println("Introdu un numar valid de ore :");
            hours = scan.nextInt();
        }

        System.out.println("Salariu de plata este : " + hours*ratePerHour);



    }
}