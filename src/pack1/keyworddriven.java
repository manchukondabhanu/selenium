package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyworddriven {
FirefoxDriver driver;
public void launchbrowser(){
	driver=new FirefoxDriver();
}
public void navigate(){
	driver.get("https://www.infibeam.com/Login.action?redirectURL=https%3A%2F%2Fwww.infibeam.com%2F");
}
public void EnterEmail(){
	driver.findElement(By.xpath("Email")).sendKeys("bhanu.testing@gmail.com");
}
public void EnterPassword(){
	driver.findElement(By.xpath("Password")).sendKeys("9966897156");
}
public void clicklogin(){
	driver.findElement(By.xpath("Login")).click();
}
}
