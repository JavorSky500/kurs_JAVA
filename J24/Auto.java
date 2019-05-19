package J24;

public class Auto {

    String marka;
    String model;
    double cena;
    String kolor;
    String silnik;


    public Auto (String marka, String model, double cena, String kolor, String silnik){                                 //KONSTRUKTOR przeze mnnie stworzony z parametrami

        this.marka = marka;
        this.model = model;
        this.cena = cena;
        this.kolor = kolor;
        this.silnik = silnik;

    }

    public String getMarka() {                                                                                          //GETTERY
        return marka;
    }

    public String getModel() {
        return model;
    }

    public Double getCena() {
        return cena;
    }

    public String getKolor() {
        return kolor;
    }

    public String getSilnik() {
        return silnik;
    }

    public void setMarka(String marka) {                                                                                //SETTERY
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setSilnik(String silnik) {
        this.silnik = silnik;
    }

    @Override                                                                                                           //TOSTRING
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + cena +
                ", kolor='" + kolor + '\'' +
                ", silnik='" + silnik + '\'' +
                '}';
    }
}
