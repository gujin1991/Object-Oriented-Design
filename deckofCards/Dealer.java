package deckofCards;

public class Dealer extends Player{
	private String name;
	private int curPoint;
	
	public Dealer(String name) {
		this.name = name;
	}
	
	@Override
	public void getCard(int point) {
		// TODO Auto-generated method stub
		this.curPoint += point;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public boolean askCard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCurPoint() {
		// TODO Auto-generated method stub
		return this.curPoint;
	}
	
}
