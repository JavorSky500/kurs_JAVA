package J30_2;

public class Kwiatek extends Ogrod {

    String zapach = "owocowy";


        @Override
    public String getZapach() {

        return zapach +" " + super.zapach;
    }

    @Override
    public String toString() {
        return "Kwiatek{" +
                "zapach='" + zapach + '\'' +
                ", zapach='" + zapach + '\'' +
                '}';
    }
}
