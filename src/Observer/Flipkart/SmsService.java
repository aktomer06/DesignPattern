package Observer.Flipkart;

public class SmsService implements PaymentSuccessEventSubscriber{

    void sendSMS(int orderID) {
        System.out.println("Sending SMS to the customer for orderID = " + orderID);
    }
    @Override
    public void notify(int orderId) {
        sendSMS(orderId);
    }
}
