package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndGetNames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
		List<WebElement> dropdowns = driver.findElements(By.tagName("select"));
		System.out.println("No.of Dropdowns = "+dropdowns.size());
		for(int i=0;i<dropdowns.size();i++) {
			System.out.println(dropdowns.get(i).getAttribute("name"));
		}
		
		driver.close();
	}
}
