package curs8;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Fructe fructe[] = new Fructe[4];
        fructe[0] = new Fructe("mar", 150);
        fructe[1] = new Fructe("para", 90);
        fructe[2] = new Fructe("banana", 99);
        fructe[3] = new Fructe("pruna", 50);

        for(Fructe fruct : fructe){
            fruct.printDetalii();
        }

    }
}
