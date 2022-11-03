package images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_no_of_images {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> nimages=driver.findElements(By.tagName("img"));
		System.out.println("No.of Images= "+nimages.size());
		for(int i=0;i<nimages.size();i++) {
			System.out.println(nimages.get(i).getAttribute("src"));
		}
		driver.close();
	}

}
