class InvalidAmountException extends TransferException {
    private double betrag;

    public InvalidAmountException(double betrag) {
        super("Betrag muss > 0 sein, war aber: " + betrag);
        this.betrag = betrag;
    }

    public double getBetrag() {
        return betrag;
    }
}