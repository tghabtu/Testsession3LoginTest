package variousConsept;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
WebDriver driver;
	
	@Before

	public void init() {

		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void longintest() {
		
		//storing web element 
		//type name =valu;
		
		//WebElement type Element List 
		WebElement USER_NAME_ELEMENT= driver.findElement(By.xpath("//*[@id=\"username\"]"));
		WebElement PASSWORD_ELEMENT= driver.findElement(By.xpath("//*[@id= \"password\"]"));
		WebElement SIGNIN_BUTTON_ELEMENT= driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button"));
				
		
		//By type Element List
		By USER_NAME_FIELD = By.xpath("//*[@id=\"username\"]");
		By PASSWORD_FIELD =By.xpath("//*[@id=\"username\"]");
		By SIGNIN_BUTTON_FIELD=By.xpath("/html/body/div/div/div/form/div[3]/button");
		
	
		//driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("demo@techfios.com");
		//driver.findElement(USER_NAME_FIELD).sendKeys("demo@techfios.com");
		
		USER_NAME_ELEMENT.clear();
		USER_NAME_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_ELEMENT.sendKeys("abc123");
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
		
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}
