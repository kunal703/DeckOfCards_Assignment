/**
 * @author : Kunal Modi
 */
enum Suit {

    Clubs(0), Diamonds(1), Hearts(2), Spades(3);
    private int value;

    /**
     *
     * @param v: Value between 0 to 3 indicating the Suit
     */
    Suit(int v) {
        this.value = v;
    }

    /**
     *
     * @return v: Value between 0 to 3 indicating the Suit
     */
    public int getValue() {
        return this.value;
    }

}