package deckofCards;
import java.util.*;

public class Deck {
	private int curCardNum;
	private ArrayList<Card> cards;
	
	public int send() {
		int cardVal  = 0;
		curCardNum--;
		return cardVal;
	}
	
	public void shuffle() {
		
	}
	
	public int getCardNum(){
		return this.curCardNum;
	}

}
