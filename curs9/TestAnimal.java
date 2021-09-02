package curs9;

public class TestAnimal {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

/*
        Deer bambi = new Deer();
        bambi.eatGrass();
        bambi.makeSound();

        Lion simba = new Lion();
        simba.eatMeat();
        simba.makeSound();
*/

        Animal simba = new Lion();
        // simba.eatMeat();
        ((Lion) simba).eatMeat();
        simba.makeSound();

    }
}
