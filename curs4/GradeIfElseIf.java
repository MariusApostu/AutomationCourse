package curs4;

import java.util.Scanner;

public class GradeIfElseIf {
/*
* pe baza unui puncaj vom atribui o nota
* punctaj de la 0 la 100
* daca obtii <= 90 primesti B
* daca obtii <= 80 primesti C
* daca obtii <= 70 primesti D
* daca obtii <= 60 primesti E
* daca obtii <= 50 primesti F
* daca nu esti in nici unul dintre range-uri primesti A
* Printam nota!
* */

    public static void main(String[] args) {
        System.out.println("Te rog sa introduci un punctaj");
        Scanner scan = new Scanner(System.in);
        int punctaj = scan.nextInt();

        char nota;

        if (punctaj <= 50){
            nota = 'F';
        }
        else if (punctaj <= 60){
            nota = 'E';
        }
        else if (punctaj <= 70){
            nota = 'D';
        }
        else if (punctaj <= 80){
            nota = 'C';
        }
        else if (punctaj <= 90){
            nota = 'B';
        }
        else {
            nota = 'A';
        }

        System.out.println("Nota obtinuta de tine este: " + nota);

    }
}
