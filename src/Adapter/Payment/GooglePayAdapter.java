package Adapter.Payment;

public class GooglePayAdapter implements UPIPayment{
    private static GooglePay googlePay = new GooglePay();
    GooglePayAdapter() {
        System.out.println("GooglePay Adapter is created");
    }
    @Override
    public int makePayment(String password) {
        return googlePay.makePayment(password);
    }

    @Override
    public void putUpiId(String upiId) {
        googlePay.sendUpiId(upiId);
    }
}
