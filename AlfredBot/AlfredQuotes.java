import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE

        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);

    }

    public String dateAnnouncement() {
        // YOUR CODE HERE]
        // Date utildate = new java.util.Date();
        return String.format("It's currently %s", new Date());
    }

    public String respondBeforeAlexis(String convo) {
        // YOUR CODE HERE
        if (convo.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }
        if (convo.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I help you?";
        }
        return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
