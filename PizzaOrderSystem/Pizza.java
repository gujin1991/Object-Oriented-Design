package June7th;
import java.util.*;

public abstract class Pizza implements Comparable{
	protected String type;
	protected int size;
	protected ArrayList<String> toppings;
	protected int cost;
	
	public Pizza(String t, int s) {
		this.type = t;
		this.size = s;
		this.toppings = new ArrayList<>();
		switch(s) {
		case 1:
			this.cost = 10;
			break;
		case 2:
			this.cost = 15;
			break;
		case 3:
			this.cost = 20;
			break;
		case 4:
			this.cost = 25;
			break;
		default:
			System.out.println("Wrong Size");
			break;
			
		}
		
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Pizza ob = (Pizza)o;
		return ob.size - this.size;
	}
	
	public void addToppings(String topOrder) {
		String[] tops = topOrder.split("/");
		for(String top : tops) {
			this.toppings.add(top);
		}
	}

}
