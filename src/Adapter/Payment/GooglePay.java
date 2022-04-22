package Adapter.Payment;

public class GooglePay {
    GooglePay() {
        System.out.println("GooglePay: Instance is created");
    }
    public void sendUpiId(String upiId) {
        System.out.println("GooglePay: UPI ID is received");
    }
    public int makePayment(String password) {
        System.out.println("GooglePay: Payment is made");
        return 0;
    }
}
