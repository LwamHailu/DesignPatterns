package chainOfResponsibility;

public class Client {
	
	private  static ChainBuilder builder = new ChainBuilder();
	
	
	public   void sendRequest(CallRecord record) {
		builder.getHandler().handleRequest(record);
		
		
		
	}
	public static void main(String[] args) {
		Client request=new Client();
		//ChainBuilder chain=new ChainBuilder();
		request.builder.buildChain();
		Address address1=new Address("123st","oaklnad", "CA", "123456");
		Address address2=new Address("5673st","Fairfield", "IA", "97436");
		Address address3=new Address("465373st","Fairfield", "IA", "97436");
		Agent agent= new Agent("87", address3);
		Customer customer1= new Customer("Lwam", "hailu", address1, "589375389", "lulu@mim.edu");
		Customer customer2= new Customer("Bindi", "tekle", address2, "6347625389", "bindi@mim.edu");
		CallRecord record= new CallRecord(customer1, agent, "getInfo", false, false);
		CallRecord record1= new CallRecord(customer2, agent, "getInfo", false, false);
		request.sendRequest(record);
		request.sendRequest(record1);
	}
}
