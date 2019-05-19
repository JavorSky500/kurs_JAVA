package J26_3;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {


        Sejf sejf = new Sejf();

        Scanner input = new Scanner(System.in);

        System.out.println("Chcesz poznać tajną liczbę ??");

        while (true) {
            System.out.println("Podaj tajny PIN");

            int haslo = input.nextInt();
            input.nextLine();

            if (sejf.odczyt(haslo)) {
                break;

            }


        }

    }
}
