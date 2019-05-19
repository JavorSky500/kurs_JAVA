package J29_1;

import java.util.ArrayList;
import java.util.Scanner;

public class PracownikController {

    Scanner input = new Scanner(System.in);
    ArrayList<Pracownik> listaPracownikow = new ArrayList<>();

    public void dodajPracownika() {

        System.out.print("Podaj imię nowego pracownika:  ");
        String wpisaneImie = input.nextLine().toUpperCase();

        System.out.print("Podaj nazwisko nowego pracownika:  ");
        String wpisaneNazwisko = input.nextLine().toUpperCase();

        System.out.print("Podaj na jakim kontrakcie pracownik będzie pracował: STAŻ lub ETAT ");
        String wpisanyKontrakt = input.nextLine().toUpperCase();

        double wpisanaPensja = 1000.0;
        if (wpisanyKontrakt.equals("STAŻ")) {

        } else if (wpisanyKontrakt.equals("ETAT")) {

            System.out.println("Jaka ma być pensja pracownika");
            wpisanaPensja = input.nextDouble();
            input.nextLine();
        }

        Pracownik object = new Pracownik(wpisaneImie, wpisaneNazwisko, wpisanyKontrakt, wpisanaPensja);

        listaPracownikow.add(object);
    }

    public void pokazPracownikow() {
        System.out.println();
        for (Pracownik tmp : listaPracownikow) {
            System.out.println(tmp);
        }
    }

    public void usunPracownika() {

        System.out.println();

        for (Pracownik tmp : listaPracownikow) {
            System.out.println(tmp);
        }

        System.out.println("Podaj nazwisko pracownika do zwolnienia");
        String usunieciePracownika = input.nextLine().toUpperCase();

        for (Pracownik tmp : listaPracownikow) {
            if (tmp.getNazwisko().equals(usunieciePracownika)){
            listaPracownikow.remove(tmp);
            System.out.println("Pracownik został usunięty z listy");}
            break;
        }
    }

    public void zmienKontrakt() {

        System.out.println("Podaj nazwisko pracownika do zmiany kontraktu");
        String pracZmianaKontraktu = input.nextLine().toUpperCase();

        for (Pracownik wysPracownik : listaPracownikow) {
            if (wysPracownik.getNazwisko().equals(pracZmianaKontraktu)) {
                System.out.println("Podaj nowe wynagrodzenie");
                wysPracownik.setKontrakt("ETAT");
                double nowaPensja = input.nextInt();
                wysPracownik.setPensja(nowaPensja);
                System.out.println("Pracownikowi został zmieniony kontrakt");
                break;
            }
        }
    }
}

