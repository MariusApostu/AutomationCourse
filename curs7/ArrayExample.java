package curs7;

public class ArrayExample {

    public static void main(String[] args) {

        String[] textArray = new String [5];

        textArray[0] = "This";
        textArray[1] = "is";
        textArray[2] = "an";
        textArray[3] = "Array";
        textArray[4] = "!";

        try{
            System.out.println(textArray[5]);
        } catch (Exception e) {
            System.out.println("Ai incerat sa accesezi un index in afara array-ului");
        }

        for (int i = 0; i< textArray.length; i++){
            System.out.print(textArray[i] + " ");
        }

    }
}
