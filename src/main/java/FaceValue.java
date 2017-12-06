/**
 * @author : Kunal Modi
 */

public enum FaceValue {

    Ace(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13);

    private int value;

    /**
     *
     * @param v: Value betoween 1 to 13 for the FaceValue
     */
    FaceValue(int v) {
        this.value = v;
    }

    /**
     *
     * @return : Value betoween 1 to 13 for the FaceValue
     */
    public int getValue() {
        return this.value;
    }
}