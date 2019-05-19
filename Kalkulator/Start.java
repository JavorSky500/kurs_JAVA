package Kalkulator;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Podaj 1 liczbe: ");

            int liczba1 = input.nextInt();
            input.nextLine();

            System.out.println("Podaj 2 liczbę: ");

            int liczba2 = input.nextInt();
            input.nextLine();

            System.out.println("Podaj dziłanie jakie chcesz przeprowadzić: \n Masz do wyboru: + dodawanie, - odejmowanie, * mnozenie, / dzielenie");
            String dzialanie = input.nextLine();

            switch (dzialanie) {

                case ("+"):
                    double wynik1 = kalkulator.dodawanie(liczba1, liczba2);
                    System.out.println("Wynik działania wynosi: " + wynik1);
                    break;
                case ("-"):
                    double wynik2 = kalkulator.odejmowanie(liczba1, liczba2);
                    System.out.println("Wynik działania wynosi: " + wynik2);
                    break;
                case ("*"):
                    double wynik3 = kalkulator.iloczyn(liczba1, liczba2);
                    System.out.println("Wynik działania wynosi: " + wynik3);
                    break;
                case ("/"):
                    double wynik4 = kalkulator.iloraz(liczba1, liczba2);
                    System.out.println("Wynik działania wynosi: " + wynik4);
                    break;
                default:
                    System.out.println("nie wybrałeś odpowiedniego dzialania");

                    input.close();
            }

            System.out.println("Czy chcesz jeszcze raz ?");
            String decyzja = input.nextLine().toUpperCase();

            if (decyzja.equals("NIE")) {
                break;
            }
        }
    }
}