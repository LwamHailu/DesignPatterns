package iterator;

public class Main {
	public static void main(String []a){
		Aggregate names= new NameRepository();
		Iterator iterator= names.getIterator();
		while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
		}

}
