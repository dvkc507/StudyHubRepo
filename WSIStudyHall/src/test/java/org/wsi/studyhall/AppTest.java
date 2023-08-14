package org.wsi.studyhall;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest 
{
public WebDriver driver;	
@BeforeTest
public void Before( ) {
	System.out.println("Inside Before Test");Reporter.log("Inside Before Test");
}
@AfterTest
public void reportTest( ) {
	System.out.println("Inside After Test");Reporter.log("Inside After Test");
	driver.quit();Reporter.log("Browser quit done");
}
@BeforeMethod
public void BeforeM() {
	System.out.println("Before Method");Reporter.log("Before Method");
}
@AfterMethod
public void AfterM() {
	System.out.println("After Method");Reporter.log("After Method");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
	System.out.println("After Class");
}
    @Test(priority=1)
    public void shouldAnswerWithTrue()
    {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/vdoppalapudi/Desktop/Chaitanya/FixRegression/WSIStudyHall/resources/chromedriver.exe");
    	driver = new ChromeDriver();Reporter.log("After driver launch");
    	driver.get("https://google.com");Reporter.log("After opening google website url");
    	driver.manage().window().maximize();Reporter.log("After window Maximize");
    	WebElement search_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));Reporter.log("finding search_box element");
    	search_box.sendKeys("How are you google?");Reporter.log("Inserting text in the search engine");
    	search_box.sendKeys(Keys.ENTER);Reporter.log("Click on search engine after providing the search text");
    	WebElement AllFilterDropDown= driver.findElement(By.xpath("//div[contains(text(),'All filters')]"));Reporter.log("Finding  AllFilter drop down Webelement");
    	AllFilterDropDown.click();Reporter.log("After clicking AllFilterDropDown");
        assertTrue( true );
    }
    @Test(priority=2)
    public void SecondTest() {
    	System.out.println("Second Test");Reporter.log("Second Test");
    }
   //revert 2
    //Commit2
    //Commit3
}
