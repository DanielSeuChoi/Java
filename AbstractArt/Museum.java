public class Museum {
    public static void main(String[] args) {
        Painting wanderer = new Painting("The wanderer", "John Pierre",
                "Set in the 1960's, it depicts the struggle between man and machine", "Oil canvas");
        Painting blue = new Painting("Blue", "Toshio Oyokami", "Depicts a beautiful morning scene of Tokyo ",
                "Water Color");
        Painting theWorld = new Painting("A New World", "anonymous", "Depicts a scene based on the movie water world",
                "Pop Art");
        Sculpture johnny = new Sculpture("johnny AppleSeed", "Jimmy TwoFace", "Depicts the typical DustBowl resident",
                "Sand and Twigs");
        Sculpture dean = new Sculpture("The Dean", "Ashley King", "Depicts the dean of a small-town school",
                "Marble");
        System.out.println("\n-------Paintings--------");
        wanderer.viewArt();
        blue.viewArt();
        theWorld.viewArt();
        System.out.println("\n-------Sculptures--------");
        johnny.viewArt();
        dean.viewArt();

    }
}
