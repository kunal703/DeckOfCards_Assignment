class Card {

    private boolean available = true;

    private FaceValue faceValue;
    private Suit suit;

    Card(FaceValue c, Suit s) {
        this.faceValue = c;
        this.suit = s;
    }

    private Suit suit() {
        return suit;
    }

    public FaceValue faceValue() {
        return faceValue;
    }

    public boolean isAvailable() {
        return available;
    }

    public void markUnavailable() {
        available = false;
    }

    void markAvailable() {
        available = true;
    }

    @Override
    public String toString() {
        return this.faceValue + " of " + this.suit();
    }
}