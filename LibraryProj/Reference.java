package LibraryProj;

public class Reference implements Media {

    private String title;
    private String location;
    private String category;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getCategory() {
        return category;
    }

}
