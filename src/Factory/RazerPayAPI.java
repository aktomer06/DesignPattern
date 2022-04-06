package Factory;

public class RazerPayAPI implements PaymentAPI{
    @Override
    public void putCardDetails(String cardNumber) {
        System.out.println("RazerPayAPI:: adding card details");
    }

    @Override
    public void sendPayment(String cvv) {
        System.out.println("RazerPayAPI:: sending payment");
    }

    @Override
    public void validateCardDetails(String cardNumber) {
        System.out.println("RazerPayAPI:: validating card details");
    }
}
