package Praca_domowa;

import java.util.Locale;
import java.util.Scanner;

public class Praca_domowa1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Prosze podaj jakąś liczbę a ja ją spróbuje odczytać pisemnie");

        String liczba;
        liczba = input.nextLine();

        for (int i = 0; i < liczba.length(); i++) {

            char  znak = liczba.charAt(i);

            switch (znak){

            case '1':
                System.out.print("JEDEN  ");
                break;
            case '2':
                System.out.print("DWA  ");
                break;
            case '3':
                System.out.print("TRZY  ");
                break;
            case '4':
                System.out.print("CZTERY  ");
                break;
            case '5':
                System.out.print("PIĘĆ  ");
                break;
            case '6':
                System.out.print("SZEŚĆ  ");
                break;
            case '7':
                System.out.print("SIEDEM  ");
                break;
            case '8':
                System.out.print("OSIEM  ");
                break;
            case '9':
                System.out.print("DZIEWIĘĆ  ");
                break;
            case '0':
                System.out.print("ZERO  ");
                break;
            default:
            System.out.println("Nie wpisałeś liczby");

        }

        }
    }
}