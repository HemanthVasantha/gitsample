package radio_buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_and_getnames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
//		we need to click flights option
		driver.findElement(By.linkText("Flights")).click();
		
		List<WebElement> nradios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No.of radio buttons are: "+nradios.size());
		
		for(int i=0;i<nradios.size();i++) {
			System.out.println(nradios.get(i).getAttribute("name"));
		}

	}

}
