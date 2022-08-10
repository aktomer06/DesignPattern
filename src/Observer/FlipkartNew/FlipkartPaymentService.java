package Observer.FlipkartNew;

import java.util.ArrayList;
import java.util.List;

public class FlipkartPaymentService implements Publisher{
    private List<Subscriber> subscribers;
    private int orderId;
    FlipkartPaymentService(int orderId) {
        this.subscribers = new ArrayList<>();
        this.orderId = orderId;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(orderId);
        }
    }

    public void paymentSuccess() {
        notifyObservers();
    }
}
