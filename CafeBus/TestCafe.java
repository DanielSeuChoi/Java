
import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeBot = new CafeUtil();

        String testGreeting = cafeBot.introGreeting();

        System.out.println(testGreeting);
        System.out.println("\n-------Streak Goal Test-------");
        System.out.printf("Purchases needed by week 10: %s \n\n",
                cafeBot.getStreakGoal());

        System.out.println("\n-------Order Total Test-------");
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        System.out.printf("Order Total: %s \n\n", cafeBot.getOrderTotal(lineItems));

        System.out.println("-------- Display Menu Test -----------");
        System.out.printf("Here's our menu", cafeBot.menuItems(args));

        System.out.println("\n\n------Add Customer Test---------");
        ArrayList<String> customers = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            cafeBot.addCustomers(customers);

        }

        // System.out.println(cafeBot.addCustomers(null));

        // cafeBot.addCustomers(args);

    }
}
