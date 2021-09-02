package curs2;

public class Rectangle {

    //variabile de clasa
    private int lenght;
    private int width;
    private int bigArea;

    //constructor
    public Rectangle(){
        lenght = 1;
        width = 1;
        bigArea = 300;
    }

    //constructor cu parametri
    public Rectangle (int lenght, int width, int bigArea){
        setLenght(lenght); //acelasi lucru cu this.lenght = lenght;
        setWidth(width);
        this.bigArea = bigArea;

    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
        // ia variabila lenght de la nivel de clasa (this.lenght) si atribuie-i (=) valoarea pe care o primesti din parametrul metodei
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * calculeaza aria unui dreptunghi
     * @return
     */

    public int calculateArea(){
        return lenght * width;
    }

    public int calculateNumberOfRectangles(){
        return bigArea/calculateArea();
    }
}
