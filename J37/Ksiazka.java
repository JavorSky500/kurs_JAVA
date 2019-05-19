package J37;

public class Ksiazka {

    public String nazwa;
    public String autor;
    public String rokWydania;

    public Ksiazka(String nazwa, String autor, String rokWydania) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(String rokWydania) {
        this.rokWydania = rokWydania;
    }
}
