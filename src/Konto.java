class Konto {
    private double saldo;
    private double restlimitHeute;

    public Konto(double saldo, double restlimitHeute) {
        this.saldo = saldo;
        this.restlimitHeute = restlimitHeute;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRestlimitHeute() {
        return restlimitHeute;
    }

    public void belaste(double betrag) {
        saldo = saldo - betrag;
        restlimitHeute = restlimitHeute - betrag;
    }
}