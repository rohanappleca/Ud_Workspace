import java.util.Hashtable;

public class TestHashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcelReader excel=new ExcelReader("C:\\Users\\Rohan_Rode\\Documents\\Test_ExcelRead.xlsx");
		
		
		String sheetName = "loginData";

		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);
		
		Hashtable<String,String> table=null;
		
		Object[][]data=new Object[rowCount-1][colCount];
		
		for (int row=2;row <=rowCount;row++) {
			int col;
			table=new Hashtable<String,String>();
			for( col=0;col<colCount;col++) {
				
				table.put(excel.getCellData(sheetName, col, 1), excel.getCellData(sheetName, col, row));
				System.out.println(table+ " Row value "+row+ " Col value"+col);
			}
			
			data[row-2][0]=table;
		}
		
		
		
	}
}
