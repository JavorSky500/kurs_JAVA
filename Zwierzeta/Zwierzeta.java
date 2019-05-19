package Zwierzeta;

public class Zwierzeta {

    public String imie;
    public int wiek;
    public String kolorSiersci;

    public Zwierzeta (String imie, int wiek, String kolorSiersci){

        this.imie = imie;
        this.wiek = wiek;
        this.kolorSiersci = kolorSiersci;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getKolorSiersci() {
        return kolorSiersci;
    }

    public void setKolorSiersci(String kolorSiersci) {
        this.kolorSiersci = kolorSiersci;
    }
}
