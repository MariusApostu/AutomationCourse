package curs8;

public class Shape {
    String shapeName = "Generic Shape";
    String shapeColour = "Generic Colour";


    public Shape (String Color, String name){
        this.shapeColour = Color;
        this.shapeName = name;
    }

    public void displayDetails (){
        System.out.println("The name of the shape is " + shapeName + "and the colour is " + shapeColour);
    }


}
