package com_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Stream {
     WebDriver driver;
     public Stream(WebDriver driver){
    	 this.driver=driver;
     }
     @FindBy(id="email")
     WebElement username;
     @FindBy(how=How.NAME,using="pass")
     WebElement password;
     @FindBy(how=How.XPATH,using=".//*[@id='u_0_2']")
     WebElement submit;
    
     public void testcase(String uname,String passwrd){
    	username.sendKeys(uname);
    	password.sendKeys(passwrd);
    	submit.click();
    }
     
}

