package state;

public class DrivingCarGame {
	private RoadState regular;
	private RoadState gravel;
	private RoadState wet;
	private RoadState ice;
	private RoadState initial = regular;
	private int level;

	public DrivingCarGame(int leve) {

		this.regular = new RegularRoadState();
		this.gravel = new GraveRoadState();
		this.wet = new WetRoadState();
		this.ice = new IceRoadState();
		setLevel(level);

	}

	public void leftResponse() {
		initial.leftResponse();
	}

	public void rightResponse() {
		initial.rightResponse();
		
	}

	public void accelResponse() {
		initial.accelResponse();
		;
	}

	public void brakeResponse() {
		initial.brakeResponse();
		;
	}

	public RoadState getRegular() {
		return regular;
	}

	public void setRegular(RoadState regular) {
		this.regular = regular;
	}

	public RoadState getGrave() {
		return gravel;
	}

	public void setGrave(RoadState grave) {
		this.gravel = grave;
	}

	public RoadState getWet() {
		return wet;
	}

	public void setWet(RoadState wet) {
		this.wet = wet;
	}

	public RoadState getIce() {
		return ice;
	}

	public void setIce(RoadState ice) {
		this.ice = ice;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
		if (level == 0) {
			this.initial = regular;
		} else if (level == 1) {
			this.initial = gravel;

		} else if (level == 2) {
			this.initial = wet;

		} else if (level == 3) {
			this.initial = ice;

		}
	}

	public RoadState getInitial() {
		return this.initial;
	}
	// public void setInitial(RoadState initial) {
	// this.initial = initial;
	// }

}
