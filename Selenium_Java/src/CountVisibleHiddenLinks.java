import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountVisibleHiddenLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=0;
		for(int i=0;i<links.size();i++) {
			if(links.get(i).isDisplayed()) {
				count++;
			}
		}
		
		Thread.sleep(3000);
		
		System.out.println("Total links are "+links.size());
		System.out.println("Visible links "+count);
		System.out.println("Hidden Links "+(links.size()-count));

//		Counting links in header part
		WebElement header=driver.findElement(By.id("gb"));
		List<WebElement> hlinks = header.findElements(By.tagName("a"));
		System.out.println("No.of links in header: "+hlinks.size());
		for(int i=0;i<hlinks.size();i++) {
			System.out.println(hlinks.get(i).getText());
		}
		
		Thread.sleep(3000);
		
//		Counting links in footer part
		WebElement footer=driver.findElement(By.className("KxwPGc SSwjIe"));
		List<WebElement> flinks = footer.findElements(By.tagName("a"));
		System.out.println("No.of links in footer: "+flinks.size());
		for(int j=0;j<flinks.size();j++) {
			System.out.println(flinks.get(j).getText());
		}
		
		driver.close();
	}

}
