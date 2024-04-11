package duke.choice;

public class Clothing {
    private String description;
    private double price;
    String size;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        double MIN_PRICE = 10.0;
        this.price = Math.min(price, MIN_PRICE);
    }

    public void setSize (String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        double TAX_RATE = 0.2;
        this.price = (price * TAX_RATE) + price;
        return price;
    }

    public String getSize() {
        return size;
    }
}
