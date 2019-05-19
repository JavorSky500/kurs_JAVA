package J25_1;

public class CalcTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.add(23,45);
        calculator.add(23,434,23);
        calculator.add(312.3,3123.2,3123.3);
        calculator.add(42342.4,42342.32,4234.42);


        System.out.println(calculator);

    }
}
