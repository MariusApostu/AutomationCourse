package curs2;

public class TestRectangle {

    public static void main(String[] args) {


        //o variabila de referinta
        Rectangle dreptunghi; //--> se duce catre o locatie din memorie S1 -- spatiu care este rezervat pt biectul respectiv
        //dreptunghi1.lenght = 2;
        //creare obiect -- new + constructor = obiect

        Rectangle dreptunghi2 = new Rectangle(); //--> pointeaza catre o alta locatie din memorie

        //dreptunghi2.lenght = 4;
        //dreptunghi2.width = 2;

        dreptunghi2.setLenght(6);
        dreptunghi2.setWidth(4);

        System.out.println(dreptunghi2.getWidth());
        System.out.println(dreptunghi2.getLenght());
        System.out.println(dreptunghi2.calculateArea());

        Rectangle dreptunghi3 = new Rectangle();
        dreptunghi3.setLenght(6);
        dreptunghi3.setWidth(2);
        System.out.println(dreptunghi3.calculateNumberOfRectangles());

        Rectangle dreptunghi4 = new Rectangle(6,5,500);
        System.out.println(dreptunghi4.calculateNumberOfRectangles());

    }



}
