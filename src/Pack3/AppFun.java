package Pack3;
import static Pack3.Constants.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppFun {
 static FirefoxDriver driver;
 static FileInputStream fis;
 static Properties pr;
 public static String loadPropeties(String ppath) throws IOException{
		fis=new FileInputStream(ppath);
		pr=new Properties();
		pr.load(fis);
		return null;
 }
 public String openBrowser(String testobject,String testdata)
	{
		try {
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} catch (Exception e) {
       e.printStackTrace();
		return fail;
		}
		return pass;
          
}
 public String openUrl(String testobject,String testdata){
		try {
			driver.get(pr.getProperty(testdata));
		} catch (Exception e) {
			e.printStackTrace();
		  return fail;
		}
		return pass;
 }
 public String click(String testobject,String testdata){
		try {
		driver.findElement(By.xpath(pr.getProperty(testobject))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
		 e.printStackTrace();
		 return fail;
		}
		return pass;
 }
 public String inputData(String testobject,String testdata){
		try {
			WebElement el=driver.findElement(By.xpath(pr.getProperty(testobject)));
			el.clear();
			el.sendKeys(pr.getProperty(testdata));
		} catch (Exception e) {
			e.printStackTrace();
			return fail;
		}
		return pass;
}
}