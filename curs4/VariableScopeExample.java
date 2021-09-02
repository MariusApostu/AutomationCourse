package curs4;

public class VariableScopeExample {

    //instance variable
    String prenume = "Johnny";
    //static variable
    static String greetings = "Numele meu este ";
    public static void main(String[] args) {

        VariableScopeExample obj = new VariableScopeExample();
        System.out.println(greetings + obj.printeazaNume() + obj.prenume);
    }

    public String printeazaNume (){
        //local variable
        String nume = "Bravo";
        // prenume = "Marius";
        return nume;
    }
}
