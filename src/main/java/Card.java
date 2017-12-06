/**
 * @author : Kunal Modi
 */

class Card {

    private boolean available = true;

    private FaceValue faceValue;
    private Suit suit;

    /**
     *
     * @param c: FaceValue
     * @param s: Suit
     */
    Card(FaceValue c, Suit s) {
        this.faceValue = c;
        this.suit = s;
    }

    /**
     *
     * @return: Suit
     */
    private Suit suit() {
        return suit;
    }

    /**
     *
     * @return FaceValue
     */
    public FaceValue faceValue() {
        return faceValue;
    }

    /**
     *
     * @return Card is available or not
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     *  Mark the card as Unavailable
     */
    public void markUnavailable() {
        available = false;
    }

    /**
     * Mark the card as Available
     */
    void markAvailable() {
        available = true;
    }

    /**
     *
     * @return Card Value
     */
    @Override
    public String toString() {
        return this.faceValue + " of " + this.suit();
    }
}