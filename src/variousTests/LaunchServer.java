package variousTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LaunchServer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Selenium cannot invoke browser directly. It finds the driver.exe by looking at the  value of key webdriver.chrome.driver or gecko or edge
		System.setProperty("webdriver.chrome.driver","C:/SeleniumTraining/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //FirefoxDriver, EdgeDriver
		//WebDriver is an interface which provides Set of Browser Automation methods with empty bodies (Abstract methods)  
		//Classes like ChromeDriver, FirefoxDriveretc implement the WebDriver Interface and provide their own implementation to the WebDriver methods
		//We need to create the object 'driver' for class ChromeDriver to access the methods present in the class
		String url = "https://awsdev1.envestnet.com/secure/app.jsp";
		driver.get(url);
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//div/input[@placeholder='User Name']")).sendKeys("*testkutty");
		driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("testuser");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(1000);
		String error = driver.findElement(By.xpath("//*[contains(text(),'Please verify your username and password.')]")).getText();
		System.out.println(error);	
		Assert.assertEquals(error, "Please verify your username and password.");
		driver.quit(); //close only closes current while quit closes all associated windows
	}

}
