package curs6;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {
        /**
         * cauta intr0un string o anumita litera A
         * daca o gaseste iese din program si printeaza ; am gasit litera
         * daca nu o gaseste printeaza ca nu a gasit-o
         */
        System.out.println("Please enter a text :");
        Scanner scan = new Scanner(System.in);
        String  text = scan.next();
        char neededLetter = 'A';
        boolean leterFound = false;

        for(int i = 0; i<text.length() ;i++) {
            char currentLetter = text.charAt(i);
            System.out.println(i);
            if(currentLetter == neededLetter || currentLetter == 'a') {
                leterFound = true;
                break;//se executa doar daca litera a exista
            }
        }

        if(leterFound) {
            System.out.println("Litera A exista in text");
        }else {
            System.out.println("Litera A NU exista");
        }

    }
}