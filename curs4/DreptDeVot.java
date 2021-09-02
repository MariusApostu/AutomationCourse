package curs4;

import java.util.Scanner;

public class DreptDeVot {

    public void askTheUserHisAge(){
        System.out.println("Te rog sa introduci varsta:");
        Scanner scan = new Scanner(System.in);
        int varsta = scan.nextInt();
        if (varsta < 18){
            System.out.println("Esti minor!");
        }
        else if (varsta>=18 && varsta<70){
            System.out.println("Poti Vota!");
        }
        else{
            System.out.println("Ar trebui sa te bucuri de pensie si sa lasi politica!");
        }

    }
}
