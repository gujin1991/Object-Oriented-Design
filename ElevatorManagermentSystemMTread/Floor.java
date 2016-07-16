package ElevatorManagermentSystemMTread;

public class Floor {
	private int floorId;
	private Button up;
	private Button down;
	private Elevator e;
	
	public void setUp() {
		// TODO Auto-generated method stub
		up.setState(true);
		this.sendRequest(this.floorId, true);
	}
	
	public void setDown() {
		down.setState(true);
		this.sendRequest(floorId, false);
	}
	
	private void sendRequest(int floorId, boolean isUp) {
		this.e.getRequest(floorId, isUp);
	}
	
	
}
