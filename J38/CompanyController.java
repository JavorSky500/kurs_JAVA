package J38;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompanyController {

    public void dodaj(String sourceFile, String imie, String nazwisko, String wyplata) throws IOException {

        FileWriter fw = new FileWriter(sourceFile, true);
        fw.append(imie + ";" + nazwisko + ";" + wyplata + ";" + "\n");
        fw.close();
    }


    public void pokaz(String sourceFile) throws FileNotFoundException {

        File myFile = new File(sourceFile);
        Scanner rf = new Scanner(myFile);

        while (rf.hasNextLine()) {
            System.out.println(rf.nextLine());
        }
        rf.close();
    }

    public void usun(String sourceFile, String nazwisko) throws IOException {

        ArrayList<String> templist = new ArrayList<>();
        File myFile = new File(sourceFile);
        Scanner rf = new Scanner(myFile);

        while (rf.hasNextLine()) {

            String wiersz = rf.nextLine();
            String[] dane = wiersz.split(";");

            if (!dane[1].equals(nazwisko)) {
                templist.add(wiersz);
            }
        }
        rf.close();

        FileWriter fw = new FileWriter(sourceFile, false);
        for (String tmp : templist) {
            fw.append(tmp);
            System.out.println("\n");
        }
        fw.close();
    }

    public void zmien(String sourceFile, String nazwisko, String noweImie, String noweNazwisko) throws IOException {

        ArrayList<String> templist = new ArrayList<>();
        File myFile = new File(sourceFile);
        Scanner rf = new Scanner(myFile);

        while (rf.hasNextLine()) {

            String wiersz = rf.nextLine();
            String[] dane = wiersz.split(";");
            if (dane[1].equals(nazwisko)) {

                if (!noweImie.equals("")) {
                    dane[0] = noweImie;
                }
                if (!noweNazwisko.equals("")) {
                    dane[1] = noweNazwisko;
                }
            }
            templist.add(dane[0] + ";" + dane[1] + ";" + "\n");

        }
        rf.close();

        FileWriter fw = new FileWriter(sourceFile, false);
        for (String tmp : templist) {
            fw.append(tmp);
        }
        fw.close();

    }
}
