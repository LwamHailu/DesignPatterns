package chainOfResponsibility;

public class ChainBuilder {
private AbstractAgent handler;

       public void buildChain(){
    	AbstractAgent firsHandler= new Validator();
    	AbstractAgent secondHandler = new DataWasher();
    	AbstractAgent thirdHandler = new Reporter();
    	this.handler=firsHandler;
    	firsHandler.nextAgent=secondHandler;
    	secondHandler.nextAgent=thirdHandler;
    }

	public AbstractAgent getHandler() {
		return handler;
	}

	public void sethandler(AbstractAgent handler) {
		this.handler = handler;
	}

}
