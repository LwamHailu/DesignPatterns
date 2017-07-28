package Factory;

public class FileTrace implements Trace{

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
		System.out.println("this is a message from FileTrace"+message);
		
	}

	@Override
	public void error(String message) {
		System.out.println("this is a error from FileTrace"+message);
		
	}

	

	
	

}
