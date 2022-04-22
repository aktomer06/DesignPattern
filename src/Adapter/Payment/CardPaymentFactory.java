package Adapter.Payment;

import java.security.InvalidParameterException;

public class CardPaymentFactory {
    //private static CardPaymentFactory cardPaymentFactory = new CardPaymentFactory();
    CardPaymentFactory() {
        System.out.println("card payment factory is created");
    }
    //public static CardPaymentFactory getInstance() {
      //  return cardPaymentFactory;
    //}
    public static CardPayment getPaymentMethod(PaymentCompany paymentCompany) {
        switch (paymentCompany)
        {
            case PAYU -> {
                return new PayUadapter();// Should I use new here or making singleton is a
            }
            case RAZORPAY -> {
                return new RazorPayAdapter();
            }
        }
        throw new InvalidParameterException();
    }
}
