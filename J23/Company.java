package J23;

public class Company {

    public static void main(String[] args) {

        Employee pracownik1 = new Employee();
        Employee pracownik2 = new Employee();
        Employee pracownik3 = new Employee();

        pracownik1.imie = "Mateusz";
        pracownik1.nazwisko = "Jaworski";
        pracownik1.data_urodzenia = "14.05.1988r.";
        pracownik1.staż_pracy = 2;

        pracownik2.imie = "Jakub";
        pracownik2.nazwisko = "Palilica";
        pracownik2.data_urodzenia = "22.04.1985r.";
        pracownik2.staż_pracy = 5;

        pracownik3.imie = "Paulina";
        pracownik3.nazwisko = "Niedobrota";
        pracownik3.data_urodzenia = "22.03.1989r.";
        pracownik3.staż_pracy = 6;

        System.out.println("Pracownik nr 1 " + pracownik1.imie +"  " + pracownik1.nazwisko +"  " + pracownik1.data_urodzenia +" " +pracownik1.staż_pracy + "  ");
        System.out.println("Pracownik nr 2 " + pracownik2.imie +"  " + pracownik2.nazwisko +"  " + pracownik2.data_urodzenia +" " +pracownik2.staż_pracy + "  ");
        System.out.println("Pracownik nr 3 " + pracownik3.imie +"  " + pracownik3.nazwisko +"  " + pracownik3.data_urodzenia +" " +pracownik3.staż_pracy + "  ");
    }


}
