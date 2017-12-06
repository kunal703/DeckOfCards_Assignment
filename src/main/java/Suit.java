enum Suit {

    Clubs(0), Diamonds(1), Hearts(2), Spades(3);
    private int value;

    Suit(int v) {
        this.value = v;
    }

    public int getValue() {
        return this.value;
    }

}