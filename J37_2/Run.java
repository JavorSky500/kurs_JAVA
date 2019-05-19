package J37_2;

import java.io.*;
import java.util.Scanner;

public class Run {


    public static void main(String[] args) throws IOException {

        System.out.println("Podaj swoje imię, a ja zapiszę je do pliku");

        Scanner input = new Scanner(System.in);
        File plikTekstowy = new File("C:\\Users\\kurs\\Desktop\\Projekty ALX\\src\\J37_2\\plikTekstowy.txt");

        /*
        PrintWriter zapis = new PrintWriter(plikTekstowy);

        for(int i=0 ;i<5; i++){
            String imie = input.nextLine().toUpperCase();
            zapis.println(imie);
        }

        zapis.close();
        */
        FileWriter fw = new FileWriter("C:\\Users\\kurs\\Desktop\\Projekty ALX\\src\\J37_2\\plikTekstowy.txt", true);
        fw.append("habalababa\n \t");
        fw.close();

    }
}
