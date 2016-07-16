package ElevatorManagermentSystemMTread;
import java.util.*;

public class Elevator extends Thread {
	private int[] requests;
	private int maxSize;
	private boolean direction;
	private int curFloor;
	private boolean state;
	private int floors;
	
	public Elevator(int personsNum, int floorsNum) {
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
				
				while(hasUp() && this.curFloor != floors) {
					this.curFloor++;
					out();
					in();
				}
				direction = false;
			} else {
				state = true;
				out();
				in();
				
				while(hasUp() && this.curFloor != 0) {
					this.curFloor++;
					out();
					in();
				}
				direction = true;
			}
		}
	}
	
	private void in() {
		
	}
	
	private void out() {
		
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
