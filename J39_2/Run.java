package J39_2;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.println("Witam ! W APLIKACJI");

        while (true) {

            System.out.println("Masz do wyboru: \n D - Dodaj \n W - Wypożycz \n R - Rezerwacje samochodów \n S - Statystyki \n K - Koniec");
            String wybor = input.nextLine().toUpperCase();

            if (wybor.equals("D")) {
                System.out.println("Proszę podaj markę samochodu:");
                String marka = input.nextLine().toUpperCase();
                System.out.println("Proszę podaj model samochodu");
                String model = input.nextLine().toUpperCase();
                controller.dodajSamochod(marka, model);
            }
            if (wybor.equals("W")) {
                System.out.println("Podaj od kiedy chcesz wypożyczyć auto: rrrr-mm-dd");
                String odKiedy = input.nextLine().toUpperCase();
                System.out.println("Podaj do kiedy chcesz wypożyczyć auto: rrrr-mm-dd");
                String doKiedy = input.nextLine().toUpperCase();

                if (controller.listaDostepnychSamochodow(odKiedy, doKiedy)) {

                    System.out.println("Podaj markę samochodu");
                    String marka = input.nextLine().toUpperCase();

                    System.out.println("Podaj model samochodu");
                    String model = input.nextLine().toUpperCase();

                    controller.rezerwacjaSamochodu(marka, model, odKiedy, doKiedy);
                }
            }
            if (wybor.equals("R")) {

                controller.rezerwacjeSamochodow();
            }
            if (wybor.equals("S")) {

                controller.statystyki();

            }
            if (wybor.equals("K")) {
                System.out.println("\n --- APLIKACJA ZAMKNIĘTA --- \n");
                break;

            }
        }

    }
}
