package Observer.FlipkartNew;

public class SmsService implements Subscriber{
    Publisher publisher;

    SmsService (Publisher publisher) {
        this.publisher = publisher;
        publisher.subscribe(this);
    }

    @Override
    public void notify(Integer orderId) {
        System.out.println("SMS Service notified for the order " + orderId);
    }
}
