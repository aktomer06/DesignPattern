package Observer.Flipkart;

public class EmailService implements PaymentSuccessEventSubscriber{

    void sendEmail(int orderID) {
        System.out.println("Sending Email to the customer for the orderID = " + orderID);
    }
    @Override
    public void notify(int orderId) {
        sendEmail(orderId);
    }
}
