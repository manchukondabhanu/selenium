package com_package;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopup {
    
	public static void main(String args[]){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Click Here")).click();
		String mainpage=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			String childpage=it.next();
			if (!mainpage.equalsIgnoreCase(childpage)){
			//String childpage=driver.getWindowHandle();
			driver.switchTo().window(childpage);

			driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
			driver.findElement(By.name("btnLogin")).click();
			//driver.findElement(By.linkText("Click Here")).click();
			
		   // driver.close();
			}
			driver.switchTo().window(mainpage);
			driver.quit();
		}	
	}
}
