package curs1;

public class MyFirstCLass {

    public static void main(String[] args) {

        MyFirstCLass obj = new MyFirstCLass();
        obj.printOnConsole();
        obj.addTwoNumber();

        System.out.println("Hello World, again!");


    }

    public void addTwoNumber(){
        int numar1 = 2;
        int numar2 = 4;
        int sum = numar1 + numar2;
        System.out.println("rezultatul este: " + sum);
    }

    public void printOnConsole(){

        System.out.println("mai printam ceva");
    }
}
