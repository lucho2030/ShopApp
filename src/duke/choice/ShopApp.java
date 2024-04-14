package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        //double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer("Pinky", 9);
        //c1.setName("Pinky");
        //c1.setSize("S");

        System.out.println("Minimun price: " + Clothing.MIN_PRICE);

        //Clothing item1 = new Clothing();
        //Clothing item2 = new Clothing();
        //Clothing item3 = new Clothing();
        //Clothing item4 = new Clothing();

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        //item1.setDescription("Blue Jacket");
        //item1.setPrice(20.9);
        //item1.setSize("M");

        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");
        //item2.setDescription("Orange T-shirt");
        //item2.setPrice(10.5);
        //item2.setSize("S");

        Clothing item3 = new Clothing("Green Scarf", 5.0, "S");
        //item3.setDescription("Green Scarf");
        //item3.setPrice(5.0);
        //item3.setSize("S");

        Clothing item4 = new Clothing("Blue T-shirt", 10.5, "S");
        //item4.setDescription("Blue T-shirt");
        //item4.setPrice(10.5);
        //item4.setSize("S");

        Clothing[] items = {item1, item2, item3, item4};

        int measurement = 3;
        //c1.setSize(measurement);

        c1.addItems(items);

        System.out.println("Customer is " + c1.getName() + ". Size: " + c1.getSize() + ".");

        for (Clothing item : c1.getItems()) {
            //System.out.println(item.getDescription() + "," + item.getPrice() + "," + item.getSize());
            System.out.println("Item: " + item);
            total = c1.getTotalClothingCost();
        }

        System.out.printf("Total: %.2f %n", total);
    }
}
