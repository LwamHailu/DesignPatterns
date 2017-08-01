package iterator;

public class NameRepository implements Aggregate{
	 private String names[][]= {{"lwam","febu","tekle","-"},{"zaid","tesfay","-","abenu"}};
	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
	}
	public String[][] getNames() {
		return names;
	}
	public void setNames(String[][] names) {
		this.names = names;
	}

}
