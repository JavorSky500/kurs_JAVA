package J29_1;

import java.util.Scanner;

public class Firma extends PracownikController {

    Scanner input = new Scanner(System.in);

    public String nazwaFirmy;

    public Firma(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;

        System.out.println("Witaj w firmie " + nazwaFirmy);

        while (true) {

            System.out.println("\nD - DODAJ, P - POKAŻ, U - USUN, Z - ZMIANA KONTRAKTU, K - KONIEC");

            String wybor = input.nextLine().toUpperCase();

            if (wybor.equals("K")) {
                break;
            } else if (wybor.equals("D")) {
                dodajPracownika();
            } else if (wybor.equals("P")) {
                pokazPracownikow();
            } else if (wybor.equals("U")) {
                usunPracownika();
            } else if (wybor.equals("Z")) {
                zmienKontrakt();
            } else {
                System.out.println("Źle wybrałeś. Prozszę ponownie wybrać.");
            }

        }
    }
}
