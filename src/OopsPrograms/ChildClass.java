package OopsPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass extends ParentClass{
	
	WebDriver driver;
	@Override
	public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
	}
}
