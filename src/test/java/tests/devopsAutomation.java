package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class devopsAutomation {
	public static WebDriver driver;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ksoum\\eclipse-workspace\\jenkins\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test1");
		driver.get("https://www.google.co.in/");
	}

}
