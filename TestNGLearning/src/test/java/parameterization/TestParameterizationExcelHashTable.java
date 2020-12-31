package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationExcelHashTable {

	ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void doLogin(Hashtable<String, String> data) {

		System.out.println(data.get("Username"));

	}

	@DataProvider
	public Object[][] getData() {

		if (excel == null) {

			excel = new ExcelReader("C:\\Users\\Rohan_Rode\\Documents\\Test_ExcelRead.xlsx");

		}

		String sheetName = "loginData";

		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rowCount-1][1];

		Hashtable<String, String> table = null;
		

		for (int row = 2; row <= rowCount; row++) {

			table = new Hashtable<String, String>();
			for (int col = 0; col < colCount; col++) {

				// String value = excel.getCellData(sheetName, col, row);

				table.put(excel.getCellData(sheetName, col, 1), excel.getCellData(sheetName, col, row));
				

			}
			
			data[row-2][0]=table;
			
			
		}
       
		return data;
	}
}
