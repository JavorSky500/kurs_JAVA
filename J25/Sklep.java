package J25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sklep {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        HashMap<String, Double> sklep = new HashMap<>();

        sklep.put("chleb", 3.5);
        sklep.put("jajka", 4.3);
        sklep.put("woda", 2.5);
        sklep.put("piwo", 3.0);
        sklep.put("whisky", 60.0);
        sklep.put("cola", 3.5);
        sklep.put("sok", 3.5);
        sklep.put("baton", 3.5);

        ArrayList<Koszyk> koszyki = new ArrayList<>();

        while (true) {

            System.out.println("Witaj w sklepie");
            System.out.println("Czy chcesz rozpocząć zakupy T/N?");

            String decyzja = input.nextLine().toUpperCase();

            if (decyzja.equals("T")) {

                Koszyk obj = new Koszyk();

                // klienta rozpoczyna zakupy
                while (true) {

                    System.out.println("Dodaj produkt do koszyka, Koniec - <ENTER>");
                    System.out.println(sklep);
                    String produkt = input.nextLine();

                    if (!produkt.equals("")) {
                        System.out.println("Podaj ilosc");

                        int ilosc = input.nextInt();
                        input.nextLine();
                        obj.addProduktIlosc(produkt, ilosc);

                    } else {                                                                                //Odłożenie koszyka klienta na taśme w sklepie do podliczenia
                        koszyki.add(obj);
                        break;
                    }
                }
            } else {
                break;
            }
        }
        //Podsumowanie koszyków

        for (Koszyk val : koszyki) {
            //System.out.println(val);

            double suma = 0;
            for (int k = 0; k < val.produkt.size(); k++) {

                System.out.println(val.produkt.get(k) + " " + val.ilosc.get(k) + " " + sklep.get(val.produkt.get(k)));
                suma += sklep.get(val.produkt.get(k)) * val.ilosc.get(k);
            }
            System.out.println("Razem do zapłaty: " + suma);
        }
    }
}
