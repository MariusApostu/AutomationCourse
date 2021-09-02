package curs4;

/*
* calculam distanta parcursa in 1000 de zile mergand cu viteza luminii
* viteza luminii este de 186000 mile/s
*/


public class LightSpeedDistance {
    // o variabila a carei valoare nu o schimbam
    public static final int SPEED_OF_LIGHT = 186000;

    //Variabila de instanta
    short days;

    //constructor
    public LightSpeedDistance (short days){
        this.days = days;
    }

    /**
     * transforma zilele in secunde
     * @return : seconds of type int
     */
    public int calculateSecondsFromDays(){
        //local variable
        int seconds = days*24*60*60;
        return seconds;
    }

    public void calculateDistance(){
        long distance;
        distance = calculateSecondsFromDays() * SPEED_OF_LIGHT;
        System.out.println("Distanta parcursa este de : " + distance);
    }

}
