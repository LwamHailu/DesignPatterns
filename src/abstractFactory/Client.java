package abstractFactory;

public class Client {
    
    public static void main(String[] args)
    {
        TraceFactory tFactory = SimpleTraceFactory.getTraceFactory();
        Trace tf = tFactory.createTrace("FILE");
        tf.setDebug(true);
        tf.debug("FILEDEBUGMSG");
        
        Trace tc = tFactory.createTrace("CONSOLE");
        tc.setDebug(true);
        tc.debug("CONSOLEDEBUGMSG");
         tc.setDebug(false);
        tc.debug("CONSOLEDEBUGMSG");
    }
}
