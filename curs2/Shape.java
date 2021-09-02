package curs2;

public class Shape {


      public Shape( int lenght, int width, double radius) {

    }
    public Shape(int lenght) {

        System.out.println("Aria Patratului este: " + calculateSquareArea(lenght));

    }
    public Shape (int lenght, int width){

        System.out.println("Aria dreptunghului este: " + calculateRectangleArea(lenght,width));
    }
    public Shape (double radius){

        System.out.println("Aria cercului este: " + radius * radius * Math.PI);
    }

    public int calculateSquareArea(int lenght){
        return lenght * lenght;
    }
    public int calculateRectangleArea(int lenght, int width){
        return lenght * width;
    }

}
