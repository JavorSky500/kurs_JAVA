package J30_1;

public class Lodz extends Pojazd {

    int zanurzenie;

    public Lodz (int waga, int moc_silnika, String kolor, int liczna_pasazerow, double cena, int zanurzenie) {
        super(waga, moc_silnika, kolor, liczna_pasazerow, cena);
        this.zanurzenie = zanurzenie;
    }

}
