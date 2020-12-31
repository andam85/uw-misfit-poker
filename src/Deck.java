/**
 * Test code for shuffling a deck of cards, 52 cards.
 */

/**
 * @author 
 *
 */

import java.util.Stack;
import java.util.Random;

public class Deck {

   
   /** *************      FIELDS    ***********************/
   private Card deck[] = new Card[52];
   
   /** Default Constructor
    * @post creates a deck (not shuffled).
    */
   public Deck() {
      //populate deck array
	   int i =0;
	   for(int k = 2; k <= 14 ; k++ ) // rank
	   {
	      deck[i++] =  new Card(k, "CLUBS");
	      deck[i++] =  new Card(k, "DIAMONDS");
	      deck[i++] =  new Card(k, "HEARTS");
	      deck[i++] =  new Card(k, "SPADES");
	   }
   }
	
   /** Swap array positions i and j
    * @param card[] array of integers
    * @param i first index location
    * @param j second index location
    */
   public void swap(Card deck[], int i, int j) {
      Card temp = deck[i];
      deck[i] = deck[j];
      deck[j] = temp;
   }
	
   /** Deck of cards (52 cards)
    * 
    */
   public Stack<Card> shuffle() {
	   Stack<Card> temp = new Stack<Card>(); //stack to return
	   
	   //Create new random object
	   Random random = new Random();
	   
	   //Randomize by swapping array pairs
	   for(int i = 0; i < deck.length; i++) {
		   //pick a random index from (52 - i)
		   int j = i + random.nextInt(deck.length - i);
		   swap(deck, i, j);
	   }
	   
	   //Populate stack with randomized array
	   for(Card n : deck) {
		   temp.push(n); //load stack
	   }
	   
	   return temp;
   }
}
