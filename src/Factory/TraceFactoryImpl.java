package Factory;

public class TraceFactoryImpl  implements TraceFactory{
	
	private static TraceFactory factory = new TraceFactoryImpl();
	
	
	private TraceFactoryImpl() {
	}

	public static TraceFactory getFactory() {
		return factory;
	}

	@Override
	public Trace createTrace(String type) {
		Trace trace =null;
		if(type.equals("FileTrace")){
			trace=	 new FileTrace();
			
		}
		else
			trace= new ConsoleTrace();
		
		
		 return trace;
	}

}
