public class Purchase {
    private Customer customer;
    private Purchasable item;
    private double  price;

    public Purchase(Customer customer, Purchasable item, double price) {
        this.customer = customer;
        this.item = item;
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Purchasable getItem() {
        return item;
    }

    public void setItem(Purchasable item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "customer=" + customer.getFullName() +
                ", item=" + item.hasName() +
                ", price=" + price +
                '}';
    }
}
