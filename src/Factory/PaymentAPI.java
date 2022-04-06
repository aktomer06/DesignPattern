package Factory;

public interface PaymentAPI {
    public void putCardDetails(String cardNumber);
    public void validateCardDetails(String cardNumber);
    public void sendPayment(String cvv);
}
