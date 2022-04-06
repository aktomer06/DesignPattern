package Factory;

public class Client {
    public static void main(String[] args) {
        PaymentAPI api = PaymentAPIFactoryMethod.createPaymentAPIBasedPlatform(Platforms.IOS);
        if(api != null)
        {
            api.putCardDetails("123456789");
            api.validateCardDetails("123456789");
            api.sendPayment("123");
        }
        else
        {
            throw new RuntimeException("NUll pointer");
        }
    }
}
