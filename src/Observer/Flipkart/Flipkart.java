package Observer.Flipkart;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    List<PaymentSuccessEventSubscriber> paymentSuccessEventSubscriberList = new ArrayList<>();

    public void subscribe(PaymentSuccessEventSubscriber subscriber) {
        paymentSuccessEventSubscriberList.add(subscriber);
    }
    public void unsubscribe(PaymentSuccessEventSubscriber subscriber) {
        paymentSuccessEventSubscriberList.remove(subscriber);
    }

    public void paymentSuccess(int orderID) {
        for(PaymentSuccessEventSubscriber subscriber : paymentSuccessEventSubscriberList) {
            subscriber.notify(orderID);
        }
    }
}
