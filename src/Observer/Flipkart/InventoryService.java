package Observer.Flipkart;

public class InventoryService implements PaymentSuccessEventSubscriber{

    void updateInventory(int orderID) {
        System.out.println("Updating inventory for the orderID = " + orderID);
    }
    @Override
    public void notify(int orderId) {
        updateInventory(orderId);
    }
}
