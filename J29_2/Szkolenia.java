package J29_2;

public class Szkolenia extends Oprogramowanie {

    String termin;

    public Szkolenia(String nazwa, double cena, String jezyk, String system, String termin) {
        super(nazwa, cena, jezyk, system);
        this.termin = termin;
    }

    @Override
    public String toString() {
        return "Szkolenia{" +
                "termin='" + termin + '\'' +
                ", jezyk='" + jezyk + '\'' +
                ", system='" + system + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
