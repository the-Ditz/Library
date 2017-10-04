import java.math.BigDecimal;

public class Visitor {
    
    //name: String
    //ownedBooks: Inventory
    //overdueBalance: BigDecimal
    
    final private String name;
    final private Inventory checkedOutMedia;
    final private BigDecimal overdueBalance;
    
    Visitor (String name){
        this.name = name;
        checkedOutMedia = new Inventory();
        overdueBalance = new BigDecimal(0.00);
    }
    
    public String getName() {
        return name;
    }
    
    public Inventory getCheckedOutMedia(String name) {
        return checkedOutMedia;
    }
    
    public BigDecimal getOverdueBalance(String name) {
        return overdueBalance;
    }
    
    public void checkOutMedia(String mediaTitle) {
        checkedOutMedia.add(mediaTitle);
    }
    
    public void checkInMedia(String mediaTitle) {
        checkedOutMedia.remove(mediaTitle);
    }
    
    public void setOverdueBalance(BigDecimal amount) {
        overdueBalance.add(amount);
    }

}
