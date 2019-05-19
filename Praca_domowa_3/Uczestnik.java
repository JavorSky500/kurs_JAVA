package Praca_domowa_3;

public class Uczestnik extends Kurs{

    private String imieUczestnika;
    private String nazwiskoUczestnika;

    public Uczestnik (String nazwaKursu, String imieUczestnika, String nazwiskoUczesnika){
        super (nazwaKursu);
        this.imieUczestnika = imieUczestnika;
        this.nazwiskoUczestnika = nazwiskoUczesnika;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "imieUczestnika='" + imieUczestnika + '\'' +
                ", nazwiskoUczesnika='" + nazwiskoUczestnika + '\'' +
                ", nazwaKursu='" + nazwaKursu + '\'' +
                '}';
    }

    public String getImieUczestnika() {
        return imieUczestnika;
    }

    public void setImieUczestnika(String imieUczestnika) {
        this.imieUczestnika = imieUczestnika;
    }

    public String getNazwiskoUczesnika() {
        return nazwiskoUczestnika;
    }

    public void setNazwiskoUczesnika(String nazwiskoUczesnika) {
        this.nazwiskoUczestnika = nazwiskoUczesnika;
    }
}
