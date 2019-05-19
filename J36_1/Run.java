package J36_1;

import java.util.ArrayList;

public class Run {

    public static void main(String[] args) {

        ArrayList<Figury> lista = new ArrayList<>();

        Figury kwadrat1 = new Kwadrat();
        Figury kolo1 = new Kolo();

        lista.add(kolo1);
        lista.add(kwadrat1);
    }
    }

