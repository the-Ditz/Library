import java.math.BigDecimal;

public class LibraryTester {

    public static void main(String[] args) {

        Book b1 = new Book("FishPaste", "Shelf", "Humor", BigDecimal.valueOf(24.95));
        Dvd d1 = new Dvd("FishPaste the Movie", "Counter", "Humor", BigDecimal.valueOf(19.95));

        System.out.println(b1.getCategory());
        System.out.println(b1.getGracePeriodDays());
        System.out.println(b1.getIsCheckedOut());
        System.out.println(b1.getLocation());
        System.out.println(b1.getMaxCheckoutDays());
        System.out.println(b1.getMaxOverdueDays());
        System.out.println(b1.getTitle());
        System.out.println(b1.getType());
        System.out.println(b1.isOverdue());
        System.out.println(b1.getDueDate());
        System.out.println();
        System.out.println(d1.getCategory());
        System.out.println(d1.getGracePeriodDays());
        System.out.println(d1.getIsCheckedOut());
        System.out.println(d1.getLocation());
        System.out.println(d1.getMaxCheckoutDays());
        System.out.println(d1.getMaxOverdueDays());
        System.out.println(d1.getTitle());
        System.out.println(d1.getType());
        System.out.println(d1.isOverdue());
        System.out.println(d1.getDueDate());
    }

}
