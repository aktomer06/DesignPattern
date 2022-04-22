package Adapter.Payment;

public interface UPIPayment {
    void putUpiId(String upiId);
    int makePayment(String password);
}
