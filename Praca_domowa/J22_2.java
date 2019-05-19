package Praca_domowa;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class J22_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Program do sortowania ciągu liczb całkowitych, 0 - koniec wpisywania\n");

        while (true) {

            System.out.println("Podaj liczbę");
            int liczba = input.nextInt();

            if (lista.isEmpty()) {
                lista.add(liczba);
            } else if (liczba == 0) {
                break;
            } else if (liczba < lista.get(0)) {
                //System.out.println("Dodaje na początek listy");
                lista.add(0, liczba);
            } else if (liczba > lista.get(lista.size() - 1)) {
                //System.out.println("Dodaje na koniec listy");
                lista.add(liczba);
            } else if (liczba > lista.get(0) && liczba < lista.get(lista.size() - 1)) {
                //System.out.println("Dodaje do środka listy");
                for (int i = 0; i < lista.size(); i++) {
                    if (liczba < lista.get(i)) {
                        lista.add(i, liczba);
                        break;
                    }
                }
            }
        }
        System.out.println("Posegregowana lista wygląda następująco: ");
        for (int wys : lista) {
            System.out.println(wys);
        }
        System.out.println("Lista ma: " + lista.size() + " elementów");
    }
}

