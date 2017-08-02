package state;

public class WetRoadState implements RoadState {

	@Override
	public void leftResponse() {
		System.out.print(" 4");

	}

	@Override
	public void accelResponse() {
		System.out.print(" 9");
	}

	@Override
	public void rightResponse() {
		System.out.print(" 4");

	}

	@Override
	public void brakeResponse() {
		System.out.print(" 7");
	}

}
