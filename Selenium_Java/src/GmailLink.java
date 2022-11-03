import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(3000);
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		String expectedUrl = "https://mail.google.com/mail/u/0/?ogbl#inbox";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Gmail Login Successful");
		}
		else {
			System.out.println("Gmail Login Failed");
		}
		
		driver.close();

	}

}
