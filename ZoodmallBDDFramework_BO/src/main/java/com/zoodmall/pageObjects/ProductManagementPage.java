package com.zoodmall.pageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.jsoup.Connection.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodmall.comman.BaseClass;;

public class ProductManagementPage {
	static WebDriver driver;
	public static Properties properties;
	boolean colunvaluematch = false;

	public ProductManagementPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@FindBy(xpath = "//*[@id='child_menu_142']/span[contains(@class, 'text') and text() = 'Products management']")
	private WebElement productmanagment;

	@FindBy(xpath = "//*[@id='productList']")
	private WebElement productlisttable;

	@FindBy(xpath = "//*[@id='productList']/tbody/tr")
	private List<WebElement> productrowslisttable;

	@FindBy(xpath = "//*[@id='productList']/tbody/tr/td[8]")
	private List<WebElement> productcolumnslisttable;

	@FindBy(xpath = "//input[@name='sellerIdIn']")
	private WebElement sellerid;

	@FindBy(xpath = "//*[@type= 'submit']")
	private WebElement submit;

	@FindBy(xpath = "//input[@type= 'checkbox' and @value= 'all']")
	private WebElement checkall;

	@FindBy(xpath = "//*[@id='categoryId_0']")
	private WebElement assignrootcategory;
	
	@FindBy(xpath = "//*[@id='subCate_0']")
	private WebElement assignsublevelcategory;
	
	@FindBy(xpath = "//*[@id='subtoCate_0']")
	private WebElement assignsubtosublevelcategory;
	
	

	@FindBy(xpath = "//*[contains(@title, 'Add Category')]")
	private WebElement savecategory;

	public void productmanagementpage() throws IOException, InterruptedException {
		BaseClass.createalert("User Will Navigate to Product Management Tab", ProductManagementPage.driver);
		BaseClass.waitForVisibility(productmanagment, ProductManagementPage.driver);
		productmanagment.click();
	}

	public void verifyproductmanagmentpage() throws InterruptedException, IOException {

		Thread.sleep(5000);
		BaseClass.waitForVisibility(productlisttable, ProductManagementPage.driver);

	}

	public void assigncategorytoproduct() throws InterruptedException, IOException {

		BaseClass.createalert("User Will Assign Bulk Root Category to Products", ProductManagementPage.driver);
		Thread.sleep(2000);
		sellerid.sendKeys("1381");
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(2000);
		checkall.click();
		BaseClass.selectdropdown(ProductManagementPage.driver, assignrootcategory, "TestAutomationRootCategory");
		Thread.sleep(2000);
		savecategory.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		BaseClass.createalert("Root Category Assign Successfully", ProductManagementPage.driver);
	}

	public void assignsublevelcategorytoproduct() throws InterruptedException, IOException {

		BaseClass.createalert("User Will Assign Bulk Sub Level Category to Products", ProductManagementPage.driver);
		Thread.sleep(2000);
		sellerid.sendKeys("1381");
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(2000);
		checkall.click();
		BaseClass.selectdropdown(ProductManagementPage.driver, assignrootcategory, "TestAutomationRootCategory");
		Thread.sleep(2000);
		BaseClass.selectdropdown(ProductManagementPage.driver, assignsublevelcategory, "TestAutomationSubCategory");
		Thread.sleep(2000);
		savecategory.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		BaseClass.createalert("Sub Level Category Assign To All Products Successfully", ProductManagementPage.driver);
	}
	
	
	
	public void assignsubtosublevelcategorytoproduct() throws InterruptedException, IOException {

		BaseClass.createalert("User Will Assign Bulk Sub To Sub Level Category to Products", ProductManagementPage.driver);
		Thread.sleep(2000);
		sellerid.sendKeys("1381");
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(2000);
		checkall.click();
		BaseClass.selectdropdown(ProductManagementPage.driver, assignrootcategory, "TestAutomationRootCategory");
		Thread.sleep(2000);
		BaseClass.selectdropdown(ProductManagementPage.driver, assignsublevelcategory, "TestAutomationSubCategory");
		Thread.sleep(2000);
		BaseClass.selectdropdown(ProductManagementPage.driver, assignsubtosublevelcategory, "TestAutomationSubToSubCategory");
		Thread.sleep(2000);
		savecategory.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		BaseClass.createalert("Sub To Sub Level Category Assign To All Products Successfully", ProductManagementPage.driver);
	}
	
	public void verifyassigncategory() throws InterruptedException, IOException {

		Thread.sleep(2000);
		BaseClass.createalert("Script Will Validate Category Assign To All Products Successfully",
				ProductManagementPage.driver);

		BaseClass.gettablecols(productcolumnslisttable,"TestAutomationRootCategory");
		
		Thread.sleep(2000);
	}
	
	public void verifysublevelassigncategory() throws InterruptedException, IOException {

		Thread.sleep(2000);
		BaseClass.createalert("Script Will Validate Category Assign To All Products Successfully",
				ProductManagementPage.driver);

		BaseClass.gettablecols(productcolumnslisttable,"TestAutomationRootCategory->\nTestAutomationSubCategory");
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		BaseClass.createalert("Validation Successful !! Category assign to all Products Successfully",
				ProductManagementPage.driver);
		Thread.sleep(2000);
	}
	
	public void verifysubtosublevelassigncategory() throws InterruptedException, IOException {

		Thread.sleep(2000);
		BaseClass.createalert("Script Will Validate Category Assign To All Products Successfully",
				ProductManagementPage.driver);

		BaseClass.gettablecols(productcolumnslisttable,"TestAutomationRootCategory->\nTestAutomationSubCategory->TestAutomationSubToSubCategory");
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		List<WebElement> cols = productcolumnslisttable;
		
		BaseClass.createalert("Validation Successful !! Category assign to all => "   +cols.size()+  " <== Products Successfully",
				ProductManagementPage.driver);
		Thread.sleep(2000);
	}
}
