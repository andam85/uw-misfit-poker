import java.util.EnumMap;

public class Card {

   private final int rank;
   private final String suit;


   public Card(int rank, String suit) {
      this.rank = rank;
      this.suit = suit;
   }

   public int getRank() {
      return this.rank;
   }

   public String getSuit() {
      return this.suit;
   }
   
   public String toString() {
   if(this.rank > 10){
      if(this.rank == 11) {
	     return "JACK of " + this.suit;
	  }else if (this.rank == 12) {
	     return "QUEEN of " + this.suit;
	  }else if (this.rank == 13) {
	     return "KING of " + this.suit; 
	  }else {
	     return "ACE of " + this.suit; 
	  }
   }
      return this.rank + " of " + this.suit;
   }
	
}
   // need comparator

//// 
//private final Suit suit;
//private final Rank rank;
//
//public enum Rank{ TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
//NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
//
//
//private final int rankValue;
//
//private Rank(int rankValue) {
//    this.rankValue = rankValue;
//}
//}
//
//public enum Suit{ CLUBS, SPADES, DIAMONDS, HEARTS;
//
//}
//
//public Card(Rank rank, Suit suit) {
//this.rank = rank;
//this.suit = suit;
//}
//
//public Card(int r, int s) {
//this.rank = r;
//}
//
//public Suit getSuit() {
//return suit;
//}
//
//public Rank getRank() {
//return rank;
//}