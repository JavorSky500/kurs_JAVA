package J30_1;

public class Samolot extends Pojazd {

    int pulap;

    public Samolot (int waga, int moc_silnika, String kolor, int liczna_pasazerow, double cena, int pulap) {
        super(waga, moc_silnika, kolor, liczna_pasazerow, cena);
        this.pulap = pulap;
    }


}

