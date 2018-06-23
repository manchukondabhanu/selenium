package com_package;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Single_popup {

	public static void main(String[] args) {
         FirefoxDriver driver=new FirefoxDriver();
         driver.get("http://popuptest.com/goodpopups.html");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.linkText("Good PopUp #1")).click();
         
        // driver.findElement(By.xpath(".//*[@type='submit']")).click();
//         Alert at=driver.switchTo().alert();
//         String mainpage=driver.switchTo().alert().getText();
//         System.out.println(mainpage);
//         at.accept(); 
           Set<String> st=driver.getWindowHandles();
           Iterator<String> it=st.iterator();
           
           String parentpage=it.next();
           
           System.out.println("parentpage:"+parentpage);

           
           String  childpage=it.next();
           System.out.println("childpage:"+childpage);

           driver.switchTo().window(childpage);
           System.out.println("childpage:"+driver.getTitle());
           driver.close();
           
           driver.switchTo().window(parentpage);
           System.out.println("parentpage:"+driver.getTitle());
          
         
	}

}
