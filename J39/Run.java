package J39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {


    public static void main(String[] args) {

        int[] tablica = new int[5];

        tablica[0] = 11;
        tablica[1] = 22;
        tablica[2] = 33;
        tablica[3] = 44;
        tablica[4] = 55;

        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nJaki indeks chcesz zobaczyć ?");

                int index = input.nextInt();
                input.nextLine();
                System.out.println("Na indeksie " + index + " jest liczba " + tablica[index]);

            } catch (ArrayIndexOutOfBoundsException a) {
                System.out.println("Wybrałeś indeks poza zakresem");
            } catch (InputMismatchException e) {
                System.out.println("Nie wpisałes cyfry !!!");
            } finally {
                System.out.println("KONIEC");
                input.nextLine();
            }
        }
    }
}
