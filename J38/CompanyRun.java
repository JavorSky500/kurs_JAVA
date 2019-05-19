package J38;

import java.io.IOException;
import java.util.Scanner;

public class CompanyRun {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        CompanyController companyController = new CompanyController();
        String sourceFile = "C:\\Users\\kurs\\Desktop\\Projekty ALX\\src\\J38\\Company.txt";

        String imie;
        String nazwisko;
        String wyplata;

        System.out.println("Witamy w aplikacji.");
        while (true) {

            System.out.println("\nMasz do wyboru: \nD - DODAJ,\nP - POKAZ,\nU - USUN,\nZ - ZMIEN,\nW - WYSZUKAJ,\nK - KONIEC");
            String decyzja = input.nextLine().toUpperCase();


            if (decyzja.equals("D")) {
                System.out.println("Podaj imie:");
                imie = input.nextLine().toUpperCase();
                System.out.println("Podaj nazwisko:");
                nazwisko = input.nextLine().toUpperCase();
                System.out.println("Podaj wyplate dla pracownika:");
                wyplata = input.nextLine().toUpperCase();

                companyController.dodaj(sourceFile, imie, nazwisko, wyplata);
            }
            if (decyzja.equals("P")) {
                System.out.println("Aktualnie plik zawiera:\n");
                companyController.pokaz(sourceFile);
            }
            if (decyzja.equals("U")) {
                System.out.println("Podaj nazwisko do usunięcia z pliku");
                nazwisko = input.nextLine().toUpperCase();

                companyController.usun(sourceFile, nazwisko);
            }
            if (decyzja.equals("Z")) {
                System.out.println("Podaj nazwisko do zmiany");
                nazwisko = input.nextLine().toUpperCase();
                System.out.println("Podaj nazwisko do zmiany");
                String noweImie = input.nextLine().toUpperCase();
                System.out.println("Podaj nazwisko do zmiany");
                String noweNazwisko = input.nextLine().toUpperCase();
                companyController.zmien(sourceFile, nazwisko, noweImie, noweNazwisko);
            }
            if (decyzja.equals("W")) {

            }
            if (decyzja.equals("K")) {
                System.out.println("Aplikjacja zostanie zamknieta");
                break;
            }

        }
    }
}
