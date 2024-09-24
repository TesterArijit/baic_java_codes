package basic_selinium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchValue_DDT1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_Practice\\DDT_Concept\\Arijit_1.xlsx"); // ----Step 1
		       Workbook w = WorkbookFactory.create(f);//----Step 2
		          Sheet s = w.getSheet("first");//----Step 3
		            Row r = s.getRow(1);//----Step 4
		            Cell c = r.getCell(0);//----Step 5
		            String stringCellValue = c.getStringCellValue();//----Step 6
		            System.out.println(stringCellValue);// Get username
		            
		            ////////////Get passwod
		            Row r1 = s.getRow(1);//----Step 4
		            Cell c1 = r1.getCell(1);//----Step 5
		            String stringCellValue1 = c1.getStringCellValue();//----Step 6
		            System.out.println(stringCellValue1);

	}

}
