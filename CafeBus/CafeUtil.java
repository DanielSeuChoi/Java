
import java.util.ArrayList;

public class CafeUtil {
    public String introGreeting() {
        return "Hello peep";
    }

    public int getStreakGoal() {
        int goal = 55;
        return goal;
    }

    double getOrderTotal(double[] prices) {
        int sum = 0;
        int i;
        double[] totalArray = { 3.5, 1.5, 4.0, 4.5 };
        for (i = 0; i < totalArray.length; i++) {
            sum += totalArray[i];

        }
        return sum;
    }

    public String menuItems(String[] items) {

        String[] cafeItems = { "Drip Coffee", "Ice Coffee", "Espresso", "Capu" };
        String temp = cafeItems[0];
        cafeItems[0] = cafeItems[cafeItems.length - 1];
        cafeItems[cafeItems.length - 1] = temp;
        for (int i = 0; i < cafeItems.length; i++) {

            System.out.println(cafeItems[i]);
        }
        // items[0]="Drip Coffee";
        // items[1]="Iced Coffee";
        // items[2]="Espresso";
        // items[3]="Capu";

        return temp;
    }

    public static void addCustomers(ArrayList<String> customers) {

        System.out.println("please enter your name: ");
        String userName = System.console().readLine();
        String a = new String(userName);
        System.out.printf(" hello,%s ", a);
        System.out.println(String.format("there are %s people in front of you", customers.size()));
        // String b = new String(userName);
        // System.out.printf("hello,[%s]", b);
        // System.out.println("there are ___ people in front of you");
        customers.add(a);
        System.out.println(customers);
    }
}