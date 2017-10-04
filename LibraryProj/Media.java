/**
 * Interface for multiple types of media. (Books, DVDs, etc)
 */
public interface Media {

    /**
     * Get the title of a media.
     * @return title
     */
    public String getTitle();

    /**
     * Get the category of a media.
     * @return category
     */
    public String getCategory();

    /**
     * Get the category of a media.
     * @return category
     */
    public String getLocation();

    /**
     * Should return whether the media's title or category matches some search term.
     * @param term Some String that may be title or category
     * @return whether the Media matches
     */
    public default boolean matches(String term) {
        return term == getTitle() || term == getCategory();
    }

    /**
     * Return the class name.
     * @return class name
     */
    default String getType() {
        return this.getClass().getName();
    }

    /**
     * Match two media by their title and category.
     * @param media Some media to evaluate against
     * @return whether they are a match
     */
    default boolean equals(Media media) {
        return this.getCategory() == media.getCategory() && this.getTitle() == media.getCategory();
    }
}
