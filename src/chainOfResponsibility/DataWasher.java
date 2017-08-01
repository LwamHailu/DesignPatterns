package chainOfResponsibility;

public class DataWasher  extends AbstractAgent{

	@Override
	public void handleRequest(CallRecord record) {
	   record.setASalesLead(true);
	   this.nextAgent.handleRequest(record);
		
		
	}

}
