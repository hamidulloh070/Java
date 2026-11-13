package structural.decorator;

public class ExpressDeliveryDecorator extends OrderDecorator {
    public ExpressDeliveryDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + ", Tezkor yetkazib berish";
    }

    @Override
    public double getPrice() {
        return decoratedOrder.getPrice() + 25.0;
    }
}
