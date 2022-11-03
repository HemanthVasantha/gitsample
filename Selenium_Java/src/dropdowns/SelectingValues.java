package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingValues {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		
		driver.findElement(By.id("themes")).sendKeys("Family");
		Thread.sleep(3000);
		
		WebElement dropdown=driver.findElement(By.id("themes"));
		Select st=new Select(dropdown);
		
		st.selectByIndex(5);
		Thread.sleep(3000);
		
		st.selectByVisibleText("Nature");
		Thread.sleep(3000);
		
		st.selectByValue("14");
		Thread.sleep(3000);
		
		driver.close();
	}

}
