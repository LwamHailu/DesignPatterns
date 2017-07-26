package proxy;

public class MyThread  extends Thread{
 private ProxytTable proxy= new ProxytTable();
	@Override
	public void run() {
		IRow row1= new Row("Lwam","12","25");
		IRow row2= new Row("tesfay","11","27");
		IRow row3= new Row("Hailu","10","50");
		
		proxy.addRow(row1, 0);
		System.out.println("number of rows  "+Thread.currentThread().getId()+proxy.numOfRows()+proxy.getRow(1));
		proxy.addRow(row2, 1);
		System.out.println("number of rows  "+Thread.currentThread().getId()+proxy.numOfRows()+proxy.getRow(1));
		proxy.addRow(row3, 2);
	   System.out.println("number of rows  "+Thread.currentThread().getId()+proxy.numOfRows()+proxy.getRow(1));
	   
	   proxy.deleteRow(2);
		System.out.println("deleted row is "+ proxy.numOfRows());
	}
	

}
