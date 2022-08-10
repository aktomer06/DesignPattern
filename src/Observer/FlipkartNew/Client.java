package Observer.FlipkartNew;

public class Client {
    public static void main(String[] args) {
        FlipkartPaymentService flipkartPaymentService = new FlipkartPaymentService(1234);

        EmailService emailService = new EmailService(flipkartPaymentService);

        SmsService smsService = new SmsService(flipkartPaymentService);

        WhatsAppService whatsAppService = new WhatsAppService(flipkartPaymentService);

        flipkartPaymentService.paymentSuccess();

        flipkartPaymentService.unsubscribe(smsService);

        flipkartPaymentService.paymentSuccess();
    }
}
