package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";

        System.out.println("Customer is " + c1.name);
        System.out.println("Customer size is " + c1.size);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        Clothing[] items = {item1, item2, item3, item4};

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.priceWithTax = (item1.price * tax) + item1.price;
        item1.size = "M";
        //item1.quantity = 1;

        //System.out.println(item1.priceWithTax);

        item2.description = "Orange T-shirt";
        item2.price = 10.5;
        item2.priceWithTax = (item2.price * tax) + item2.price;
        item2.size = "S";
        //item2.quantity = 2;

        item3.description = "Green Scarf";
        item3.price = 5.0;
        item3.priceWithTax = (item3.price * tax) + item3.price;
        item3.size = "S";

        item4.description = "Blue T-shirt";
        item4.price = 10.5;
        item4.priceWithTax = (item2.price * tax) + item2.price;
        item4.size = "S";

        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;

            case 4, 5, 6:
                c1.size = "M";
                break;

            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        for (Clothing item : items) {
            if (c1.size.equals(item.size)) {
                System.out.println(item.description + "," + item.price + "," + item.size);
                total += item.priceWithTax;

                if (total > 15.0) {
                    break;
                }
            }
        }

        System.out.println("Total: " +total);

        //total = (item1.quantity * item1.priceWithTax) + (item2.quantity * item2.priceWithTax);

        //System.out.println(item1.description + "," + item1.price + "," + item1.size);
        //System.out.println(item2.description + "," + item2.price + "," + item2.size);
        //System.out.println("Total + Taxes: " + total);
    }
}
