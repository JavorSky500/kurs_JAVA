package J24;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class AutoController {


    ArrayList <Auto> listaAut = new ArrayList<>();

    public void addAuto (){

        Auto a = new Auto("aa1","bb1", 121, "cc1","dd1");
        Auto b = new Auto("aa2","bb2", 122, "cc2","dd2");
        Auto c = new Auto("aa3","bb3", 123, "cc3","dd3");
        Auto d = new Auto("aa4","bb4", 124, "cc4","dd4");
        Auto e = new Auto("aa5","bb5", 125, "cc5","dd5");

        listaAut.add(a);
        listaAut.add(b);
        listaAut.add(c);
        listaAut.add(d);
        listaAut.add(e);

    }

    public void showAuto(){
        System.out.println("Zawartość list aut:\n");

        for (Auto tmp : listaAut){
            System.out.println(tmp);
        }

    }




}
