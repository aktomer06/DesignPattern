package Observer.Flipkart;

public class InvoiceService implements PaymentSuccessEventSubscriber{

    void sendInvoice(int orderID) {
        System.out.println("Sending Invoice to customer for the orderID = " + orderID);
    }
    @Override
    public void notify(int orderId) {
        sendInvoice(orderId);
    }
}
