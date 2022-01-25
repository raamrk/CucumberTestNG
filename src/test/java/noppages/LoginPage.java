package noppages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
	

    WebDriver driver;

    public LoginPage(WebDriver rdriver) {

        this.driver = rdriver;
        PageFactory.initElements(rdriver, this);

    }


    @FindBy(id = "Email")
    WebElement txtEmail;
    
    
    //Migrating from tool to another tool
//  @IdentifyBy(id = "Email")
//  IWebElement txt_Email;

    // Method3
    @FindBy(how = How.NAME, using = "Password")
    WebElement txtPass;

    // Ruto- utility

    @FindBy(how = How.TAG_NAME, using = "button")
    private WebElement btnLogIn;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    WebElement btnLogout;

    @FindBy(xpath = "//h2[text()='Defaults for admin area']")
    WebElement lblDashBoard;

    public void enterUserName(String email) {

        txtEmail.clear();
        txtEmail.sendKeys(email);

    }

    public void enterPassword(String pwd) {

        txtPass.clear();
        txtPass.sendKeys(pwd);

    }

    public void clickLoginButton() throws Exception {

        btnLogIn.click();
        Thread.sleep(2000);

    }

    public String getAppTitle() {

        return driver.getTitle();
    }

    public boolean verifyAppLogo() {

        return lblDashBoard.isDisplayed();
    }

    public void clickLogout() {

        btnLogout.click();

    }
	
	
	
	

}
