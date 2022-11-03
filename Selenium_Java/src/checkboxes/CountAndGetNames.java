package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndGetNames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		Thread.sleep(3000);
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The No.of checkboxes are "+checkboxes.size());
		for(int i=0;i<checkboxes.size();i++) {
			System.out.println(checkboxes.get(i).getAttribute("value"));
		}
		
		driver.close();
	}

}
