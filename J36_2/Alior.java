package J36_2;

public class Alior extends KontoBankowe{

    @Override
    public void addDebit(double price) {
        setMaxDebit(price);
    }

    @Override
    public void interest() {
        addSaldo(getSaldo()*0.05);
    }

    @Override
    public String toString() {
        return "Alior{" +
                "nrKonta='" + getNrKonta() + '\'' +
                ", Saldo=" + getSaldo() +
                ", maxDebit=" + getMaxDebit() +
                '}';
    }
}
