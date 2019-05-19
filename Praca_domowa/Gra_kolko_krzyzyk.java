package Praca_domowa;

import java.util.Locale;
import java.util.Scanner;

public class Gra_kolko_krzyzyk {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Gra kółko i krzyżyk dla dwóch graczy");
        System.out.println("\nTABLICA dla graczy wyglada następujaco\n[ 00 , 01 , 02 ]\n[ 10 , 11 , 12 ]\n[ 20 , 21 , 22 ]\n");
        char[][] tablica = new char[3][3];
        int i =0;
        int j=0;

        while (i<4 && j<4){

            while (true){
                System.out.println("GRACZ 1 - KÓŁKO");
                String kolko = input.nextLine();
                int wiersz_kolko = kolko.charAt(0) - 48;
                int kolumna_kolko = kolko.charAt(1) - 48;

                if (tablica[wiersz_kolko][kolumna_kolko] !='O' && tablica[wiersz_kolko][kolumna_kolko]!='X' && kolko.length()<3 ) {        // sprawdzanie czy pole jest puste
                    tablica[wiersz_kolko][kolumna_kolko] = 'O';
                    break;
                }
                System.out.println("Pole jest juz zajęte lub źle wpisałeś pole ! Wybierz ponownie\n");
                }
            for (char[] wiersz : tablica) {                                                                             // wyświetlanie aktualnej tablicy po wyborze gracza 1
            for (char kolumna : wiersz) {
                System.out.print("| " + kolumna + " ");
                }
                System.out.println();
                }
                System.out.println();
            i++;
            // SPRAWDZENIE CZY WYGRAŁ GRACZ 1
            if      (tablica[0][0]=='O' && tablica[0][1]=='O' && tablica[0][2]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[1][0]=='O' && tablica[1][1]=='O' && tablica[1][2]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[2][0]=='O' && tablica[2][1]=='O' && tablica[2][2]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[0][0]=='O' && tablica[1][0]=='O' && tablica[2][0]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[0][1]=='O' && tablica[1][1]=='O' && tablica[2][1]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[0][2]=='O' && tablica[1][2]=='O' && tablica[2][2]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[0][0]=='O' && tablica[1][1]=='O' && tablica[2][2]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }
            else if (tablica[0][2]=='O' && tablica[1][1]=='O' && tablica[2][0]=='O') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
            }

            while (true) {
                System.out.println("GRACZ 2 - KRZYŻYK");
                String krzyzyk = input.nextLine();
                System.out.println();
                int wiersz_krzyzyk = krzyzyk.charAt(0) - 48;
                int kolumna_krzyzyk = krzyzyk.charAt(1) - 48;

                if (tablica[wiersz_krzyzyk][kolumna_krzyzyk] != 'O' && tablica[wiersz_krzyzyk][kolumna_krzyzyk] != 'X' && krzyzyk.length() < 3) {    // sprawdzanie czy pole jest puste
                    tablica[wiersz_krzyzyk][kolumna_krzyzyk] = 'X';
                    break;
                }
                System.out.println("Pole jest juz zajęte lub źle wpisałeś pole ! Wybierz ponownie\n");
                }

            for (char[] wiersz : tablica) {                                                                             // wyświetlanie aktualnej tablicy po wyborze gracza 2
            for (char kolumna : wiersz) {
                System.out.print("| " + kolumna + " ");
                }
                System.out.println();
                }
                System.out.println();
            j++;
            // SPRAWDZENIE CZY WYGRAŁ GRACZ 2
            if      (tablica[0][0]=='X' && tablica[0][1]=='X' && tablica[0][2]=='X') {
                System.out.println("WYGRYWA GRACZ 1");
                break;
                }
            else if (tablica[1][0]=='X' && tablica[1][1]=='X' && tablica[1][2]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
            else if (tablica[2][0]=='X' && tablica[2][1]=='X' && tablica[2][2]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
            else if (tablica[0][0]=='X' && tablica[1][0]=='X' && tablica[2][0]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
            else if (tablica[0][1]=='X' && tablica[1][1]=='X' && tablica[2][1]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
            else if (tablica[0][2]=='X' && tablica[1][2]=='X' && tablica[2][2]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
            else if (tablica[0][0]=='X' && tablica[1][1]=='X' && tablica[2][2]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
            else if (tablica[0][2]=='X' && tablica[1][1]=='X' && tablica[2][0]=='X') {
                System.out.println("WYGRYWA GRACZ 2");
                break;
                }
        }
        input.close();
        if (i>=4 || j>=4) {
            System.out.println("REMIS");
        }
    }
}

