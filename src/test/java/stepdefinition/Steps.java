package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	WebDriver driver;
	
	@Given("open application in chrome browser")
	public void open_application_in_chrome_browser() {
		
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    driver.manage().window().maximize();
		
	}

	@When("enter userName {string} and enter password {string}")
	public void enter_userName_and_enter_password(String email, String password) throws InterruptedException {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
	
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
	
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']//parent::div")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']//parent::div")).click();
		
	}

	@Then("verify user able to view Dashboard")
	public void verify_user_able_to_view_Dashboard() throws InterruptedException {
		Thread.sleep(2000);
       System.out.println(driver.getTitle());
	}

}
