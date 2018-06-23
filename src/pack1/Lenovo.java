package pack1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Lenovo {
	public static void main(String[] args) throws IOException {
       FileInputStream fis=new FileInputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\file.xlsx");
       XSSFWorkbook wbo=new XSSFWorkbook(fis);
       XSSFSheet wso=wbo.getSheet("Sheet1");
       Row r;
       int rowc=wso.getLastRowNum();
       for (int i = 0; i < rowc; i++) {
    	   r=wso.getRow(i);
       int colc=r.getLastCellNum(); 
       for (int j = 0; j < colc; j++) {
         System.out.println(r.getCell(j).getStringCellValue()+"  ");
    	   } 
    	   }
       FileOutputStream fo=new FileOutputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\file.xlsx");
       wbo.write(fo); 
	}
}
