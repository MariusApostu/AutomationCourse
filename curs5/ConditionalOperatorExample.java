package curs5;

import java.util.Scanner;

public class ConditionalOperatorExample {

    /**
     * Citeste doua numere de la tastatura
     * verifica fiecare numar daca este pozitiv
     * verifica daca ambele numere sunt pozitive
     * verifica care este cel mai mic numar dintre cele 2
     */


    public static void main(String[] args) {
        int num1;
        int num2;
        //cerem userului 2 numere
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = scan.nextInt();
        System.out.println("Enter second number:");
        num2 = scan.nextInt();

/*
        //verificam nr 1 daca este pozitiv
        if(num1 > 0) {
            System.out.println("Num1 is positive");
        }else {
            System.out.println("Num1 is negative");
        }
        //verificam nr 2 daca este pozitiv
        if(num2 > 0 ) {
            System.out.println("num2 is positive");
        }
        else {
            System.out.println("num2 is negative");
        }
        //verificam ambele nr daca sunt pozitive
        if( num1 >0 && num2 > 0) {
            System.out.println("Both numbers are positive");
        }else {
            System.out.println("Not both of the numbers are positive");
        }
        //verificam care este cel mai mic
       if( num1 < num2) {
           System.out.println("Num1 is the smallest");
       }else if (num1 == num2) {
           System.out.println("Numbers are equal");
       }
       else {
           System.out.println("Num2 is the smallest");
       }
*/

        //ternary operator
        String answer;
        //verificam nr 1 daca este pozitiv
        answer = num1 >0 ? "Num1 is positive" : "Num1 is negative";
        System.out.println(answer);
        //verificam nr 2 daca este pozitiv
        answer = num2 >0 ? "Num2 is positive" : "Num2 is negative";
        System.out.println(answer);
        //verificam ambele nr daca sunt pozitive
        answer = (num1 >0) && (num2 > 0) ? "both numbers are positive" : "not both are positive";
        System.out.println(answer);
        answer = num1 == num2 ? "numbers are equal" : num1<num2 ? "Num1 is the smallest" : "num2 is the smallest";
        System.out.println(answer);


    }
}