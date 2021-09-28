package com.zoodmall.pageObjects;




import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodmall.comman.BaseClass;


public class CategoryConfigPage {
	
	static WebDriver driver;
	
	String TestImage = System.getProperty("user.dir") + "\\configs\\TestImages\\TestImage.png";

	public CategoryConfigPage(WebDriver driver) throws InterruptedException {
		CategoryConfigPage.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[contains(@class, 'text') and text() = 'Category Config New']")
	private WebElement categoryconfig;
	
	
	
	@FindBy(xpath = "//span[text()= 'Add category attributes']")
	private WebElement addcategoryattr;
	
	@FindBy(xpath = "//input[@type= 'radio' and @class= 'isMainCategory_1']")
	private WebElement rootcategoryyes;
	
	@FindBy(xpath = "//*[@id= 'select2-popupCat-container' and text()= 'Select Category']")
	private WebElement selectcategdrpdwn;
	
	@FindBy(xpath = "//span[text()= 'TestAutomationRootCategory']")
	private WebElement selectrootcateg;
	
	@FindBy(xpath = "//span[text()= 'TestAutomationSubCategory']")
	private WebElement selectsubcateg;
	
	@FindBy(xpath = "//input[@class= 'select2-search__field' and @type= 'search']")
	private WebElement marketselect;
	
	@FindBy(xpath = "//*[@class='select2-results__option' and text()= 'UZ']")
	private WebElement marketselectUZ;
	
	@FindBy(xpath = "//*[@id='marketCodes']")
	private WebElement marketselectsearch;

	
	@FindBy(xpath = "//*[@id='name']/div/input")
	private WebElement categoryname;
	
	@FindBy(xpath = "//*[@id='cat_image']")
	private WebElement categoryimage;
	
	
	@FindBy(xpath = "//*[@type= 'button' and text()= 'Save']")
	private WebElement categorysave;
	
	@FindBy(xpath = "//*[@id='spanSelectedCountryValue']")
	private WebElement selectcategsearch;
	
	@FindBy(xpath = "//*[@class= 'selectCat' and text()= 'TestAutomationRootCategory']")
	private WebElement selectrootcatesearch;
	
	@FindBy(xpath = "//*[@class= 'selectCat' and text()= 'TestAutomationSubToSubCategory']")
	private WebElement selectsubtosubcatesearch;
	
	@FindBy(xpath = "//a[text()= 'TestAutomationSubCategory']")
	private WebElement selectsubcatesearch;
	
	@FindBy(xpath = "//*[@class= 'btn btn-primary' and text()= 'Search']")
	private WebElement searchcateg;
	
	@FindBy(xpath = "//*[@id='main']/div[1]/div/div/div[2]/table/tbody/tr/td[1]/a")
	private WebElement getcategname;
	
	
	@FindBy(xpath = "//*[@class= 'select2-search__field' and @type= 'search']")
	private WebElement selectmarksubcatg;
	
	@FindBy(xpath = "//*[@class= 'select2-results__option' and text()= 'UZ']")
	private WebElement selectmarksubcatguz;
	
	@FindBy(xpath = "//*[@id='main']/div[1]/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement getparentcategname;
	
	@FindBy(xpath = "//*[@id='main']/div[1]/div/div/div[2]/table/tbody/tr/td[2]/br")
	private WebElement getsubparentcategname;
	
	
	public void categoryconfigpage() throws IOException, InterruptedException {
		BaseClass.createalert("User Will Navigate to Category Config Tab",CategoryConfigPage.driver);
		BaseClass.waitForVisibility(categoryconfig, CategoryConfigPage.driver);
		categoryconfig.click();
	}
	
	
	public void verifycategoryconfigpage() throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		Assert.assertTrue("User Not able to Navigate Category Config Page",
				CategoryConfigPage.driver.getPageSource().contains("Categories"));
	}

public void createrootcategory() throws InterruptedException, IOException {
		
	BaseClass.createalert("User Will Create Root Category",CategoryConfigPage.driver);
		Thread.sleep(2000);
		addcategoryattr.click();
		Thread.sleep(2000);
		rootcategoryyes.click();
		Thread.sleep(3000);
		/*selectcategdrpdwn.click();
		Thread.sleep(2000);
		selectwomenscateg.click();
		Thread.sleep(2000);*/
		marketselect.click();
		Thread.sleep(2000);
		marketselectUZ.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(categoryname, CategoryConfigPage.driver);
		categoryname.sendKeys("TestAutomationRootCategory");
		Thread.sleep(2000);
		System.out.println("Image Page" + TestImage);
		categoryimage.sendKeys(TestImage);
		BaseClass.waitForVisibility(categorysave, CategoryConfigPage.driver);
		Thread.sleep(2000);
		categorysave.click();
		Thread.sleep(5000);
		BaseClass.createalert("Root Category Saved Successfully",CategoryConfigPage.driver);
	}

public void assignsubcategory() throws InterruptedException, IOException {
	BaseClass.createalert("Create Sub Category And Assign To Root",CategoryConfigPage.driver);
	Thread.sleep(2000);
	addcategoryattr.click();
	Thread.sleep(2000);
	selectcategdrpdwn.click();
	Thread.sleep(3000);
	selectrootcateg.click();
	Thread.sleep(2000);
	selectmarksubcatg.click();
	Thread.sleep(3000);
	selectmarksubcatguz.click();
	Thread.sleep(2000);
	categoryname.sendKeys("TestAutomationSubCategory");
	Thread.sleep(2000);
	categorysave.click();
	Thread.sleep(5000);
	BaseClass.createalert("Sub Category Saved Successfully",CategoryConfigPage.driver);
	
}

public void assignsubtosubcategory() throws InterruptedException, IOException {
	BaseClass.createalert("Create Sub To Sub Category And Assign To Root",CategoryConfigPage.driver);
	Thread.sleep(2000);
	addcategoryattr.click();
	Thread.sleep(2000);
	selectcategdrpdwn.click();
	Thread.sleep(3000);
	selectsubcateg.click();
	Thread.sleep(2000);
	selectmarksubcatg.click();
	Thread.sleep(3000);
	selectmarksubcatguz.click();
	Thread.sleep(2000);
	categoryname.sendKeys("TestAutomationSubToSubCategory");
	Thread.sleep(2000);
	categorysave.click();
	Thread.sleep(5000);
	BaseClass.createalert("Sub To Sub Category Saved Successfully",CategoryConfigPage.driver);
	
}

public void verifycreaterootcategory() throws InterruptedException, IOException {
	
	BaseClass.createalert("Validate Category Create Successfully",CategoryConfigPage.driver);
	Thread.sleep(2000);
	BaseClass.selectdropdown(CategoryConfigPage.driver,marketselectsearch,"Uzbekistan");
	Thread.sleep(2000);
	selectcategsearch.click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("scroll(0,800)");
	Thread.sleep(2000);
	selectrootcatesearch.click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("scroll(500,0)");
	Thread.sleep(2000);
	searchcateg.click();
	Thread.sleep(3000);
	Assert.assertEquals(getcategname.getText(), "TestAutomationRootCategory");
	BaseClass.createalert("Validate Done !! Category Create Successfully",CategoryConfigPage.driver);
	
}


public void verifysubrootcategory() throws InterruptedException, IOException {
	
	BaseClass.createalert("Validate Sub Category Assign To Root Correctly",CategoryConfigPage.driver);
	Thread.sleep(2000);
	BaseClass.selectdropdown(CategoryConfigPage.driver,marketselectsearch,"Uzbekistan");
	Thread.sleep(2000);
	selectcategsearch.click();
	Thread.sleep(2000);
	((JavascriptExecutor) CategoryConfigPage.driver).executeScript("scroll(0,800)");
	Thread.sleep(2000);
	BaseClass.movehover(CategoryConfigPage.driver,selectrootcatesearch);
	Thread.sleep(3000);
	selectsubcatesearch.click();
	Thread.sleep(2000);
	((JavascriptExecutor) CategoryConfigPage.driver).executeScript("scroll(500,0)");
	Thread.sleep(2000);
	searchcateg.click();
	Thread.sleep(3000);
	Assert.assertEquals(getcategname.getText(), "TestAutomationSubCategory");
	Assert.assertEquals(getparentcategname.getText(), "TestAutomationRootCategory");
	BaseClass.createalert("Validate Done !! Sub Category Assign To Parent Successfully",CategoryConfigPage.driver);
}

public void verifysubtosubrootcategory() throws InterruptedException, IOException {
	
	BaseClass.createalert("Validate Sub to Sub Category Assign To Parent Correctly",CategoryConfigPage.driver);
	Thread.sleep(2000);
	BaseClass.selectdropdown(CategoryConfigPage.driver,marketselectsearch,"Uzbekistan");
	Thread.sleep(2000);
	selectcategsearch.click();
	Thread.sleep(2000);
	((JavascriptExecutor) CategoryConfigPage.driver).executeScript("scroll(0,800)");
	Thread.sleep(2000);
	BaseClass.movehover(CategoryConfigPage.driver,selectrootcatesearch);
	Thread.sleep(3000);
	BaseClass.movehover(CategoryConfigPage.driver,selectsubcatesearch);
	Thread.sleep(2000);
	selectsubtosubcatesearch.click();
	Thread.sleep(2000);
	((JavascriptExecutor) CategoryConfigPage.driver).executeScript("scroll(500,0)");
	Thread.sleep(2000);
	searchcateg.click();
	Thread.sleep(3000);
	System.out.println("Parent Category " +getparentcategname.getText().trim());
	//System.out.println("Sub Category " +getsubparentcategname.getText());
	
	Assert.assertEquals(getcategname.getText(), "TestAutomationSubToSubCategory");
	
	/*Assert.assertEquals(getparentcategname.getText().trim(), "TestAutomationRootCategory >> TestAutomationSubCategory ");
	Assert.assertEquals(getsubparentcategname.getText(), "TestAutomationSubCategory");*/
	
	BaseClass.createalert("Validate Done !! Sub to Sub Category Assign Successfully",CategoryConfigPage.driver);
}
}
