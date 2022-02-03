package variousTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UseStaticMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/SeleniumTraining/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //FirefoxDriver, EdgeDriver
		String url = "https://awsdev1.envestnet.com/secure/app.jsp";
		driver.get(url);
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//div/input[@placeholder='User Name']")).sendKeys("testkutty");
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("testuser");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(1000);	
		getError(driver);
		driver.quit();
	}
	
	public static void getError(WebDriver driver){
		String error = driver.findElement(By.xpath("//*[contains(text(),'Please verify your username and password.')]")).getText();
		System.out.println(error);	
		Assert.assertEquals(error, "Please verify your username and password.");
		
	}
}
