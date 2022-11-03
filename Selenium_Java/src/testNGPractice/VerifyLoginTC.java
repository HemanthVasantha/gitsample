package testNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginTC {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li[1]")).click();
		driver.findElement(By.linkText("User Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sign_user_email")).sendKeys("karimun@yopmail.com");
		driver.findElement(By.id("sign_user_password")).sendKeys("karimun@786");
		driver.findElement(By.xpath("//form[@class='form-signin']/child::button[text()='Log in']")).click();
		Thread.sleep(3000);
	}
	
	@Test
	public void loginStatus() {
		String expected="Welcome, Karimunnisa";
		String actual=driver.findElement(By.linkText("Welcome, Karimunnisa")).getText();
		System.out.println(actual);
		if(expected.contains(actual)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Unsuccessful");
		}
	}
	
	@Test
	public void logout() throws InterruptedException {
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right margin-right-logo']/descendant::a[text()=' Log Out']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
