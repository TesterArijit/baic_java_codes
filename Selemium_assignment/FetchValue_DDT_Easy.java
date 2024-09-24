package basic_selinium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchValue_DDT_Easy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream f = new FileInputStream("C:\\Users\\chatt\\eclipse-workspace\\Selinium_Practice\\DDT_Concept\\Arijit_1.xlsx");
		         Workbook w = WorkbookFactory.create(f);
		         String User_name = w.getSheet("first").getRow(1).getCell(0).getStringCellValue();
		         String Password = w.getSheet("first").getRow(1).getCell(1).getStringCellValue();
		         System.out.println(User_name);
		         System.out.println(Password);

	}

}
