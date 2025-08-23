package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void testMethod () {
		System.out.println ("This is a test method.");
		WebDriver driver;
		driver = new ChromeDriver ();
		driver.quit ();
		
	}
}
