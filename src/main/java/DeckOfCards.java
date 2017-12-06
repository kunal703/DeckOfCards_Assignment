import java.util.ArrayList;
import java.util.Collections;

class DeckOfCards {

    private ArrayList<Card> cards;

    DeckOfCards() {

        cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue: FaceValue.values()) {
                cards.add(new Card(faceValue, suit));

            }
        }
    }

    void shuffle() {
        Collections.shuffle(cards);
    }

    Card dealOneCard() {
        if(cards.size() == 0){
            return null;
        }
        Card temp = cards.remove(0);
        temp.markUnavailable();
        return temp;
    }

    ArrayList<Card> getCards() {
        return cards;
    }
}