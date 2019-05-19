package J26_1;

public class Auto {

    public String marka;
    public String model;
    private boolean zabezpiecznie = true;


    public Auto(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public void alarm(int pin) {
        if (pin == 1234) {
            this.zabezpiecznie = !zabezpiecznie;
            if (zabezpiecznie) {
                System.out.println("Zabezpieczony");
            } else {
                System.out.println("Odbezpieczony");
            }
        } else {
            System.out.println("Zły PIN");
        }
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", zabezpiecznie=" + zabezpiecznie +
                '}';
    }

}

