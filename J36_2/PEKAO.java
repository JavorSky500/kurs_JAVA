package J36_2;

public class PEKAO extends KontoBankowe {
    @Override
    public void addDebit(double price) {
        setMaxDebit(price);
    }

    @Override
    public void interest() {
        addSaldo(getSaldo()*0.03);
    }

    @Override
    public String toString() {
        return "PEKAO{" +
                "nrKonta='" + getNrKonta() + '\'' +
                ", Saldo=" + getSaldo() +
                ", maxDebit=" + getMaxDebit() +
                '}';
    }
}
