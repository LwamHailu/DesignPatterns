package state;

public class Client {
	
	public static void main(String[] args) {
		
		DrivingCarGame game= new DrivingCarGame(0);
		System.out.println(game.getInitial().getClass().getName().toString()+"\n");
		game.accelResponse();
		game.brakeResponse();
		game.leftResponse();
		game.rightResponse();
		
		
		game.setLevel(1);
		System.out.println("\n"+game.getInitial().getClass().getName().toString());
		game.accelResponse();
		game.brakeResponse();
		game.leftResponse();
		game.rightResponse();
		
		
		game.setLevel(2);
		System.out.println("\n"+game.getInitial().getClass().getName().toString());
		game.accelResponse();
		game.brakeResponse();
		game.leftResponse();
		game.rightResponse();
		
		
		game.setLevel(3);
		System.out.println("\n"+game.getInitial().getClass().getName().toString());
		game.accelResponse();
		game.brakeResponse();
		game.leftResponse();
		game.rightResponse();
		
	}

}
