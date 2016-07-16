package ElevatorSystem;

public class FloorUI extends UIPanel{
	private int curFloor;
	private int curFloorElevator;
	private ElevatorController controller;
	
	
	public int sendRequest(String direction) {
		// TODO Auto-generated method stub
		return this.controller.sendFloorRequest(direction);
	}


	public int getCurFloor() {
		return curFloor;
	}


	public void setCurFloor(int curFloor) {
		this.curFloor = curFloor;
	}


	public int getCurFloorElevator() {
		return curFloorElevator;
	}


	public void setCurFloorElevator(int curFloorElevator) {
		this.curFloorElevator = curFloorElevator;
	}

}
