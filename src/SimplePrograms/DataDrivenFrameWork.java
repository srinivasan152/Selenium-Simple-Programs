package SimplePrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenFrameWork {

	public   String GetData(String sheetName, int RowNum, int CellNum) {
		String RetVel=null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\madhi\\OneDrive\\Documents\\data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetName);
			Row r=s.getRow(RowNum);
			Cell c=r.getCell(CellNum);
			RetVel=c.getStringCellValue();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return RetVel;
		
		
		
	}

}
