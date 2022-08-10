package Observer.FlipkartNew;

public class WhatsAppService implements Subscriber{
    Publisher publisher;

    WhatsAppService(Publisher publisher) {
        this.publisher = publisher;
        publisher.subscribe(this);
    }
    @Override
    public void notify(Integer orderId) {
        System.out.println("WhatsApp Service is notified with orderId " + orderId);
    }
}
