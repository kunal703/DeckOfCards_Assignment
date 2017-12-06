import java.util.ArrayList;
import java.util.Collections;

class DeckOfCards {

    private ArrayList<Card> cards;

    /**
     *  Initialize the deck of cards
     */
    DeckOfCards() {

        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue: FaceValue.values()) {
                cards.add(new Card(faceValue, suit));

            }
        }
    }

    /**
     * Shuffle the remaining deck
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     *
     * @return The dealed card
     * @throws DeckEmptyException
     */
    public Card dealOneCard() throws DeckEmptyException{
        if(cards.size() == 0){
            throw new DeckEmptyException("Deck is empty");
        }
        Card temp = cards.remove(0);
        temp.markUnavailable();
        return temp;
    }

    /**
     *
     * @return The cards remaining in the deck
     */
    ArrayList<Card> getCards() {
        return cards;
    }
}