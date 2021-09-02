package curs8;

public class Square extends Shape {
    String shapeName = "Square";
    String shapeColour = "black";

    public void displayDetails() {
        System.out.println("The name of the shape is " + super.shapeName + "and the colour is " + super.shapeColour);
    }

    public Square (String Color, String Name){
        super(Color, Name );
    }
}
