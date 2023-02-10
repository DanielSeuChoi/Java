import java.util.ArrayList;

public class Museum {
    public static void main(String[] args) {
        ArrayList<Art> museum = new ArrayList<Art>();
        museum.add(new Painting("The wanderer", "John Pierre",
                "Set in the 1960's, it depicts the struggle between man and machine", "Oil canvas"));
        museum.add(new Painting("Blue", "Toshio Oyokami", "Depicts a beautiful morning scene of Tokyo ",
                "Water Color"));
        museum.add(new Painting("A New World", "anonymous", "Depicts a scene based on the movie water world",
                "Pop Art"));
        museum.add(new Sculpture("johnny AppleSeed", "Jimmy TwoFace", "Depicts the typical DustBowl resident",
                "Sand and Twigs"));
        museum.add(new Sculpture("The Dean", "Ashley King", "Depicts the dean of a small-town school",
                "Marble"));
        // Painting wanderer = new Painting("The wanderer", "John Pierre",
        // "Set in the 1960's, it depicts the struggle between man and machine", "Oil
        // canvas");
        // Painting blue = new Painting("Blue", "Toshio Oyokami", "Depicts a beautiful
        // morning scene of Tokyo ",
        // "Water Color");
        // Painting theWorld = new Painting("A New World", "anonymous", "Depicts a scene
        // based on the movie water world",
        // "Pop Art");
        // Sculpture johnny = new Sculpture("johnny AppleSeed", "Jimmy TwoFace",
        // "Depicts the typical DustBowl resident",
        // "Sand and Twigs");
        // Sculpture dean = new Sculpture("The Dean", "Ashley King", "Depicts the dean
        // of a small-town school",
        // "Marble");
        // System.out.println("\n-------Paintings--------");
        // wanderer.viewArt();
        // blue.viewArt();
        // theWorld.viewArt();
        // System.out.println("\n-------Sculptures--------");
        // johnny.viewArt();
        // dean.viewArt();

        for (Art artCollective : museum) {
            artCollective.viewArt();
        }

    }
}
