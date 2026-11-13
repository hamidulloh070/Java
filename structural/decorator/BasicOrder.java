package structural.decorator;

public class BasicOrder implements Order {
    @Override
    public String getDescription() {
        return "Oddiy buyurtma";
    }

    @Override
    public double getPrice() {
        return 100.0;
    }
}
