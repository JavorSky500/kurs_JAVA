package J26_1;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Auto auto = new Auto("Skoda", "fabia");


        while (true) {
            System.out.println("Podaj PIN");
            Scanner input = new Scanner(System.in);
            int haslo = input.nextInt();
            input.nextLine();

            if (haslo == 0) {
                break;
            }
            auto.alarm(haslo);
            System.out.println(auto);
        }


    }
}
