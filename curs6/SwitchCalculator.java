package curs6;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number:");
        num1 = scan.nextInt();
        System.out.println("Please enter second number:");
        num2 = scan.nextInt();
        System.out.println("Enter an operator :");
        char operator = scan.next().charAt(0);
        int sum = 0;

        switch (operator) {
            case '+':
                sum = num1+num2;
                break;
            case '-':
                sum = num1 -num2;
                break;
            case '*':
                sum = num1*num2;
                break;
            case 'x':
                sum =num1*num2;
                break;
            case '/':
                sum = num1/num2;
                break;
            default:
                System.out.println("Wrong operator");
        }
        System.out.println(num1 + " " + operator + " " +num2 + " = " + sum);

    }
}