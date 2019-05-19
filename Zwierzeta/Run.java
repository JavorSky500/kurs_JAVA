package Zwierzeta;

public class Run {

    public static void main(String[] args) {

        Pies pies = new Pies("Brutus", 2,"czarny");
        Kot kot = new Kot("Faust", 4, "biało-czanry");


        System.out.println(pies.imie+" robi ");
        pies.odglos();
        System.out.println(kot.imie+" robi ");
        kot.odglos();
    }


}
