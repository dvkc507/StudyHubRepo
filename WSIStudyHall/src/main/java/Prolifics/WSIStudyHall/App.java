package Prolifics.WSIStudyHall;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:/Users/vdoppalapudi/Desktop/Chaitanya/FixRegression/WSIStudyHall/resources/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://google.com");
    	driver.manage().window().maximize();
    	WebElement search_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    	search_box.sendKeys("How are you google?");
    	search_box.sendKeys(Keys.ENTER);
    	WebElement AllFilterDropDown= driver.findElement(By.xpath("//div[contains(text(),'All filters')]"));
    	AllFilterDropDown.click();
    	//driver.close();
        System.out.println( "Hello World!" );
        // commit 1
        // commit 2
        // commit 3
        // commit 4
<<<<<<< HEAD
<<<<<<< HEAD
        // commit 6
=======
>>>>>>> parent of 96312b9... added commit 5 from eclipse
=======
>>>>>>> parent of 96312b9... added commit 5 from eclipse
    }
}
