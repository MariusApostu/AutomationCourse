package curs6;

import java.util.Scanner;

public class ForVsWhile {
    /**
     * Facem un program care cere userului numere pe care le aduna
     * userul introduce cate numere vrea
     * Cand vrea sa iasa din program va introduce 0
     */
    public static void main(String[] args) {
    /*    ForVsWhile exercitiu =  new ForVsWhile();
        exercitiu.rezolvareCuWhile();*/
        //rezolvareCuWhile();
        rezolvareCuFor();
    }

    //o rezolvare cu while
    public static void rezolvareCuWhile(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a number :");
        int x  = scan.nextInt();
        int sum = 0;

        while(x != 0 ) {
            sum +=x;
            System.out.println("Please enter a number :");
            x  = scan.nextInt();
        }
        System.out.println("Total sum of the numbers is :" + sum);
    }
    //o rezolvare cu for
    public static void rezolvareCuFor(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a number :");
        //  int x  = scan.nextInt();
        int sum = 0;

        for(int x  = scan.nextInt(); x != 0 ; x  = scan.nextInt()) {
            sum +=x;
            System.out.println("Please enter a number :");

        }
        System.out.println("Total sum of the numbers is :" + sum);

    }



}