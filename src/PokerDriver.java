import java.util.Stack;

public class PokerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card card1 = new Card(Card.Rank.EIGHT, Card.Suit.SPADES);
//		Card card2 = new Card(Card.Rank.ACE, Card.Suit.SPADES);
		Deck myDeck = new Deck();
		
//	     shuffle card
         Stack<Card> tempDeck = new Stack<Card>();
         tempDeck = myDeck.shuffle();
		
		System.out.println(tempDeck);
		System.out.println(tempDeck.size());
		
        tempDeck = myDeck.shuffle();
		
		System.out.println(tempDeck);
		System.out.println(tempDeck.size());

		
		
		

	}

}
