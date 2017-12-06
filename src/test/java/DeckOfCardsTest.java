import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class DeckOfCardsTest {

    private DeckOfCards deck;

    @Before
    public void setUp() throws Exception {
        this.deck = new DeckOfCards();
    }

    @After
    public void tearDown() throws Exception {
        this.deck = null;
    }


    @Test
    public void testShuffle() {
        ArrayList<Card> origList = new ArrayList<>(deck.getCards());
        deck.shuffle();
        ArrayList<Card> shuffledList = new ArrayList<>(deck.getCards());
        assertNotEquals(origList, shuffledList);
    }

    @Test
    public void testDealOneCardWhenDeckContainsCards() {

        boolean result = false;

        int initialDeckSize = deck.getCards().size();
        Card card = deck.dealOneCard();
        int finalDeckSize = deck.getCards().size();

        if(card!=null && (finalDeckSize + 1 == initialDeckSize) )
            result = true;

        assertTrue(result);
    }

    @Test
    public void testDealOneCardWhenDeckIsEmpty(){
        System.out.println(deck.getCards());
        deck.getCards().clear();
        assertNull(deck.dealOneCard());
    }
}