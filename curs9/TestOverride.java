package curs9;

public class TestOverride {

    public static void main(String[] args) {

        Shape shape = new Shape();
        shape.draw();
        shape.printClass();
        System.out.println(shape.x);

        Cerc cerc = new Cerc();
        cerc.draw();
        cerc.printClass();
        System.out.println(cerc.x);

        Patrat patrat = new Patrat();
        patrat.draw();
        patrat.printClass();
        System.out.println(patrat.x);
    }
}
