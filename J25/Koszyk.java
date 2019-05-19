package J25;

import java.util.ArrayList;

public class Koszyk {

    ArrayList<String> produkt = new ArrayList<>();
    ArrayList<Integer> ilosc = new ArrayList<>();

    public void addProduktIlosc(String produkt, int ilosc){

        this.produkt.add(produkt);
        this.ilosc.add(ilosc);

    }

    @Override
    public String toString() {
        return "Koszyk{" +
                "produkt=" + produkt +
                ", ilosc=" + ilosc +
                '}';
    }
}
