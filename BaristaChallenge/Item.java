public class Item {
    private String name;
    private double price;
    private double total;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item() {
        this.name = "ice Coffee - ";
        this.price = 5.5;
        this.total = price;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
