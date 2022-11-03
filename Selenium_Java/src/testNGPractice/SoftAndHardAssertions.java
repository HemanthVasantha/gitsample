package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertions {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("SeleniumAssert",Keys.ENTER);
		Thread.sleep(3000);
		SoftAssert softAssert=new SoftAssert();
		
		//Title Assertion
		String actualTitle=driver.getTitle();
		String expectedTitle="Log in to Facebook";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
//		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//URL Assertion
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook/";
				
		softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");
				
		//Border Assertion
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
				
		softAssert.assertEquals(actualBorder, expectedBorder, "Border is mismatched");
		
//		verify element is present
//		Error msg assertion
		String actualErrMsg=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrMsg="The email address you entered isn't connected to an account. Find your account and log in.";
				
		softAssert.assertEquals(actualErrMsg, expectedErrMsg, "Error message is mismatched");
		
		driver.close();
		softAssert.assertAll();
	}
}
