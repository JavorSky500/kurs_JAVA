package Praca_domowa;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Zgadywanka {

    public static void main(String[] args) {

        HashMap<Integer, Character> slowo = new HashMap<>();
        HashMap<Integer, Character> szyfr = new HashMap<>();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Witam w grze ZGADYWANKA !!! \n");
        System.out.println("GRACZ 1: Podaj nazwę do odgadnięcia dla drugiego gracza: ");
        String haslo = input.nextLine().toUpperCase();

        for (int k = 0; k < haslo.length(); k++) {                                                              // wpisanie szyfru i hasła do dwoch oddzielnych tablic ale z tymi samymi kluczami
            slowo.put(k, haslo.charAt(k));
            szyfr.put(k, '-');
        }
        //System.out.println(slowo);
        //System.out.println(szyfr);

        System.out.println("GRACZ 2:\nWybrane słowo ma " + slowo.size() + " liter");                            // pokazanie zaszyfrowanego hasła

        for (int klucz : szyfr.keySet()) {
            System.out.print(" " + szyfr.get(klucz) + " ");
        }

        System.out.println("\nUWAGA !!! " +
                "\n- Podanie słowa skłądającego się z " + slowo.size() + " liter uznawane będzie na próbę odgadnięcia hasła" +
                "\n- GRACZ ma 5 prób aby odgadnąć hasło" +
                "\n- GRACZ aby wygrac musi wpisac cale poprawne haslo mając do dyspozycji SZANSE" +
                "\n- GRACZ może podać jedną literę do odkrycia w jednej SZANSIE" +
                "\n- Wpisanie wiekszej ilość liter uznane będzie za utratę SZANSY");


        for (int i = 0; i < 5; i++) {                                                                            // główna petla w programie definiujaca ilosc szans

            System.out.println("\nSZANSA " + (i + 1));

            String proba = input.nextLine().toUpperCase();

            if (proba.length() == slowo.size()) {                                                                        // 1. Odgadywanie całego hasła
                int licznik = 0;

                for (int w = 0; w < slowo.size(); w++) {                                                                 // porownanie proby odgadniecia hasła do wpisanego słowa
                    if (proba.charAt(w) == slowo.get(w)) {                                                               // jeśli licznik + to dany klucz pokrywa sie z haslem
                        licznik++;
                    }
                    //System.out.println(licznik);
                }
                if (licznik == slowo.size()) {                                                                           // Jesli wszystkie klucze pasuja to WYGRANA

                    for (int klucz : slowo.keySet()) {
                        System.out.print(" " + slowo.get(klucz) + " ");
                    }
                    System.out.println();
                    System.out.println("BRAWO ODGADŁEŚ HASŁO!!!\n");

                    for (int z = 0; z < slowo.size(); z++) {                                                             // wpisanie hasla do szyfru
                        szyfr.put(z, slowo.get(z));
                    }
                    break;
                } else {
                    System.out.println("PUDŁO !!!");
                }
            } else if (proba.length() == 1) {                                                                           // Odgadywanie 1 literki

                if (slowo.containsValue(proba.charAt(0))) {
                    System.out.println("ZGADŁEŚ");
                    for (int q = 0; q < slowo.size(); q++) {

                        if (proba.charAt(0) == slowo.get(q)) {
                            szyfr.put(q, proba.charAt(0));
                        }
                    }
                    for (int klucz : szyfr.keySet()) {
                        System.out.print(" " + szyfr.get(klucz) + " ");
                    }
                } else {
                    System.out.println("PUDŁO");
                    for (int klucz : szyfr.keySet()) {
                        System.out.print(" " + szyfr.get(klucz) + " ");
                    }
                }
            } else {                                                                                                    // wpisanie wiecej ilosci literek
                System.out.println("STRACIEŁEŚ SZANSE !!!");
            }
        }
        int sprawdzenie = 0;
        for (int r = 0; r < slowo.size(); r++) {
            if (szyfr.get(r) == slowo.get(r)) {
                sprawdzenie++;
            }
        }
        //System.out.println("\n" + sprawdzenie);
        if (sprawdzenie != slowo.size()) {
            System.out.println("\nNIE ODGADŁES HASŁA :(");
        }
    }
}

