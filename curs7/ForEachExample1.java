package curs7;

public class ForEachExample1 {

    public static void main(String[] args) {

        int[] numbers = {10, 20,30, 40};

        for (int i = 0; i<numbers.length; i++){
            System.out.println("Clasic for " + numbers[i]);
        }
        //codul de mai jos este echivalent cu codul de mai sus
        for (int num: numbers){
            System.out.println(num);
        }



    }
}
