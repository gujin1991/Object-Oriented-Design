package ElevatorSystem;

public class ElevatorController {
	private Elevator elevator;
	
	
	public int sendFloorRequest(String direction) {
		// TODO Auto-generated method stub
		return this.elevator.addRequest(direction);
	}

}
