package curs8;

public class TesterEnheritance {

    public static void main(String[] args) {

        TesterAutomat tester1 = new TesterAutomat();

        tester1.setLimbajProgramare("JAVA"); //clasa TesterAutomat
        tester1.setDepartament("QA"); // clasa Tester
        tester1.setSeniority("junior"); //clasa Tester
        tester1.setEmail("matei@matei.ro"); //clasa Angajat
        tester1.setName("Matei"); // clasa Angajat

        System.out.println("Numele angajatului este " + tester1.getName()+", face parte din dept. " + tester1.getDepartament()+ ", este de nivel "
        + tester1.getSeniority() + " si foloseste " + tester1.getLimbajProgramare() + " pentru a scrie teste!");


    }
}
