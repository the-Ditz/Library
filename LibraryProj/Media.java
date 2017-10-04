public interface Media {

    public static final int START_OF_CLASSNAME = 6;

    public String getTitle();

    public String getLocation();

    public String getCategory();

    default String getType() {
        return this.getClass().toString().substring(this.getClass().toString().lastIndexOf('.') + 1);
    }
}
