package curs6;

import java.util.Scanner;

public class WhileExample2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numer :");
        int number = scan.nextInt();

        for(int i =1; i<=10; i++) {
            System.out.println(number + " * " + i + " = "+ number*i);
        }

        System.out.println("------------------------------------");

        int x = 1;
        while(x<=10) {
            System.out.println(number + " * " + x + " = "+ number*x);
            x++;
        }


    }

}