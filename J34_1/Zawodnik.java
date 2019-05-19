package J34_1;

public class Zawodnik implements Zawody {

    public String imie;
    public int wiek;
    public int waga;

    public Zawodnik (String imie, int wiek, int waga) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Zawodnik{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", waga=" + waga +
                '}';
    }

    @Override
    public void plywanie() {
        System.out.println("pływa !!!");
    }

    @Override
    public void skakanie() {
        System.out.println("skacze !!!");
    }

    @Override
    public void bieganie() {
        System.out.println("biega !!!");
    }
}
