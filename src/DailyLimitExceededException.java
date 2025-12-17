class DailyLimitExceededException extends TransferException {
    private double betrag;
    private double restlimit;

    public DailyLimitExceededException(double betrag, double restlimit) {
        super("Tageslimit ueberschritten.");
        this.betrag = betrag;
        this.restlimit = restlimit;
    }

    public double getBetrag() {
        return betrag;
    }

    public double getRestlimit() {
        return restlimit;
    }
}