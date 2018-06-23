package pack1;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keydrivenframework {
    FirefoxDriver driver;
    @BeforeTest
    public void open(){
    driver=new FirefoxDriver();
    driver.get("https://www.timeanddate.com/worldclock/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test 
    public void timetable(){
    	WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]"));
    	List<WebElement>rowc=table.findElements(By.tagName("tr"));
    	for (int i = 1; i < rowc.size(); i++) {
			System.out.println("rowc"+" "+rowc.get(i).getText());
		List<WebElement>cc=rowc.get(i).findElements(By.tagName("td"));
		for (int j = 1; j < cc.size(); j++) {
			System.out.println("cc"+" "+cc.get(j).getText());
		}
		}
    	
    	          	
    }
}
