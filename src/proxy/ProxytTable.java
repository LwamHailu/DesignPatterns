package proxy;

import adapter.Table;

public class ProxytTable  implements ITable{
    private ITable table= new Table();
	@Override
	public  synchronized int numOfRows() {
	
		return table.numOfRows();
	}

	@Override
	public synchronized IRow getRow(int rowNum) {
		
		return table.getRow(rowNum);
	}

	@Override
	public  synchronized void addRow(IRow row, int rowNum) {
		table.addRow(row, rowNum);
		
	}

	@Override
	public  synchronized void modifyRow(int rowNum, IRow row) {
		table.modifyRow(rowNum, row);
		
	}

	@Override
	public synchronized void deleteRow(int rowNum) {
		table.deleteRow(rowNum);
		
	}

}
