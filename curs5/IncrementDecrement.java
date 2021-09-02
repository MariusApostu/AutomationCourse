package curs5;

public class IncrementDecrement {

    public static void main(String[] args) {
        //num1++ = num1 + 1
        int num1 = 10;
        System.out.println("Primul num1 :" + num1); //val num1 = 10
        //Post increment -- mai intai executa si dupa face increment
        int num2 = num1++; // val lui num1 in timpul executiei este 10 //val lui num1 dupa executie va fi num1+ 1
        //num1= 11
        System.out.println("Al doilea  num1 :" + num1);
        System.out.println("Primul num2 :" + num2);
        int num3 = 10;
        num3++;
        int num4 = num3 + 1;
        num4 = num3++;
        System.out.println(num3);
        System.out.println(num4);
        //pre increment
        ++num3;
        //post increment
        num3++;
        //pre decrement
        --num3;
        //post decrement
        num3--;




    }

}