package J26_3;

import java.util.Random;

public class Sejf {

    private int tajnaLiczba;

    public Sejf(){

        Random ran = new Random();
        this.tajnaLiczba = ran.nextInt(101);

    }

    public boolean  odczyt (int pin){

            if (pin == 1234) {
                System.out.println(tajnaLiczba);
                return true;
            } else {
                System.out.println("Brak dostepu");
                return false;
            }

    }

}
