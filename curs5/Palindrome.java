package curs5;

public class Palindrome {

    //radar
    public void checkIfWordIsPalindrome(String cuvant){

        String cuvantIntors = "";

        // m a s i n a
        // 0 1 2 3 4 5
        for (int i = cuvant.length()-1; i>=0; i-- ){
            cuvantIntors = cuvantIntors + cuvant.charAt(i);
        }
        if (cuvantIntors.equals(cuvant)){
            System.out.println("cuvantul este palindrom");
        } else {
            System.out.println("cuvantul nu este palindrom");
        }

    }
}
