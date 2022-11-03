package text;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNormalAndBoldText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		
		List<WebElement> texts=driver.findElements(By.tagName("p"));
		System.out.println("Nomal Text: "+texts.size());
		
		for(int i=0;i<texts.size();i++) {
			System.out.println(texts.get(i).getText());
		}
		
		List<WebElement> btexts=driver.findElements(By.tagName("b"));
		System.out.println("Bold Text: "+btexts.size());
		
		for(int i=0;i<btexts.size();i++) {
			System.out.println(btexts.get(i).getText());
		}
		
		driver.close();

	}

}
