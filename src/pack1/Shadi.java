package pack1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Shadi { 
	public static void main(String[] args) throws IOException {
     FirefoxDriver driver=new FirefoxDriver();
     driver.get("https://www.telugumatrimony.com/");
//    Select sc=new Select(driver.findElement(By.xpath(".//*[@id='REGISTERED_BY']")));
//   sc.selectByVisibleText("Myself");
//   sc.selectByIndex(2);
//   sc.selectByValue("value");
//   //sc.selectByValue("Select Matrimony Profile for");
    Sleeper.sleepTightInSeconds(5);
	driver.findElement(By.xpath(".//*[@id='REGISTERED_BY']")).click();
	
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("C:\\Users\\Ganesh Manchukonda\\Desktop\\anil.jpg"));
	 
	}

}
