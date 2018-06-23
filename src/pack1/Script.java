package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Script {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
	  driver.get("https://accounts.google.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
      driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("manchukonda45@gmail.com");
      Sleeper.sleepTightInSeconds(3);
      driver.findElement(By.id("identifierNext")).click();
      Sleeper.sleepTightInSeconds(5);
      driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("speed6767");
      Sleeper.sleepTightInSeconds(3);
      driver.findElement(By.id("passwordNext")).click();
	}

}
