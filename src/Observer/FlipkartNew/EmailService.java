package Observer.FlipkartNew;

public class EmailService implements Subscriber{
    Publisher publisher;

    EmailService (Publisher publisher) {
        this.publisher = publisher;
        publisher.subscribe(this);
    }
    @Override
    public void notify(Integer orderId) {
        System.out.println("Email service notified for the order " + orderId);
    }
}
