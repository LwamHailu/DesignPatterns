package iterator;

public class NameIterator  implements Iterator{
 int index;
	@Override
	public boolean hasNext() {
		if(index< new NameRepository().getNames().length){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		String name=" ";
		 String[][] names = new NameRepository().getNames();
		if( this.hasNext()){
			for(int j=0;j<names[index].length;j++){
				if(!names[index][j].equals("-"))
					name+=names[index][j]+" ";
				
			
			
		}
			index++;
			return name;
			}
		return null;
	}

	

}
