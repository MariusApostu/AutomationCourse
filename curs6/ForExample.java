package curs6;

public class ForExample {

    public static void main(String[] args) {

        //skip la initializare
/*        int i =0;
        for( ; i<4; i++) {
            System.out.println(i);
        }*/

        //skip conditiei
/*        for(int j=0; ;j++) {
            System.out.println(j);
            if (j>4) {
                break;
            }
        }*/

        int i = 0;
        for(;;) {
            if(i>4) {
                break;
            }
            System.out.println(i);
            i++;
        }


    }

}