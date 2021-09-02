package curs3;

public class MethodsExample {
    /*
    1. numar de camere dinamic
    2. calcul al ariei fiecarei camere
    3. numar total de metri patrati ai tuturor camerelor
    */
    public static void main(String[] args) {
      // 1. fara metode
    //room1
        int lenght = 4;
        int width = 4;
        int room1Area = lenght * width;
        System.out.println("Aria Camerei este: " + room1Area);

        //room2
        int lenght2 = 4;
        int width2 = 5;
        int room2Area = lenght2 * width2;
        System.out.println("Aria Camerei este: " + room2Area);

        //Calculam nunarul total de metri patrati in varianta fara metoda
        int nrTotalMp = room1Area + room2Area;
        System.out.println("numarul total este: " + nrTotalMp);

        //Calculam numarul total de metri patrati in varianta cu metoda
        MethodsExample obj = new MethodsExample();
        MethodsExample obj2 = new MethodsExample();

        int nrTotalMp2 = obj.calculateArea2(4,4) + obj2.calculateArea2(3,5);
        System.out.println("numarul total este: " + nrTotalMp2);

        obj.calculateArea(4,6);
        obj2.calculateArea(3,6);

    }

    public void calculateArea(int lenght, int width){
        System.out.println("Aria camerei este: " + lenght*width);
    }

    public int calculateArea2(int width, int lenght){
        return lenght*width;
    }
}
