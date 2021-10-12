package AutomationFirstTest;

import static org.junit.Assert.*;

import javax.swing.text.Document;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondExampleLoginFacebook {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void LoginFailedTest() throws InterruptedException {
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		WebElement btn = driver.findElement(By.name("login"));
		email.sendKeys("hsadbahsdb");
		password.sendKeys("hsadbahsdb");
		btn.submit();
		
		
		Thread.sleep(8000);
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	

}
