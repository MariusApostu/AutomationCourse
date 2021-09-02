package curs7;

public class ForEachExample2 {

    public static void main(String[] args) {

        String[] cities = {"Iasi","Cluj","Arad","Oradea"};

        for (String oras: cities){ //for Each

            if(oras.equals("Arad")){
                continue;
            }
            System.out.println(oras);
        }

    }
}
