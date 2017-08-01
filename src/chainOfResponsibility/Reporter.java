package chainOfResponsibility;

public class Reporter  extends AbstractAgent{

	@Override
	public void handleRequest(CallRecord record) {
		
		 
		 System.out.println(record);
		
	}

}
