package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        //double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        Clothing[] items = {item1, item2, item3, item4};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("s");

        item3.setDescription("Green Scarf");
        item3.setPrice(5.0);
        item3.setSize("S");

        item4.setDescription("Blue T-shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        int measurement = 3;
        c1.setSize(measurement);

        System.out.println("Customer is " + c1.getName() + ". Size: " + c1.getSize() + ".");

        for (Clothing item : items) {
            if (c1.size.equals(item.size)) {
                System.out.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
                total += item.getPrice();

                if (total > 15.0) {
                    break;
                }
            }
        }

        System.out.println("Total: " +total);
    }
}
