package curs4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestOfThreeNumbers {
    //instance variables
    int number1;
    int number2;
    int number3;

    // metoda care intreaba userul 3 numere

    public void askTheUserForThreeNumbers(){
        System.out.println("Please enter the first number: ");
        Scanner scan = new Scanner(System.in);
        number1 = scan.nextInt();
        System.out.println("Please enter the second number: ");
        number2 = scan.nextInt();
        System.out.println("Please enter the third number: ");
        number3 = scan.nextInt();
    }
    //metoda care compara cele 3 numere si decide care este mai mare
    public void compareTheNumbers(){
        if (number1 > number2 && number1 > number3){
            System.out.println("The First number is the greatest!");
        }
         else if (number2 > number1 && number2 > number3){
            System.out.println("The second number is the greatest!");
        }
        else if (number3 > number1 && number3 > number2){
            System.out.println("The Third number is the greatest!");
        }
        else{
            System.out.println("The numbers are equal!");
        }

        }

}
