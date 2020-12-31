package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationExcel {

	ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {

		System.out.println("UserName is -" + username);
		System.out.println("Password is  -" + password);

	}

	@DataProvider
	public Object[][] getData() {

		if (excel == null) {

			excel = new ExcelReader("C:\\Users\\Rohan_Rode\\Documents\\Test_ExcelRead.xlsx");

		}

		String sheetName = "loginData";

		int rowCount = excel.getRowCount(sheetName);
		int colCount = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rowCount- 1][colCount];

		for (int row = 2; row <= rowCount; row++) {

			for (int col = 0; col < colCount; col++) {

				String value = excel.getCellData(sheetName, col, row);

				data[row-2][col] = value;

			}

			

		}
		
		return data;
	}
}
