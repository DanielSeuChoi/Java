public class Painting extends Art {
    private String paintType;

    public Painting(String title, String author, String description, String paintingType) {
        super(title, author, description);
        this.paintType = paintingType;

    }

    public void viewArt() {
        String showAll = "";
        showAll += "Title:  " + getTitle() + "\n";
        showAll += "Author:  " + getAuthor() + "\n";
        showAll += "Description:  " + getDescription() + "\n";
        showAll += "PaintType:  " + getPaintType() + "\n";
        System.out.println(showAll);
    }

    public String getPaintType() {
        return this.paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

}
