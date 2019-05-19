package J30_1;

public class Samochod extends Pojazd_kolowy {

    String typ_felg;

    public Samochod (int waga, int moc_silnika, String kolor, int liczna_pasazerow, double cena, int liczba_kol, String typ_felg) {
        super(waga, moc_silnika, kolor, liczna_pasazerow, cena, liczba_kol);
        this.typ_felg = typ_felg;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "typ_felg='" + typ_felg + '\'' +
                ", liczba_kol=" + liczba_kol +
                ", waga=" + waga +
                ", moc_silnika=" + moc_silnika +
                ", kolor='" + kolor + '\'' +
                ", liczba_pasazerow=" + liczba_pasazerow +
                ", cena=" + cena +
                '}';
    }
}
