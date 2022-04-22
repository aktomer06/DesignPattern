package Adapter.Payment;

public class PayUpayment {

    PayUpayment() {
        System.out.println("PayU Payment instance is created");
    }
    //PayU API will be called here
    public void sendCardDetails(String cardNumber) {
        System.out.println("Card number " + cardNumber);
    }
    public void sendExpiryDate(String expiryDate) {
        System.out.println("Expiry date " + expiryDate);
    }
    public int makePayment(String cvvNumber) {
        System.out.println("Marking the payment using CVV number : " + cvvNumber);
        return 0;
    }
}
