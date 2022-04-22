package Adapter.Payment;

public class PhonePayAdapter implements UPIPayment{
    private static PhonePay phonePay = new PhonePay();
    PhonePayAdapter() {
        System.out.println("PhonePay: Adapter is created");
    }

    @Override
    public void putUpiId(String upiId) {
        phonePay.sendReqUpiDeails(upiId);
    }

    @Override
    public int makePayment(String password) {
        return phonePay.makePayment(password);
    }
}
