package J30_1;

public class Pojazd_kolowy extends Pojazd {

    int liczba_kol;

    public Pojazd_kolowy ( int waga, int moc_silnika, String kolor, int liczna_pasazerow, double cena, int liczba_kol){
        super(waga, moc_silnika, kolor, liczna_pasazerow, cena);
        this.liczba_kol = liczba_kol;
    }

    @Override
    public String toString() {
        return "Pojazd_kolowy{" +
                "liczba_kol=" + liczba_kol +
                ", waga=" + waga +
                ", moc_silnika=" + moc_silnika +
                ", kolor='" + kolor + '\'' +
                ", liczba_pasazerow=" + liczba_pasazerow +
                ", cena=" + cena +
                '}';
    }
}
