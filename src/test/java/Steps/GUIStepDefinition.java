package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Util.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GUIStepDefinition extends Lib{

	WebDriver driver;

	@Before
	public void initialize() {
		String os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			System.out.println("Running on Mac System");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/mac/chromedriver");
		} else if (os.contains("windows")) {
			System.out.println("Running on Windows System");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Google Drive\\PIIT\\Selenium\\Java\\NewBDD\\chromedriver.exe");
		} else {
			System.out.println("Running on Linux");
		}

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Given("^i am at Facebook home page$")
	public void homePage() {
		System.out.println("Title: " + getTitle(driver));
	}
	
	@Then("^i am entering firstname \"([^\"]*)\" \"([^\"]*)\"$")
	public void enterFname(String e, String value) throws IOException {
		WebElement firstName = findElem(driver, readProperty(e));
		firstName.sendKeys(value);
	}
	

	@After
	public void teardown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}
}
