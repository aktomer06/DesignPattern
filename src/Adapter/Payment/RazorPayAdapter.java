package Adapter.Payment;

public class RazorPayAdapter implements CardPayment{
    private static RazorPayment razorPayment = new RazorPayment();
    RazorPayAdapter() {
        System.out.println("Razor pay adapter is created");
    }
    @Override
    public void putCardDetails(String cardNumber, String expiryDate) {
        razorPayment.shareCardDetails(cardNumber, expiryDate);
    }

    @Override
    public int makePayment(String cvvNumber) {
        return razorPayment.makePayment(cvvNumber);
    }
}
