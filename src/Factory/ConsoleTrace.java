package Factory;

public class ConsoleTrace  implements Trace{

	@Override
	public void setDebug(boolean debug) {
		if(debug){
			debug=false;
		}
		else 
			debug=true;
		
	}

	

	@Override
	public void debug(String message) {
		System.out.println("this is from Console"+message);
		
	}

	@Override
	public void error(String message) {
		System.out.println("this is error  from Console"+message);
		
	}
	
	

}
