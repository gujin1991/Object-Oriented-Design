package ElevatorManagermentSystem;
import java.util.*;

public class Elevator extends Thread {
	LinkedList<Person> persons;
	int[] requests;
	int maxSize;
	boolean direction;
	int curFloor;
	boolean state;
	
	public Elevator(int personsNum, int floorsNum) {
		this.persons = new LinkedList<Person>();
		this.requests = new int[floorsNum];
		
		
	}
	
	public void run() {
		while(true) {
			if(!hasUp() && !hasDown()) {
				state = false;
				this.direction = true;
			} else if(direction) {
				state = true;
				out();
				in();
				
				while(hasUp() && this.curFloor != floors.length) {
					this.curFloor++;
					out();
					in();
				}
				direction = false;
			} else {
				state = true;
				out();
				in();
				
				while(hasUp() && this.curFloor != floors.length) {
					this.curFloor++;
					out();
					in();
				}
				direction = true;
			}
		}
	}
	
	private boolean hasUp() {
		return true;
	}
	
	private boolean hasDown() {
		return false;
	}
	

	public void getRequest(int floorId, boolean isUp) {
		// TODO Auto-generated method stub
		if(!this.state) {
			this.curFloor = floorId;
		} 
	}
}
