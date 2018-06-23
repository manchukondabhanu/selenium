package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Page {

	public static void main(String[] args) throws InterruptedException {

          FirefoxDriver driver=new FirefoxDriver();
          driver.get("http://jqueryui.com/resizable/");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          Actions act=new Actions(driver);
          driver.switchTo().frame(0);
          WebElement releas =driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));  
           
            act.clickAndHold(releas).moveByOffset(120, 80).release(releas).build().perform();
                  
//          driver.findElement(By.linkText("Slider")).click();
//        Actions act=new Actions(driver);
//        driver.switchTo().frame(0);
//        WebElement ele=driver.findElement(By.xpath(".//*[@id='slider']/span"));
//        int y=ele.getLocation().y;
//           act.dragAndDropBy(ele, 80, y).build().perform();
//          Actions act=new Actions(driver);
//          driver.switchTo().frame(0);
//          WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
        //  WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
              
         // act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
      
//   Thread.sleep(4000);
         // act.dragAndDrop(drag, drop).build().perform();
//          
          
	}

}
