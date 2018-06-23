package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfrw {
FirefoxDriver driver;
@BeforeTest
public void open(){
	driver =new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   // driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/a")).click();
}
@Test
public void login() throws IOException{
	FileInputStream exo=new FileInputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\saple.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(exo);
	XSSFSheet wso=wbo.getSheet("Sheet1");
	Row r;
	int rowc=wso.getLastRowNum();
	for (int i = 1; i < rowc+1; i++) {
		r=wso.getRow(i);
	//driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(r.getCell(0).getStringCellValue());
	driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(r.getCell(1).getStringCellValue());
	driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
	String s1=driver.getCurrentUrl();
	String s2="http://opensource.demo.orangehrmlive.com/index.php/dashboard";
	//System.out.println("if browser");
	if (s2.equals(s1)) {
		r.createCell(2).setCellValue(true);
	}else {
		r.createCell(2).setCellValue(false);
	}
	Sleeper.sleepTightInSeconds(3);;
	driver.navigate().back();
	}
	FileOutputStream fo=new FileOutputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\saple.xlsx");
	wbo.write(fo);
}
}
