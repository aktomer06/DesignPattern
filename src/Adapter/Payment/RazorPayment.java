package Adapter.Payment;

public class RazorPayment {
    public RazorPayment(){
        System.out.println("Razor payment instance is created");
    }
    public void shareCardDetails(String cardNumber, String expiryDate){
        System.out.println("Sending card number and expiry date: " + cardNumber +" " + expiryDate);
    }
    public int makePayment(String cvvNumber){
        System.out.println("Making payment using CVV number: " + cvvNumber);
        return 0;
    }
}
