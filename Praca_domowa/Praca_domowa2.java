package Praca_domowa;

import java.util.Locale;
import java.util.Scanner;

public class Praca_domowa2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Prosze wpisz dowolne słowo a ja wypisze każdą z liter oraz wypisze ile razy dana litera się powtarza");

        String slowo;
        slowo = input.nextLine();
        for (int i = 0; i < slowo.length(); i++) {

            char litera = slowo.charAt(i);
            int przeducieciem = slowo.length();
            String new_slowo = slowo.replace(String.valueOf(litera), "");
            int poucieciu = new_slowo.length();
            int powtorzenia = przeducieciem-poucieciu;

            System.out.println(litera + " - " + powtorzenia);
            }
        }
    }

