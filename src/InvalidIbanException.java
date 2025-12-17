class InvalidIbanException extends TransferException {
    private String iban;

    public InvalidIbanException(String iban) {
        super("IBAN ist ungueltig: " + iban);
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }
}