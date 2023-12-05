package sesame.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	
	ChromeDriver chromeDriver;
	
	@Given("Open the Chrome and launch the application")
	public void Open_the_Chrome_and_launch_the_application() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elhab\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
	}
	
	@When("Enter the Username {string} and Password {string}")
	public void Enter_the_Username_and_Password(String username, String password) throws Throwable
	{
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}
	@Then("Reset the credential")
	public void Reset_the_credential() throws Throwable
	{
		driver.findElement(By.name("btnReset")).click();
	}
	@After
	public void quitter() {
		driver.close();
	}
}
