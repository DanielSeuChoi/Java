import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private String name;
    private ArrayList<Item> items;
    private boolean ready;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);

    }

    public void addItems(Item[] itemsArray) {
        System.out.println(Arrays.toString(itemsArray));
        for (int i = 0; i < itemsArray.length; i++) {
            System.out.println(itemsArray[i].getName());
            this.items.add(itemsArray[i]);
        }
    }

    public void addItems(ArrayList<Item> itemsArrayList) {
        this.items.addAll(itemsArrayList);
    }

    public String getStatusMessage() {
        return "this is ready";
    }

}
