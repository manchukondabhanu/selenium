package pack1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
public class Insertdata {
public static void main(String[] args) throws IOException{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement ele=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]"));
//		List<WebElement>rowc=ele.findElements(By.tagName("tr"));
//		for (int i = 0; i < rowc.size(); i++) {
//		  List<WebElement>colc=rowc.get(i).findElements(By.tagName("td"));
//		   for (int j = 0; j < colc.size(); j++) {
//			System.out.println(colc.get(j).getText()+"  ");		  
//		   }
//		   
//		   System.out.println(987 );	
//}
		
	   FileInputStream fis=new FileInputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\file.xlsx");
	   XSSFWorkbook wbo=new XSSFWorkbook(fis);
	   XSSFSheet wso=wbo.getSheet("Sheet1");
       Row r;
       WebElement ele=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]"));
	     List<WebElement>rowc=ele.findElements(By.tagName("tr"));
		for (int i = 0; i < rowc.size(); i++) {
			r=wso.createRow(i);
		 r.createCell(0).setCellValue(rowc.get(i).getText());
} 
       FileOutputStream fo=new FileOutputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\file.xlsx");
       wbo.write(fo);
}
}