package J29;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    public ArrayList<Student> studentList = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public StudentController() {

        while (true) {

            System.out.println("\nD - D0DAJ, P -POKAŻ, U - USUN, Z - ZMIEN, I - ILE, K - KONIEC");
            String wybor = input.nextLine().toUpperCase();

            if (wybor.equals("K")) {
                break;
            } else if (wybor.equals("D")) {
                dodaj();
            } else if (wybor.equals("P")) {
                pokaz();
            } else if (wybor.equals("U")) {
                usun();
            } else if (wybor.equals("Z")) {
                zmien();
            } else if (wybor.equals("I")) {
                ile();
            }
        }
    }

    public void dodaj() {

        System.out.print("Podaj imię studenta:  ");
        String imie = input.nextLine().toUpperCase();
        System.out.print("Podaj nazwisko studenta:  ");
        String nazwisko = input.nextLine().toUpperCase();
        System.out.print("Podaj indeks studenta:  ");
        int index = input.nextInt();
        input.nextLine();

        Student object = new Student(imie, nazwisko, index);

        studentList.add(object);
    }

    public void pokaz() {
        for (Student tmp : studentList) {
            System.out.println(tmp);
        }

    }

    public void usun() {
        System.out.println("Podaj numer indeksu studenta");
        int indexDoUsun = input.nextInt();
        input.nextLine();
        for (Student tmp : studentList) {                                                                               //przeszukiwanie listy studentow
            if (tmp.getIndex() == indexDoUsun) {
                studentList.remove(tmp);
                Student.count--;
                System.out.println("Student został usunięty. (diabelski śmiech) Hahahaha");
                break;
            }
        }
    }

    public void zmien() {
        System.out.println("Podaj numer sutenta do zmiany");
        int indexDoZmiany = input.nextInt();
        input.nextLine();

        for (Student tmp : studentList) {                                                                               //pokazanie listy studentow
            System.out.println(tmp);
        }

        for (Student tmp : studentList) {                                                                               //przeszukiwanie listy studentow aby usunać
            if (tmp.getIndex() == indexDoZmiany) {                                                                      //warunek znalezienia studenta

                System.out.println("Podaj nowe imie");
                String noweImie = input.nextLine();

                if (!noweImie.equals("")){
                    tmp.setImie(noweImie);
                }

                System.out.println("Podaj Nazwisko");
                String noweNazwisko = input.nextLine();

                if (!noweNazwisko.equals("")){
                    tmp.setNazwisko("");
                }

                break;
            }
        }
    }

    public void ile() {
        System.out.println("\nAktualna liczba studentów wynosi: " +Student.count+"\n");
    }
}
