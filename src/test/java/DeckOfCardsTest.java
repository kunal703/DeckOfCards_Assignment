/**
 * This is the junit testfile
 * @author : Kunal Modi
 */

import static org.junit.Assert.*;

import org.junit.*;

import static org.hamcrest.CoreMatchers.is;

import java.util.ArrayList;

public class DeckOfCardsTest {

    private DeckOfCards deck;

    /**
     * Before the testing starts
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        this.deck = new DeckOfCards();
    }

    /**
     * After testing has been done
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        this.deck = null;
    }

    /**
     * Test if shuffle works correctly or not
     */
    @Test
    public void testShuffle() {
        ArrayList<Card> origList = new ArrayList<>(deck.getCards());
        deck.shuffle();
        ArrayList<Card> shuffledList = new ArrayList<>(deck.getCards());
        assertNotEquals(origList, shuffledList);
    }

    /**
     * Test DealOneCard when deck contains cards
     */
    @Test
    public void testDealOneCardWhenDeckContainsCards() {

        boolean result = false;

        int initialDeckSize = deck.getCards().size();
        Card card = null;
        try {
            card = deck.dealOneCard();
        } catch (DeckEmptyException e) {
            System.out.println(e.getMessage());
        }
        int finalDeckSize = deck.getCards().size();

        if (card != null && (finalDeckSize + 1 == initialDeckSize))
            result = true;

        assertTrue(result);
    }

    /**
     * Test for DealOneCard when deck is empty
     */
    @Test
    public void testDealOneCardWhenDeckIsEmpty() {
        System.out.println(deck.getCards());
        deck.getCards().clear();
        try {
            deck.dealOneCard();
        } catch (DeckEmptyException e) {
            assertThat(e.getMessage(), is("Deck is empty"));
        }

    }
}