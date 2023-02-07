public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 3.5;
        double lattePrice = 4.0;
        double cappuccinoPrice = 3.0;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);

        // 2.) Noah's order
        if (isReadyOrder2) {
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer3 + pendingMessage);
        }
        // 3.) Sam's order
        System.out.println(customer2 + lattePrice * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        // 4.) Jimmy order
        System.out.println(displayTotalMessage + (lattePrice - dripPrice));
    }
}
