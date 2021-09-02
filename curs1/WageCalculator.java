package curs1;

public class WageCalculator {

    int numarOreLucrate = 40;

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setNume("Marius");
        tester1.setRatePerHour(25);
        tester1.setAge(35);

        Tester tester2 = new Tester();
        tester2.setNume("Olivia");
        tester2.setRatePerHour(29);
        tester2.setAge(30);

        Tester tester3 = new Tester();
        tester3.setNume("Eric");
        tester3.setRatePerHour(5000);
        tester3.setAge(30);

        WageCalculator calc = new WageCalculator();

        System.out.println("salariul lui " + tester1.getNume() + " este " + calc.calculateSalary(tester1.getRatePerHour()) + "!");
        System.out.println("salariul lui " + tester2.getNume() + " este " + calc.calculateSalary(tester2.getRatePerHour()) + "!");
        System.out.println("salariul lui " + tester3.getNume() + " este " + calc.calculateSalary(tester3.getRatePerHour()) + "!");
        System.out.println(tester1.getNume() + " are: " + tester1.getAge() + " ani!");
        System.out.println(tester2.getNume() + " are: " + tester2.getAge() + " ani!");
        System.out.println(tester3.getNume() + " are: " + tester3.getAge() + " ani!");

    }

    public int calculateSalary(int plataPeOra){

        int salary = plataPeOra * numarOreLucrate;

        return salary;

    }
}
