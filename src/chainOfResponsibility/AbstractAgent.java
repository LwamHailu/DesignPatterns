package chainOfResponsibility;

public    abstract class AbstractAgent {
	protected AbstractAgent nextAgent;
	abstract public void handleRequest(CallRecord record);
	

}
