package J37;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Ksiazka> lista = new ArrayList<>();
        File myFile = new File("C:\\Users\\kurs\\Desktop\\Projekty ALX\\src\\J37\\books.txt");
        Scanner rf = new Scanner(myFile);

        while (rf.hasNextLine()) {
            String wiersz = rf.nextLine();
            String[] dane = wiersz.split(",");

            Ksiazka obj = new Ksiazka(dane[0], dane[1], dane[2]);
            lista.add(obj);
        }
        rf.close();

        for (Ksiazka tmp : lista){
            System.out.println("Autor: "+tmp.getAutor()+"\nNazwa książki: " +tmp.getNazwa()+"\nRok Wydania: " +tmp.getRokWydania()+" r.");
            System.out.println();
        }


        PrintWriter zapis = new PrintWriter(myFile);
        zapis.println("dowolny text do zapisania ");
        zapis.close();

    }



}




