package Adapter.Payment;

public interface CardPayment {
    void putCardDetails(String cardNumber, String expiryDate);
    int makePayment(String cvvNumber);
}
