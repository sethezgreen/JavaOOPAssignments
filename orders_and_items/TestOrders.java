import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item1.price = 4.00;

        item2.name = "latte";
        item2.price = 5.50;

        item3.name = "drip coffee";
        item3.price = 2.50;

        item4.name = "cappuccino";
        item4.price = 3.50;

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        System.out.println(order1);
        System.out.println(order1.total);
        
        order2.items.add(item1);
        order2.total += (item1.price);

        // Noah ordered a capuccino
        order3.items.add(item4);
        order3.total += (item4.price);

        // Sam ordered a latte
        order4.items.add(item2);
        order4.total += (item2.price);

        // Cindhuri's order is ready
        order1.ready = true;

        // Sam ordered two more drinks: 2 lattes
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += (2 * (item2.price));

        // Jimmy's order is ready
        order2.ready = true;

        // Testing order updates
        System.out.println("\n --- ORDER 1 ---");
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.println("\n --- ORDER 2 ---");
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.println("\n --- ORDER 3 ---");
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.println("\n --- ORDER 4 ---");
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}