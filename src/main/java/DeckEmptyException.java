/**
 * @author Kunal Modi
 */
public class DeckEmptyException extends Exception{

    public DeckEmptyException() {}

    /**
     *
     * @param message : Exception message
     */
    public DeckEmptyException(String message)
    {
        super(message);
    }
}
