import java.util.ArrayList;

public class Inventory {
    private ArrayList<Media> contents = new ArrayList<>();

    /*
     * Add a media item if not a duplicate.
     */
    public void addItem(Media media) {
        if (checkIfInInventory(media.getTitle()) != -1) {
            contents.add(media);
        }
    }

    /*
     * Remove an item if in inventory.
     */
    public void removeItem(Media media) {
        int indexOfItem = checkIfInInventory(media.getTitle());
        
        if (indexOfItem != -1) {
            contents.remove(indexOfItem);
        }
    }

    /*
     * Return item in inventory.
     */
    public Media getMedia(int i) {
        return contents.get(i);
    }

    /*
     * Return inventory.
     */
    public ArrayList<Media> getMedia() {
        return contents;
    }
    
    /*
     * Return number of items in inventory.
     */
    public int getInventorySize() {
        return contents.size();
    }

    /*
     * Return index of item if found in inventory; searches by title.
     */
    public int checkIfInInventory(String name) {
        for (int i = 0; i < contents.size(); i++) {
            if (contents.get(i).getTitle().equals(name)) {
                return i;
            }
        }

        return -1;
    }
}
