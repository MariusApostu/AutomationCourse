package curs3;

public class StaticVsNonStatic2 {
    //executatia metodelor statice se face inaintea crearii obiectului
    //metodele si variabilelel statice nu sunt asociate cu obiectul ci cu clasa
    //clasa este template-ul pt obiecte
    //daca staticul este asociat cu clasa, toate obiectele care deriva din clasa respectiva vor avea aceea valoare a variabilelor statice
    //
    //pentru non static am intotdeauna nevoie de obiect

    //variabila de instanta
    public String nume; // o refolosesc cu fiecare obiect nou creat

    //variabila statica
    public static String departament = "QA";

    public static void main(String[] args) {
        //obiect 1
        StaticVsNonStatic2 person1 = new StaticVsNonStatic2();
        person1.nume = "Jhonny";
        System.out.println(person1.nume + departament);
        //obiect 2
        StaticVsNonStatic2 person2 = new StaticVsNonStatic2();
        person2.nume = "Bravo";
        System.out.println(person2.nume + departament);

    }
}
