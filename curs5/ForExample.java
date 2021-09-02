package curs5;

import java.util.Scanner;

public class ForExample {


    public static void main(String[] args) {
        //primeste de la tastura un character
        //mai primeste un numar
        // va lua caracterul si va printa atatea linii si coloane cate sunt date in variabila numar
        // *
        //3
        //***
        //***
        //***
        char charater;
        int row;
        int column;

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a character:");
        charater = scan.next().charAt(0);
        System.out.println("Pease enter a number:");
        column = scan.nextInt();

        for(int i =0; i<column; ++i) {

            for (int j = 0; j<column; j++) {

                for(int x = 0; x<column; x++){

                    System.out.println("valoarea lui X :"+x);

                }
                System.out.println("valoarea lui j :"+j);
                System.out.print(charater);
            }
            System.out.println("valoarea lui i :"+i);
            System.out.println();

        }

    }


}