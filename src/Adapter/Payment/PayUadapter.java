package Adapter.Payment;

public class PayUadapter implements CardPayment{
    //private static PayUadapter payUadapter = new PayUadapter();
    private static PayUpayment payUpayment = new PayUpayment();

    PayUadapter() {
        System.out.println("PayU adapter is created");
    }
//    public static PayUadapter getInstance() {
//        return payUadapter;
//    }
    @Override
    public void putCardDetails(String cardNumber, String expiryDate) {
            payUpayment.sendCardDetails(cardNumber);
            payUpayment.sendExpiryDate(expiryDate);
    }

    @Override
    public int makePayment(String cvvNumber) {
        return payUpayment.makePayment(cvvNumber);
    }

}
