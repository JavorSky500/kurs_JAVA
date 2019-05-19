package J39_2;

import java.util.ArrayList;

abstract public class Kalendarz implements KalendarzDane {

    public ArrayList<String[]> historia = new ArrayList<>();

    abstract public int Statystyki();

    @Override
    public boolean sprawdzTermin(String odKiedy, String doKiedy) {
        boolean jest = true;
        for (String[] tmp : historia) {

            if ((tmp[0].compareTo(odKiedy) <= 0 && tmp[1].compareTo(odKiedy) >= 0) || (tmp[0].compareTo(doKiedy) <= 0 && tmp[1].compareTo(doKiedy) >= 0)) {
                jest = false;
            }
        }
        return jest;
    }

    @Override
    public void dodajTermin(String odKiedy, String doKiedy) {
        String[] daty = {odKiedy, doKiedy};
        historia.add(daty);
    }
}

