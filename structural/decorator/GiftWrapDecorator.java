package structural.decorator;

public class GiftWrapDecorator extends OrderDecorator {
    public GiftWrapDecorator(Order decoratedOrder) {
        super(decoratedOrder);
    }

    @Override
    public String getDescription() {
        return decoratedOrder.getDescription() + ", Sovg'a qadoqlash";
    }

    @Override
    public double getPrice() {
        return decoratedOrder.getPrice() + 15.0;
    }
}
