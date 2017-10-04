import java.math.BigDecimal;
import java.util.Date;

/**
 * An item that can be checked out from a Library.
 */
public interface CheckOutable {

    boolean isCheckedOut();

    boolean isOverdue();

    void checkOut(Date checkOutDate);

    void checkIn(Date checkInDate);

    Date getDueDate();

    Date setDueDate();

    BigDecimal getDailyFee();

    BigDecimal getPrice();

    int getMaxCheckoutDays();

    int getGracePeriodDays();

    int getMaxOverdueDays();

    void setPrice(BigDecimal price);
}
