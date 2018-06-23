 package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class DataDrivenFrame {
FirefoxDriver driver;
@Test
public void open() throws IOException{
	driver=new FirefoxDriver();
	driver.get("https://login.naukri.com/nLogin/Login.php");
	driver.manage().window().maximize();
	FileInputStream fis=new FileInputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\ramu.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fis);
	XSSFSheet wso=wbo.getSheet("Sheet1");
	Row r;
	int rowc=wso.getLastRowNum();
	for (int i = 1; i < rowc+1; i++) {
		r=wso.getRow(i);
	driver.findElement(By.xpath(".//*[@id='emailTxt']")).sendKeys(r.getCell(0).getStringCellValue());
	Cell c=r.getCell(1);
	DataFormatter dt=new DataFormatter();
	String password=dt.formatCellValue(c);
	driver.findElement(By.xpath(".//*[@id='pwd1']")).sendKeys(password);
	driver.findElement(By.xpath(".//*[@id='pwd1']//following::input[1]")).click();
	String Actual=driver.getCurrentUrl();
	r.createCell(3).setCellValue(Actual);
	String Expected=driver.getCurrentUrl();
	r.getCell(2).getStringCellValue(); 
	if (Expected.equals(Actual)) {  
	  r.createCell(4).setCellValue(true);
	}else {
	 r.createCell(4).setCellValue(false);
	}
	driver.navigate().back();
	Sleeper.sleepTightInSeconds(5);
}
	FileOutputStream fo=new FileOutputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\ramu.xlsx");
	wbo.write(fo);
}
}