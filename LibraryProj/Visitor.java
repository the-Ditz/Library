import java.math.BigDecimal;

public class Visitor {
    
    //name: String
    //ownedBooks: Inventory
    //overdueBalance: BigDecimal
    
    final private static String name = new String();
    private static Inventory checkedOutMedia = new Inventory();
    private static BigDecimal overdueBalance = new BigDecimal(0);
    
    Visitor (String name){
        Visitor.name = name; 
        Inventory checkedOutMedia = null;
        BigDecimal overdueBalance = BigDecimal.valueOf(0.00);
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
