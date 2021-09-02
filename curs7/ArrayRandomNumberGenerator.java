package curs7;

import java.util.Random;

public class ArrayRandomNumberGenerator {
    /**
    * face un program care genereaza numere random si le tine intr-un array
    * dupa care printam array-ul
    * dupa care facem cautare in array secvential si binar
    */
    public static final int LENGHT  = 6;
    public static final int MAX_NUMBERS = 9;

    public static void main(String[] args) {
       // generateNumbers();
        printNumbers(generateNumbers());
    }

    public static int[] generateNumbers(){
        int[] numbers = new int[LENGHT];
        Random random = new Random();

        for (int i = 0; i < LENGHT; i++){
            numbers[i] = random.nextInt(MAX_NUMBERS);
        }
        return numbers;
    }
        public static void printNumbers(int array[]) {
        for(int nr : array) {
            System.out.print(nr + " | ");
        }
    }
}
