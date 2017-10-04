import java.math.BigDecimal;

public class Visitor {
    
    final private String name;
    final private Inventory checkedOutMedia;
    final private BigDecimal overdueBalance;
    
    Visitor (String name){
        this.name = name;
        checkedOutMedia = new Inventory();
        overdueBalance = new BigDecimal(0.00);
    }
    
    // returns the visitor's name
    public String getName() {
        return name;
    }
    
    // returns an Inventory of what the visitor has checked out
    public Inventory getCheckedOutMedia(String name) {
        return checkedOutMedia;
    }
    
    // returns a visitor's overdue balance
    public BigDecimal getOverdueBalance(String name) {
        return overdueBalance;
    }
    
    // appends the visitor's checkedOutMedia Inventory with a passed media object
    public void checkOutMedia(Media mediaTitle) {
        checkedOutMedia.addItem(mediaTitle);
    }
    
    // removes the passed media object from the visitor's checkedOutMedia Inventory. 
    public void checkInMedia(Media mediaTitle) {
        checkedOutMedia.removeItem(mediaTitle);
    }
    
    // updates the visitor's overdueBalance 
    public void setOverdueBalance(BigDecimal amount) {
        overdueBalance.add(amount);
    }

}
