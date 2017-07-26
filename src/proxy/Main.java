package proxy;

public class Main {

	public static void main(String[] args) {
		
		
		Thread mythread1= new MyThread();		
		Thread mythread= new MyThread();
		 mythread1.start();
		 mythread.start();
	}
 
}
