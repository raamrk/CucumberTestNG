package stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import noppages.CustomerPage;
import noppages.LoginPage;
import utils.Constants;
import utils.ExcelUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerce extends BaseClass {
	WebDriver driver;
	LoginPage lp;
	CustomerPage cp;
	//protected static ExcelUtils excelUtils = new ExcelUtils();
	//protected static String excelFilePath = Constants.Path_TestData + Constants.File_TestData;

	@Given("Open application")
	public void open_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		lp = new LoginPage(driver);

	}

	@When("Enter userName {string} and Enter password {string}")
	public void enter_userName_and_Enter_password(String username, String password) {
		lp.enterUserName(username);
		lp.enterPassword(password);

	}

	@When("Click Login")
	public void click_Login() throws Exception {
		lp.clickLoginButton();

	}

	@Given("Navigate to customer page")
	public void navigate_to_customer_page() throws InterruptedException {
		cp = new CustomerPage(driver);
		cp.goToCustomerPage();

	}

	

	@When("Fill the customer details Firstname & Lastname and click on submit")
	public void fill_the_customer_details_and_click_on_submit() throws IOException, InterruptedException {
		cp.addNewCustomer();
	}

}
