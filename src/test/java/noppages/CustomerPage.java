package noppages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class CustomerPage extends BaseClass{

    WebDriver driver;
    
   
    	private static HSSFWorkbook workbook;
    	private static HSSFSheet sheet;
    	private static HSSFRow row;
    	private static HSSFCell cell;

    public CustomerPage(WebDriver rdriver) {

        this.driver = rdriver;
        PageFactory.initElements(rdriver, this);

    }
	
	
	
	
	@FindBy(xpath="(//li[@class='nav-item has-treeview']/a)[4]")
	WebElement customerIcon;
	
	@FindBy(how = How.XPATH, using="//a[@href='/Admin/Customer/List']")
	WebElement customerLink;
	
	@FindBy(xpath=" //h1[text()[normalize-space()='Customers']]")
	WebElement customerPageTitle;
	
	@FindBy(xpath=" //a[@href='/Admin/Customer/Create']")
	WebElement addNewBtn;
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="FirstName")
	WebElement FirstName;
	
	@FindBy(id="LastName")
	WebElement LastName;
	
	
	
	@FindBy(xpath="//div[@class='col-md-9']/div/div[@class='form-check']/label")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement dob;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement submit;
	
	
	@FindBy(id="customer_attribute_1")
	WebElement FiscalCode;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement confirmationMessage;
	
	
	public void goToCustomerPage() throws InterruptedException {
		Thread.sleep(3000);
		customerIcon.click();
		customerLink.click();
		
	}
	
	public void verifyCustomerPage() {
		
		Assert.assertTrue(customerPageTitle.getText().contains("Customer"));
		
	}
	public void clickAddNew() {
		addNewBtn.click();
	}
	public void verifyConfirmationMsg() {
		if (confirmationMessage.isDisplayed()) {
			
		} else {
			
		}
	}
	public void addCustomer(String firstname,String lastname) {
		String email = randomestring() + "@gmail.com";
		Email.sendKeys(email);
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		submit.click();
	}
	
	public void addNewCustomer() throws IOException, InterruptedException {
		
		
		excelUtils.setExcelFile(excelFilePath,"test");
		for(int i=1;i<=excelUtils.getRowCountInSheet();i++)	{
			addNewBtn.click();
			
			Thread.sleep(2000);
			Email.clear();
			String email = randomestring() + "@gmail.com";
			Email.sendKeys(email);
			FirstName.clear();
			FirstName.sendKeys(excelUtils.getCellData(i,0));
			LastName.clear();
			LastName.sendKeys(excelUtils.getCellData(i,1));
			Thread.sleep(2000);
			
			List<WebElement> li=driver.findElements(By.xpath("//div[@class='col-md-9']/div/div[@class='form-check']/label"));
			for(WebElement list:li) {
				if(list.getText().equalsIgnoreCase(excelUtils.getCellData(i,2))) {
					list.click();
				}
			}
			
		//	String gender=excelUtils.getCellData(i,2);
			
			
			//label[contains(text(),'Male')]
			
	//		FiscalCode.sendKeys(excelUtils.getCellData(i,3));
	//		Thread.sleep(2000);
			//dob.sendKeys(excelUtils.getCellData(i,3));
          
			submit.click();
			
		//	WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));

			//check if confirmation message is displayed
			if (confirmationMessage.isDisplayed()) {
			// if the message is displayed , write PASS in the excel sheet using the method of ExcelUtils
			excelUtils.setCellValue(i,6,"PASS",excelFilePath);
			} else {
			//if the message is not displayed , write FAIL in the excel sheet using the method of ExcelUtils
			excelUtils.setCellValue(i,6,"FAIL",excelFilePath);
			}
			
		}
	}
	
	
	public void setExcelFile(String excelFilePath,String sheetName) throws IOException {
		//Create an object of File class to open xls file
		File file = new File(excelFilePath);

		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		//creating workbook instance that refers to .xls file
		workbook=new HSSFWorkbook(inputStream);

		//creating a Sheet object
		sheet=workbook.getSheet(sheetName);



		}



		public String getCellData(int rowNumber,int cellNumber){
		//getting the cell value from rowNumber and cell Number
		cell =sheet.getRow(rowNumber).getCell(cellNumber);

		//returning the cell value as string
		return cell.getStringCellValue();
		}



		public int getRowCountInSheet(){
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		return rowcount;
		}



		public void setCellValue(int rowNum,int cellNum,String cellValue,String excelFilePath) throws IOException {
		//creating a new cell in row and setting value to it
		sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);

		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
		workbook.write(outputStream);
		}
	
	
	
	

}
