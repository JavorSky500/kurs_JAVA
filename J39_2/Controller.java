package J39_2;

import java.util.ArrayList;

public class Controller {


    ArrayList<Samochod> listaSamochodow = new ArrayList<>();

    public void dodajSamochod(String marka, String model) {

        Samochod samochod = new Samochod(marka, model);
        listaSamochodow.add(samochod);
    }

    public boolean listaDostepnychSamochodow(String odKiedy, String doKiedy) {

        boolean jest = false;
        System.out.println("Lista dostępnych samochodów:");

        for (Samochod samochod : listaSamochodow) {
            if (samochod.sprawdzTermin(odKiedy,doKiedy) == true){
            System.out.println(samochod);
            jest = true;
            }
        }

        if (jest == false) {
            System.out.println("--- BRAK DOSTĘPNYCH TERMINÓW ---");
        }
        return jest;
    }

    public void rezerwacjaSamochodu(String marka, String model, String odKiedy, String doKiedy) {

        for (Samochod tmp : listaSamochodow) {
            System.out.println();
            if (tmp.getMarka().equals(marka) && tmp.getModel().equals(model)) {
                tmp.dodajTermin(odKiedy, doKiedy);
                break;
            }
            System.out.println();
        }

    }

    public void rezerwacjeSamochodow() {


        for (Samochod samochod : listaSamochodow) {
            System.out.println(samochod + " " + (samochod.historia.size()));

            for (String[] tab : samochod.historia) {
                System.out.println("   "+tab[0] + " - " + tab[1]);
            }
            System.out.println("   ");
        }
    }

    public void statystyki() {

        for (Samochod tmp : listaSamochodow) {
            System.out.println(tmp.getMarka() + " " + tmp.getModel() + " " + tmp.historia.size());
        }
    }
}
