package deckofCards;
import java.util.*;

public class BlackJack {
	private Dealer host;
	private Participant[] players;
	private Deck porker;
	private static int playersNum = 8;
	
	public void play() {
		host = new Dealer("HOST");
		porker = new Deck();
		Random random = new Random();
		boolean endNow = false;
		for(int i = 0; i < playersNum; i++) {
			int idx = random.nextInt(playersNum);
			players[idx] = new Participant("" + i);
		}
		
		for(int i = 0; i < playersNum; i++) {
			if(players[i] != null) {
				players[i].getCard(porker.send());
				players[i].getCard(porker.send());
			}
		}
		
		host.getCard(porker.send());
		host.getCard(porker.send());
		
		while(!endNow && porker.getCardNum() == 0) {
			for(int i = 0; i < playersNum; i++) {
				if(players[i] != null) {
					boolean needCard = players[i].askCard();
					if(needCard) {
						players[i].getCard(porker.send());
					}
					endNow = endNow || needCard;
				}
			}
			
			boolean needCardHost = host.askCard();
			if(needCardHost) {
				host.getCard(porker.send());
			}
			endNow = endNow || needCardHost;
		}
		
		for(int i = 0; i < playersNum; i++) {
			if(players[i] != null && players[i].getCurPoint() > host.getCurPoint()) {
				System.out.println("Player" + players[i].getName() + "wins!");
			}
		}
		
	}
	
	
}
