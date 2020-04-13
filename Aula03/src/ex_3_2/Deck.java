package ex_3_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
	
		public Deck( ) {
		ArrayList<Card>deck = new ArrayList<Card>( );
		// build the deck
		Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS,

		Suit.DIAMONDS};
		for(Suit suit: suits) {
		for(int i = 2; i <= 14; i++) {
		deck.add(new Card(suit, i));
		}
		}
		
		// shuffle it!
		Collections.shuffle(deck);
		}
		
		public void print( ) {
			for(Card card: cards) {
			card.print( );
			}
			}
		
			private List<Card> cards;
			
			}

