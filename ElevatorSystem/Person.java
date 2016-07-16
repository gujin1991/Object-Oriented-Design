package ElevatorSystem;

public class Person {
	private String name;
	private FloorUI floorButtons;
	private ElevatorUI elevatorButtons;
		
	public Person(String n, FloorUI fb, ElevatorUI eb, int cF) {
		
	}
	
	public void go(String direction, int destination) {
		if(this.askForElevator(direction) == this.floorButtons.curFloor) {
			moveIn();
		} else {
			while(this.checkElevatorFloor() != this.elevatorButtons.curFloor) {
				//waits;
			}
			moveIn();
		}
		
		sendDestinationRequest(destination);
		while(this.checkElevatorFloor() != this.curFloorElevator) {
			//waits;
		}
		leave();
		
	}
	
	private void leave() {
		// TODO Auto-generated method stub
		
	}
	

	private void sendDestinationRequest(int destination) {
		// TODO Auto-generated method stub
		this.elevatorButtons.sendDestRequest(destination);
	}

	private void moveIn() {
		// TODO Auto-generated method stub
		
	}

	public int askForElevator(String direction) {
		return this.floorButtons.sendRequest(direction);
	}
	
	public int checkElevatorFloor() {
		return this.curFloorElevator;
	}
	
	
}
