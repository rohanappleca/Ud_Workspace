import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook = new XSSFWorkbook();
     	XSSFSheet sheet = workbook.createSheet("FirstSheet");

		// Row row0 = sheet.createRow(0);
		/*
		 * Cell cellA = row0.createCell(0); Cell cellB = row0.createCell(1);
		 * 
		 * cellA.setCellValue("first cell"); cellB.setCellValue("Second Cell");
		 */

		/*
		 * XSSFRow row0 = sheet.createRow(0); XSSFCell cellA = row0.createCell(0);
		 */

		for (int i = 0; i < 10; i++) {

			Row rowCr = sheet.createRow(i);

			for (int j = 0; j < 3; j++) {

				Cell cellCr = rowCr.createCell(j);
				cellCr.setCellValue((int)(Math.random()*100));

			}

		}

		File f = new File("C:\\UD\\Automation\\FileWriting\\ExcelFileLoopWrite.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);

		fo.close();

		System.out.println("File created");

	}

}
