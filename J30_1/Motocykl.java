package J30_1;

public class Motocykl extends Pojazd_kolowy{

    String bagaznik_na_kask;

    public Motocykl(int waga, int moc_silnika, String kolor, int liczna_pasazerow, double cena, int liczba_kol, String bagaznik_na_kask) {
        super(waga, moc_silnika, kolor, liczna_pasazerow, cena, liczba_kol);
        this.bagaznik_na_kask = bagaznik_na_kask;
    }
}
