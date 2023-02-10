public class Sculpture extends Art {
    private String material;

    public Sculpture(String title, String author, String description, String materials) {
        super(title, author, description);
        this.material = materials;
    }

    public void viewArt() {
        String showAll = "";
        showAll += "Title:  " + getTitle() + "\n";
        showAll += "Author:  " + getAuthor() + "\n";
        showAll += "Description:  " + getDescription() + "\n";
        showAll += "Material:  " + getMaterial() + "\n";
        System.out.println(showAll);
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
