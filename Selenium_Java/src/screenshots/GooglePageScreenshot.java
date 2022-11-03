package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GooglePageScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\STUDY\\JAVA\\Java Programs\\Selenium_Java\\src\\browser_drivers\\chromedriver105.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;  //upcasting
//		TakesScreenshot takes=(TakesScreenshot)driver;
		
		File ss=driver.getScreenshotAs(OutputType.FILE); //downcasting
		//copy this file and save in your desired location
		Files.copy(ss,new File("E:\\STUDY\\Software Testing"));
		
		driver.close();
	}

}
