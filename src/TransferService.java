class TransferService {

    // stark vereinfacht (nur Demo)
    private boolean ibanIstGueltig(String iban) {
        return iban != null && iban.startsWith("CH") && iban.length() >= 10;
    }

    public void ueberweisen(Konto von, String ibanNach, double betrag)
            throws TransferException {

        if (!ibanIstGueltig(ibanNach)) {
            throw new InvalidIbanException(ibanNach);
        }

        if (betrag <= 0) {
            throw new InvalidAmountException(betrag);
        }

        if (betrag > von.getSaldo()) {
            throw new InsufficientFundsException(betrag, von.getSaldo());
        }

        if (betrag > von.getRestlimitHeute()) {
            throw new DailyLimitExceededException(betrag, von.getRestlimitHeute());
        }

        von.belaste(betrag);
    }
}