package LibraryProj;

import java.math.BigDecimal;
import java.util.Date;

public class Dvd implements Media, CheckOutable {

    private final int ALLOWED_DAYS = 5;
    private final int GRACE_DAYS = 1;
    private final int FINAL_DUE_DAYS = 12;
    private final BigDecimal DAILY_FEE = BigDecimal.valueOf(0.50);

    private String title;
    private String location;
    private String category;
    private BigDecimal price;

    private boolean isCheckedOut;
    private Date checkoutDate;
    private Date dueDate;
    private boolean isOverdue;
    private Date checkInDate;

    public Dvd(String title, String location, String category, BigDecimal price) {
        this.title = title;
        this.location = location;
        this.category = category;
        this.price = price;
    }

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

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public Date getCheckedOutDate() {
        return checkoutDate;
    }

    @Override
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public boolean isOverdue() {
        return isOverdue;
    }

    @Override
    public void checkOut(Date checkOutDate) {
        this.checkoutDate = checkOutDate;
    }

    @Override
    public void checkIn(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    @Override
    public Date setDueDate() {
        return dueDate;
    }

    @Override
    public BigDecimal getDailyFee() {
        return DAILY_FEE;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public int getMaxCheckoutDays() {
        return ALLOWED_DAYS;
    }

    @Override
    public int getGracePeriodDays() {
        return GRACE_DAYS;
    }

    @Override
    public int getMaxOverdueDays() {
        return FINAL_DUE_DAYS;
    }

    @Override
    public Date getDueDate() {
        return dueDate;
    }
}
