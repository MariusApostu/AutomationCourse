package curs5;

import java.util.Scanner;

public class Calculator {

    int num1;
    int num2;
    char operation;
    int result;

    //intrebam userul valorile de mai sus
    public void askTheUser() {
        Scanner scan  =  new Scanner(System.in);
        System.out.println("Please enter first number :");
        num1 = scan.nextInt();
        System.out.println("Please enter the operation :");
        operation = scan.next().charAt(0);
        System.out.println("Please enter the second number:");
        num2 = scan.nextInt();
    }

    //calculam pe baza valorilor
    public void calculateValues(){
        if(operation == '+') {
            result = num1 + num2;
            printResult();
        }
        else if(operation == '-') {
            result = num1-num2;
            printResult();
        }
        else if ((operation=='x') || (operation == '*') ) {
            result = num1*num2;
            printResult();
        }
        else if(operation == '/') {
            result = num1/num2;
            printResult();

        }else {
            System.out.println("Wrong character");
        }
    }
    //printam rezultatul
    public void printResult(){
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}