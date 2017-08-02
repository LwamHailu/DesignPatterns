package state;

public class IceRoadState implements RoadState {

	@Override
	public void leftResponse() {
		System.out.print(" 1");

	}

	@Override
	public void accelResponse() {
		System.out.print(" 3");

	}

	@Override
	public void rightResponse() {
		System.out.print(" 1");

	}

	@Override
	public void brakeResponse() {
		System.out.print(" 2");

	}

}
