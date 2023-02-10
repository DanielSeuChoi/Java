
/**
 * TestOrder
 */
import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {
        ItemM item1 = new ItemM();
        item1.name = "mocha";
        item1.price = 3.25;

        ItemM item2 = new ItemM();
        item1.name = "Java";
        item1.price = 5.25;

        ItemM item3 = new ItemM();
        item1.name = "Iced Coffee";
        item1.price = 2.25;

        ItemM item4 = new ItemM();
        item1.name = "AA";
        item1.price = 3.00;

        Order order1 = new Order();
        System.out.println(order1.total);
        order1.name = "Cindhuri";
        Order order2 = new Order();
        order2.name = "Jimmy";
        Order order3 = new Order();
        order3.name = "Noah";
        Order order4 = new Order();
        order4.name = "Sam";

        // add item and order
        order2.items.add(item1);
        order2.total += item1.price;

    }
}