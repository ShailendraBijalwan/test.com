package dealDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Entry {

	@Test
	public void testEntry(){
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
}
