package Praca_domowa;

import java.util.Locale;
import java.util.Scanner;

public class Praca_domowa3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Prosze podać ciąg liczb całkowitych.\nWpisanie liczby 0 zakończy wprowadzanie danych. Liczba ZERO nie jest brana pod uwagę w obliczeniach.\nNastepnie program wyświetli:\n - Największą liczbę\n - Najmniejszą liczbę\n - Sumę liczb\n - Srednią arytmetyczną liczb");

        int liczba;

        System.out.println("Podaj pierwszą liczbę: ");
        liczba = input.nextInt();

        
        int max = liczba;
        int min = liczba;
        double suma = 0;
        double ile = 0;
        double srednia = 0;

        while (liczba !=0) {

           if (max < liczba) {
               max = liczba;
           }
           if (min > liczba) {
               min = liczba;
           }
           suma = suma + liczba;
           ile = ile + 1;
           srednia = suma/ile;

           System.out.println("Podaj kolejną liczbę: ");
           liczba = input.nextInt();
           input.nextLine();
           }

         System.out.println("Najwieksza z podanych liczb to: " + max);
         System.out.println("Najmniejsza z podanych liczb to: " + min);
         System.out.println("Suma wszystkich liczb wynosi: "+ suma);
         System.out.println("Srednia arytmetyczna z podanych liczb wynosi: "+ srednia);

        }

    }

