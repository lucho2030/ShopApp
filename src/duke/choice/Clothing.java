package duke.choice;

public class Clothing implements Comparable<Clothing> {

    private String description;
    private double price;
    private String size;

    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = Math.min(price, MIN_PRICE);
    }

    public void setSize (String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        this.price = (price * TAX_RATE) + price;
        return price;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return getDescription() + "," + getPrice() + "," + getSize();
    }

    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
