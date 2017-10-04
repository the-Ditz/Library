import java.math.BigDecimal;

public class LibraryTester {

    public static void main(String[] args) {

        Book b1 = new Book("FishPaste", "Shelf", "Humor", BigDecimal.valueOf(24.95));
        Dvd d1 = new Dvd("FishPaste the Movie", "Counter", "Humor", BigDecimal.valueOf(19.95));

        Inventory inv = new Inventory();
        // ArrayList<Media> inv = new ArrayList<>();

        Library lib = new Library();

        System.out.println(inv.getInventorySize());
        inv.addItem(b1);
        inv.addItem(b1);
        System.out.println(inv.getInventorySize());

        System.out.println(lib.searchMedia("FishPaste"));

        System.out.println(inv.getMedia(0).getCategory());

    }

}
