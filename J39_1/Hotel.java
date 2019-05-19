package J39_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String termin;
        int iloscDni;
        int iloscOsob;
        String sniadanie;
        String imie;

        System.out.println("FORMULARZ REJESTRACJI POKOJU HOTELOWEGO \n");

        while (true) {

            System.out.println("Imię osoby rezerwującej");
            imie = input.nextLine().toUpperCase();
            boolean ok = true;

            if (imie.length() > 0) {
                for (int i = 0; i < imie.length(); i++) {
                    //System.out.println(imie.charAt(i));
                    int znak = imie.charAt(i);
                    //System.out.println(znak);
                    if ((znak > 65 && znak < 90)) {
                        System.out.println("Błedne imie");
                        ok = false;
                        break;
                    }
                }
            }
            if(ok == true) {
                break;
            }
        }

        while (true) {

            System.out.println("Prosze podac termin przybycia FORMAT (rrrr-mm-dd)");
            termin = input.nextLine();
            if (termin.length() != 10) {
                System.out.println("\nŹle wpisałeś date\n");
                continue;
            }
            String[] terminTab = termin.split("-");

            try {
                if (terminTab[0].length() != 4 || terminTab[1].length() != 2) {
                    System.out.println("\nŹle wpisałeś date\n");
                    continue;
                }
                Integer.parseInt(terminTab[0]);
                Integer.parseInt(terminTab[1]);
                Integer.parseInt(terminTab[2]);

                //System.out.println("ROK: " + rokRezerwacji + " MIESIAC: " + miesiacRezerwacji + " DZIEN: " + dzienRezerwacji);            \\sprawdzenie
                break;

            } catch (Exception e) {
                System.out.println("\nŹle wpisałeś date\n");
                continue;
            }
        }

        while (true) {

            try {
                System.out.println("Prosze podac ilość dni");
                iloscDni = input.nextInt();
                input.nextLine();
                if (iloscDni > 0) {
                    break;
                } else {
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nŹle wpisałeś date\n");
                input.nextLine();
                continue;
            }
        }

        while (true) {

            try {
                System.out.println("Prosze podac ilość osób do zakwaterowania");
                iloscOsob = input.nextInt();
                input.nextLine();
                if (iloscOsob > 0) {
                    break;
                } else {
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nŹle wpisałeś ilość osób\n");
                input.nextLine();
                continue;
            }
        }

        while (true) {

            System.out.println("Czy osoba/osoby chcą śniadanie? T/N");
            sniadanie = input.nextLine().toUpperCase();

            if (sniadanie.equals("T") || sniadanie.equals("N")) {
                break;
            } else {
                continue;
            }
        }

        System.out.println(imie + " zarezerwował(a) pokoj na:" + iloscDni + " dni dla " + iloscOsob + " osób na termin: " + termin);


    }

}

