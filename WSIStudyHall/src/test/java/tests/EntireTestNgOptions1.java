package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EntireTestNgOptions1 {
	public WebDriver driver;

	@BeforeMethod(description = "Launching browser")
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/vdoppalapudi/Desktop/Chaitanya/FixRegression/WSIStudyHall/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com");
		driver.manage().window().maximize();
	}

	@Test
	public void searchingText_Google() {
		System.out.println("Title: " + driver.getTitle());
		//input[@id="gparent_1"]
	}

	@AfterMethod(description = "closing browser")
	public void tearDown() {
		driver.close();

	}

}
