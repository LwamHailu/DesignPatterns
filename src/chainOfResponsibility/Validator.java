package chainOfResponsibility;

public class Validator  extends AbstractAgent{
    
	@Override
	public void handleRequest(CallRecord record ) {
		if(record.getCustomer().getAddress()!=null && record.getCustomer().getEmail()!=null
				&& record.getCustomer().getAddress()!=null){
			record.setValid(true);
			this.nextAgent.handleRequest(record);
		}
		
		
		
	}

}
