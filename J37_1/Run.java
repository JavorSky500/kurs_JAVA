package J37_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Imiona> lista = new ArrayList<>();
        File myFile = new File("C:\\Users\\kurs\\Desktop\\Projekty ALX\\src\\J37_1\\imiona.txt");
        Scanner rf = new Scanner(myFile);

        int licznik =1;

        while (rf.hasNextLine()) {

            String imie = rf.nextLine();
            Imiona obj = new Imiona(imie);
            lista.add(obj);

        }
        rf.close();

        for (Imiona tmp : lista){
            System.out.println("Imię: (" +licznik+ ")  "+tmp.getImiona());
            licznik++;
        }
    }
}
