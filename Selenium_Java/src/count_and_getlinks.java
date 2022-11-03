import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_and_getlinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		List<WebElement> nlinks = driver.findElements(By.tagName("a"));
		System.out.println(nlinks.size());  //Count of Links
		
		Thread.sleep(3000);
		
		for(int i=0;i<nlinks.size();i++) {
			System.out.println(nlinks.get(i).getText());
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
