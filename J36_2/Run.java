package J36_2;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        System.out.println("Dzień dobry, proszę wybrac bank");
        System.out.println("1. Alior - oprocentowanie 5%");
        System.out.println("2. PEKAO - oprocentowanie 3%");

        KontoBankowe newKontoBankowe = null;
        Scanner input = new Scanner(System.in);
        String wybor = input.nextLine().toUpperCase();

        if (wybor.equals("ALIOR")){
             newKontoBankowe = new Alior();
        }else if(wybor.equals("PEKAO")){
             newKontoBankowe = new PEKAO();
        }else {
            System.out.println("Zły wybor");
        }

        System.out.println("Podaj numer konta");
        String wpisNrKonta = input.nextLine();

        newKontoBankowe.setNrKonta(wpisNrKonta);

        System.out.println("Podaj saldo początkowe:");

        double wpisaniesalda = input.nextDouble();
        input.nextLine();

        newKontoBankowe.setSaldo(wpisaniesalda);

        System.out.println("Podaj maksymalny debet");
        double wpisMaxDebit = input.nextDouble();

        newKontoBankowe.setMaxDebit(wpisMaxDebit);

        System.out.println(newKontoBankowe);

        System.out.println("Podaj ile mam wypłacic");

        double wyplata = input.nextDouble();
        newKontoBankowe.subSaldo(wyplata);

        System.out.println(newKontoBankowe);
        newKontoBankowe.interest();
        System.out.println(newKontoBankowe);
    }
}
