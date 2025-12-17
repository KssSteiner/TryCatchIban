class InsufficientFundsException extends TransferException {
    private double betrag;
    private double saldo;

    public InsufficientFundsException(double betrag, double saldo) {
        super("Nicht genug Guthaben fuer " + betrag + " CHF.");
        this.betrag = betrag;
        this.saldo = saldo;
    }

    public double getBetrag() {
        return betrag;
    }

    public double getSaldo() {
        return saldo;
    }
}