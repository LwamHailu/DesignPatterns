package decorator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayListProfileDecorator<>( new ArrayList<>());
		arrayList.add(12);
		arrayList.add(862);
		arrayList.add(100);
		arrayList.add(1200);
		
		arrayList.remove(0);
		arrayList.contains(12);
		arrayList.size();
		
		List<Integer> linkedList = new LinkedListProfileDecorator<>( new LinkedList<>());
		linkedList.add(400);
		linkedList.add(900);
		linkedList.add(1200);
		linkedList.add(1800);
		
		linkedList.remove(2);
		linkedList.contains(400);
		linkedList.size();
	}

}
