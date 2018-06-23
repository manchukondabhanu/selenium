package Pack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelReader {
String path;
Workbook wbo;
public XcelReader(String path) throws IOException, Exception, InvalidFormatException{
	this.path=path;
	FileInputStream fis=new FileInputStream(path);
	wbo=WorkbookFactory.create(fis);
}
public int getRowsCount(String sheetname){
	return wbo.getSheet(sheetname).getLastRowNum()+1; 
}
public String CellData(String sheetname,int rownum,int cellcol){
	return wbo.getSheet(sheetname).getRow(rownum).getCell(cellcol).getStringCellValue();
}
public void setCellData(String sheetname,int rownum,int callcol,String celvalue) throws FileNotFoundException, IOException{
	wbo.getSheet(sheetname).getRow(rownum).createCell(callcol).setCellValue(celvalue);
   wbo.write(new FileOutputStream(path));
} 
}
