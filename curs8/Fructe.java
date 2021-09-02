package curs8;

public class Fructe {

    public String nume;
    public int caloriile;

    public Fructe(String nume, int caloriile) {
        this.nume = nume;
        this.caloriile = caloriile;
    }
    public void printDetalii(){
        System.out.println(nume + " are " + caloriile + " calorii ");
    }
}
