package J36_2;


abstract public class KontoBankowe {

    public String nrKonta;
    public double Saldo;
    public double maxDebit;


    public void addSaldo(double price) {

        setSaldo(getSaldo() + price);

    }

    public void subSaldo(double price) {

        double limit = getSaldo() + getMaxDebit();

        if (price <= limit) {
            setSaldo(getSaldo() - price);
        } else {
            System.out.println("BRAK srodków na koncie !");
        }

    }

    public String getNrKonta() {
        return nrKonta;
    }

    public void setNrKonta(String nrKonta) {
        this.nrKonta = nrKonta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getMaxDebit() {
        return maxDebit;
    }

    public void setMaxDebit(double maxDebit) {
        this.maxDebit = maxDebit;
    }

    abstract public void addDebit(double price);

    abstract public void interest();


}
