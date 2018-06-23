
package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
FirefoxDriver driver;
@BeforeTest
public void open(){
	driver=new FirefoxDriver();
	driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void onlineshop() throws IOException{
	FileInputStream exo=new FileInputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\RK.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(exo);
	XSSFSheet wso=wbo.getSheet("Sheet1");
	Row r;
	int rowc=wso.getLastRowNum();
     for (int i = 1; i <=rowc; i++) {
		r=wso.getRow(i);
		FileInputStream fis=new FileInputStream("D:\\selenium\\Hybrid_Frame_Work\\pr.property");
		Properties pr=new Properties();
		pr.load(fis);
		//driver.findElement(By.linkText("LOGIN / REGISTER")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath(pr.getProperty("Email"))).sendKeys(r.getCell(0).getStringCellValue());
		 Cell c=r.getCell(1);
		 DataFormatter d=new DataFormatter();
        String password=d.formatCellValue(c);
         driver.findElement(By.xpath(pr.getProperty("Password"))).sendKeys("Password");
        driver.findElement(By.xpath(pr.getProperty("Login"))).click();
        String s1=driver.getCurrentUrl();
        String s2 ="https://www.infibeam.com/Login.action";
        if (s2.equals(s1)) {
			r.createCell(2).setCellValue(true);
		}else {
			r.createCell(2).setCellValue(false);
        driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
	FileOutputStream fo=new FileOutputStream("C:\\Users\\Ganesh Manchukonda\\Desktop\\RK.xlsx");
	wbo.write(fo); 
		}
     }
     }
} 

