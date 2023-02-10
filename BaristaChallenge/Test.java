import java.util.ArrayList;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        // System.out.println(item1);
        Order order1 = new Order();
        Order order2 = new Order("cold brew");
        System.out.println(order1.getName());
        // System.out.println(order2.getName());

        System.out.println(item1.getName() + item1.getPrice());
        System.out.printf("total is - %s", item1.getTotal());
        // System.out.println(order2.getItems());

        // System.out.println(order2.getStatusMessage());
        // order1.addItem(item3);
        order1.addItem();
        System.out.println(order1.getItems());
        // Item[] items = { item1, item2, item3 };
        // ArrayList<Item> thelist = new ArrayList<>();
        // thelist.add(item1);
        // thelist.add(item2);
        // thelist.add(item3);
    }
}