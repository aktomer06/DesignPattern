package Adapter.Payment;

import java.security.InvalidParameterException;

public class UpiPaymentFactory{
    private static UpiPaymentFactory upiPaymentfactory = new UpiPaymentFactory();

    public static UpiPaymentFactory getInstance() {
        return upiPaymentfactory;
    }
    public static UPIPayment getUpiPaymentFactory(UPICompany upiCompany) {
        switch(upiCompany)
        {
            case GOOLEPAY -> {
                return new GooglePayAdapter();
            }
            case PHONEPAY -> {
                return new PhonePayAdapter();
            }
        }
        throw new InvalidParameterException();
    }
    private UpiPaymentFactory() {
        System.out.println("UPI payment factory is created");
    }
}
