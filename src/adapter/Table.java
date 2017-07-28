package adapter;

import java.util.Hashtable;

import proxy.IRow;
import proxy.ITable;

public class Table  implements ITable{
 private Hashtable<Integer,IRow>iTable= new Hashtable<>();
	@Override
	public int numOfRows() {
		
		return iTable.size();
	}

	@Override
	public IRow getRow(int rowNum) {
	
		return iTable.get(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		iTable.put(rowNum, row);
		
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		//iTable.replace(rowNum, row);
		iTable.put(rowNum, row);
		
	}

	@Override
	public void deleteRow(int rowNum) {
		iTable.remove(rowNum);		
	}

}
