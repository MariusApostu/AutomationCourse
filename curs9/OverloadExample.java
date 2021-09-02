package curs9;

public class OverloadExample {

    public static void main(String[] args) {
        System.out.println(multiply(3, 3));
        System.out.println(multiply(2.5, 3.7));
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double multiply (double a, double b){
        return a * b;
    }


}
