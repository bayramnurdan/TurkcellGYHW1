

public class Game implements Purchasable {
    private String name;
    private double price;


    public Game(String name, double price) {  //constructor
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String hasName() {
        return this.name;
    }

    @Override
    public double hasPrice() {
        return getPrice();
    }

    @Override
    public double hasDiscountInPercentage() {
        return 0;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
