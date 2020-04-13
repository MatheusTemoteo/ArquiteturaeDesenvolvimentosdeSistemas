package ex_3_2;

import java.util.ArrayList;
import java.util.Collections;

public class DeckSingleton {
	private static DeckSingleton deck = new DeckSingleton();;
	private ArrayList<Card> cards = new ArrayList<Card>();

	
	
	private DeckSingleton() {
		//build the deck
		Suit[] suits = {Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS};
		
		for(Suit suit: suits) {
			
			for(int i = 2; i <= 14; i++) {
				
				cards.add(new Card(suit, i));
				
			}
		}
		//Shuffle it!
		Collections.shuffle(cards);
		
		
			for(Card card: cards) {
			card.print( );
			}
		
	}
	
	public static DeckSingleton getDeck() {
		return deck;
	}
	
	public static String DeckString() {
		return deck.toString();
	}
}
