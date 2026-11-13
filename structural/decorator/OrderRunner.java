package structural.decorator;

public class OrderRunner {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        System.out.println(order.getDescription() + " — Narxi: $" + order.getPrice());

        Order giftOrder = new GiftWrapDecorator(new BasicOrder());
        System.out.println(giftOrder.getDescription() + " — Narxi: $" + giftOrder.getPrice());

        Order fullOrder = new ExpressDeliveryDecorator(new GiftWrapDecorator(new BasicOrder()));
        System.out.println(fullOrder.getDescription() + " — Narxi: $" + fullOrder.getPrice());
    }
}
