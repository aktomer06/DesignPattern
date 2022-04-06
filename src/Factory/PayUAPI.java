package Factory;

public class PayUAPI implements PaymentAPI{
    @Override
    public void putCardDetails(String cardNumber) {
        System.out.println("PayUAPI:: adding card details");
    }

    @Override
    public void sendPayment(String cvv) {
        System.out.println("PayUAPI:: sending payment");
    }

    @Override
    public void validateCardDetails(String cardNumber) {
        System.out.println("PayUAPI:: validating card details");
    }
}
