package J29;

public class Student {

    private String imie;
    private String nazwisko;
    private int index;
    public static int count=0;


public Student (String imie, String nazwisko, int index){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.index = index;
    count++;

}

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", index=" + index +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}


