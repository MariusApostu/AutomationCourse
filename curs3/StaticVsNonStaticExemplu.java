package curs3;

public class StaticVsNonStaticExemplu {

    //Instance area // instance inseamna ca a fost creat un obiect
    public String nume = "Apostu";
    public String printeazaMesaj(){
        return "Hello" + prenume;
    }

    //End of instance area



    //Static area
    public static String prenume = "Marius";
    public static String printeazaMesajStatic(){
        return "Hello static " + prenume;
    }

    //End of static area

    public static void main(String[] args) {
        StaticVsNonStaticExemplu obj = new StaticVsNonStaticExemplu();
        System.out.println("Hello din main cu obj: " + obj.nume);
        System.out.println(obj.printeazaMesaj());//obj.printeazaMesaj = Hello Marius

        obj.printeazaMesajStatic();

        System.out.println(printeazaMesajStatic());
    }
}
