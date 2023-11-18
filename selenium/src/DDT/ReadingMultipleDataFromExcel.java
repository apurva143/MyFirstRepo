package DDT;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipleDataFromExcel {
	public static void main(String[] args) throws AWTException, EncryptedDocumentException, InvalidFormatException, IOException {
		File file=new File("./testdata/DDATA.xlsx");
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}
		}
	}
}
