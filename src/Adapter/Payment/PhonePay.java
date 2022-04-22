package Adapter.Payment;

public class PhonePay {
    PhonePay() {
        System.out.println("PhonePay: Instance is created");
    }
    public void sendReqUpiDeails(String upiId) {
        System.out.println("PhonePay: Received UPI details");
    }
    public int makePayment(String password) {
        System.out.println("PhonePay: Payment id made");
        return 0;
    }
}
