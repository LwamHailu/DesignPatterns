package state;

public class RegularRoadState implements RoadState {

	@Override
	public void leftResponse() {
		System.out.print(" 5");

	}

	@Override
	public void accelResponse() {
		System.out.print(" 9");

	}

	@Override
	public void rightResponse() {
		System.out.print(" 5");

	}

	@Override
	public void brakeResponse() {
		System.out.print(" 8");
	}

}
