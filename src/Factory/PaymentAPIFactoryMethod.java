package Factory;

public class PaymentAPIFactoryMethod {
    public static PaymentAPI createPaymentAPIBasedPlatform(Platforms platform)
    {
        switch(platform)
        {
            case ANDROID -> {
                return new PayUAPI();
            }
            case IOS -> {
                return new RazerPayAPI();
            }
        }
        return null;
    }
}
