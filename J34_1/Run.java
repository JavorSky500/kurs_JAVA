package J34_1;

import java.util.ArrayList;

public class Run {



    public static void main(String[] args) {
        ArrayList<Zawodnik> listaZawodnikow= new ArrayList<>();

        Zawodnik zawodnik1 = new Zawodnik("Mateusz",30,90);
        Zawodnik zawodnik2 = new Zawodnik("Łukasz",33,100);
        Zawodnik zawodnik3 = new Zawodnik("Paulina",25,60);

        listaZawodnikow.add(zawodnik1);
        listaZawodnikow.add(zawodnik2);
        listaZawodnikow.add(zawodnik3);


        for (Zawodnik tmp : listaZawodnikow){

            System.out.println(tmp.imie);
            tmp.bieganie();
            tmp.skakanie();
            tmp.plywanie();
            System.out.println();

        }
    }
}
