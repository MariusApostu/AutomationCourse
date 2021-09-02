package curs3;

public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car("Dacia", "hibrid");
        System.out.println(car1.carDetails());

        Car car2 = new Car("Reno", "gas");
        System.out.println(car2.carDetails());

        Car.type = "sedan";
        System.out.println(car1.carDetails());
        System.out.println(car2.carDetails());

        Car car3 = new Car("Aro", "electric");
        System.out.println(car1.carDetails());
        System.out.println(car2.carDetails());
        System.out.println(car3.carDetails());
    }
}
