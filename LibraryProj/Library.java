import java.util.ArrayList;

/**
 * Library class acts as a repository for media in a library. Allows for media to be checked out, track due dates, and
 * fines for overdue items.
 */
public class Library {
    Inventory inventory = new Inventory();
    ArrayList<Visitor> visitors = new ArrayList<>();

    /**
     * Returns matches 
     */
    public ArrayList<Media> searchMedia(String term) {
        ArrayList<Media> matches = new ArrayList<>();
        for (int i=0;i<inventory.getInventorySize();i++) {
            if (inventory.getMedia(i).getTitle().contains(term) || inventory.getMedia(i).getCategory().contains(term)) {
                matches.add(inventory.getMedia(i));
            }
        }
        return matches;
    }

    /*
     * Set an item as checked out by a specific visitor.
     */
    public void checkOut(Media media) {
        if (!(media instanceof CheckOutable)) {
            throw new IllegalArgumentException("Can't check out Media that is not also CheckOutable.");
        }
        return;
    }

    /*
     * Add a new item to the library.
     */
    public void addMedia(Media media) {
        inventory.addItem(media);
    }

    /*
     * Add a new visitor to the library.
     */
    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }
}
