package Observer.Flipkart;

public interface PaymentSuccessEventSubscriber {
    void notify(int orderId);
}
