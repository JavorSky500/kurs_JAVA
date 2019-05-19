package J35_1;

public abstract class Sportowiec {

    private int predkosc=0;

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public abstract void przyspiesz();                        //metoda abstrakcyjna

    @Override
    public String toString() {
        return "Sportowiec{" +
                "predkosc=" + predkosc +
                '}';
    }
}
