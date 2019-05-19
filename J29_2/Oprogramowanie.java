package J29_2;

public class Oprogramowanie extends Produkt{

    String jezyk;
    String system;

    public Oprogramowanie(String nazwa, double cena, String jezyk, String system) {
        super(nazwa, cena);
        this.jezyk = jezyk;
        this.system = system;
    }
}
