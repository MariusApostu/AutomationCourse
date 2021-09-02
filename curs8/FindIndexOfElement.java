package curs8;

public class FindIndexOfElement {

    int[] number = {3,5,6,8,9,2};

    //o metoda care sa gaseasca indexul unui element
    //FOr
    //While
    //printam elementul si indexul : index pentru 6 este : 2

    public void findIndexUsingFor(int element){
        for (int i=0; i<number.length; i++){
            if (number[i] == element){
                System.out.println("Indexul pentru " + element + " este " + i);
            }
        }
    }
    public void findIndexUsingWhile (int element){
        int i = 0;
        while (i< number.length){
            if (number[i] == element) {
                System.out.println("Indexul pentru " + element + " este " + i);
            }
            i++;

            }

    }

}
