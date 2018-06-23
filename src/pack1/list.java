package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class list {
	FirefoxDriver driver;
	@BeforeTest
	public void open(){
	driver=new FirefoxDriver();
	driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void values(){
	driver.findElement(By.xpath(".//*[@id='userHandle']")).sendKeys("bhanu.testing@gmail.com");
	driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("9966897156");
	driver.findElement(By.xpath(".//*[@id='loginForm']/div[6]/div/button")).click();
	Sleeper.sleepTightInSeconds(5);
	WebElement MyAccount=driver.findElement(By.xpath(".//*[@id='account']/a"));
	Actions act=new Actions(driver);
	act.moveToElement(MyAccount).build().perform();
	//WebElement myaccount=driver.findElement(By.xpath(".//*[@id='account']/ul/li[1]/a"));
    List<WebElement>values=MyAccount.findElements(By.tagName("option"));
    for (int i = 0; i < values.size(); i++) {
		System.out.println("no of values on my account"+" "+values.get(i).getText());
	}
	
//	driver.findElement(By.xpath(".//*[@id='suggest']")).sendKeys("mobile moto e3");
//	driver.findElement(By.xpath(".//*[@id='search-icon']")).click();
//	
	//	List<WebElement>links=driver.findElements(By.tagName("a"));
//	for (int i = 0; i < links.size(); i++) {
//		System.out.println(links.get(i).getText());
//	}
}
}
