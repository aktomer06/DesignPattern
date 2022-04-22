package Observer.Test;

import Observer.Flipkart.*;

public class Client {
    private static EmailService emailService = new EmailService();
    private static SmsService smsService = new SmsService();
    private static InventoryService inventoryService =new InventoryService();
    private static InvoiceService invoiceService = new InvoiceService();
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        flipkart.subscribe(emailService);
        flipkart.subscribe(smsService);
        flipkart.subscribe(invoiceService);
        flipkart.subscribe(inventoryService);
        flipkart.paymentSuccess(1234);

        flipkart.unsubscribe(emailService);
        flipkart.unsubscribe(invoiceService);

        flipkart.paymentSuccess(234);
    }
}
