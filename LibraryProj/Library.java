import java.util.ArrayList;

public class Library {
    Inventory inventory = new Inventory();
    ArrayList<Visitor> visitors = new ArrayList<>();

    public ArrayList<Media> searchMedia(String term) {
        ArrayList<Media> matches = new ArrayList<>();
        for (Media media: inventory.getMedia()) {
            if (media.match(term)) {
                matches.add(media.clone());
            }
        }
        return matches;
    }

    public void checkOut(Media media) {
        if (!(media instanceof CheckOutable)) {
            throw new IllegalArgumentException("Can't check out Media that is not also CheckOutable.")
        }
        return;
    }

    public void addMedia(Media media) {
        inventory.addItem(media);
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
}
