package Factory;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		TraceFactory factory=TraceFactoryImpl.getFactory();
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter Type: ");
		String input = reader.nextLine();
		String  type=input.toUpperCase();
		
		Trace trace= factory.createTrace(type);
		System.out.println(trace.getClass().getSimpleName());
		reader.close();
	}
}
