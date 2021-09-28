package com.zoodmall.pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodmall.comman.BaseClass;

public class PromoCodePage {
	static WebDriver driver;

	Date currentDate = new Date();
	String uniquevariable = new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH).format(currentDate);
	static long number = (long) Math.floor(Math.random() * 9_000_000L) + 1_000_000L;
	String PromoName = "TESTAUTOMATION" + uniquevariable;
	String promofromdate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(currentDate);
	String importExcelCustomerIdfilePath = System.getProperty("user.dir")
			+ "\\configs\\TestDataExcel\\promo-code-customer.xlsx";
	String importExcelProductIdfilePath = System.getProperty("user.dir")
			+ "\\configs\\TestDataExcel\\promo-code-product.xlsx";

	public PromoCodePage(WebDriver driver) throws InterruptedException {
		PromoCodePage.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(@class, 'text') and text() = 'Promo Codes']")
	private WebElement promocodetab;

	@FindBy(xpath = "//span[contains(@class, 'text') and text() = 'Management']")
	private WebElement promocodemanagmenttab;

	@FindBy(xpath = "//*[text()='New Promo Code']")
	private WebElement newpromocode;

	@FindBy(xpath = "//input[@id='code' and @placeholder='Enter promo code string']")
	private WebElement promoname;

	@FindBy(xpath = "//*[@id='market-code']")
	private WebElement promomarket;

	@FindBy(xpath = "//*[@name='type' and @id='type']")
	private WebElement promotype;

	@FindBy(xpath = "//*[@name='source' and @id='source']")
	private WebElement promosource;

	@FindBy(xpath = "//*[@id='single-select' and @placeholder='_PROMOCODE_MESSAGE']")
	private WebElement promomessage;

	@FindBy(xpath = "//*[@id='single-select' and @placeholder='_PROMOCODE_TITLE']")
	private WebElement promotitle;

	@FindBy(xpath = "//*[@id='single-select' and @placeholder='_PROMOCODE_INFO_TEXT']")
	private WebElement promoinfotext;

	@FindBy(xpath = "//*[@id='global-usage' and @placeholder='Enter global usage times']")
	private WebElement promoglobalusage;

	@FindBy(xpath = "//*[@id='global-usage' and @placeholder='Usage Limit Per User']")
	private WebElement promousagelimit;

	@FindBy(xpath = "//input[@type='radio' and @value='P']")
	private WebElement promopercentradio;
	
	@FindBy(xpath = "//input[@type='radio' and @value='F']")
	private WebElement promofixedamountradio;

	@FindBy(xpath = "//input[@id='discount-amount']")
	private WebElement promodiscountpercent;
	

	@FindBy(xpath = "//input[@id='min-order-amount']")
	private WebElement promominorder;

	@FindBy(xpath = "//input[@id='max-amount']")
	private WebElement promomaxamount;

	@FindBy(xpath = "(//div[@class='input-group'])[3]//input[@type='text' and @class='form-control']")
	private WebElement promovalidfrom;

	@FindBy(xpath = "(//div[@class='input-group'])[4]//input[@type='text' and @class='form-control']")
	private WebElement promovalidto;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement promosave;

	@FindBy(xpath = "(//table[@role='grid'])[7]//td//span")
	private List<WebElement> promofromdatetable;

	@FindBy(xpath = "(//table[@role='grid'])[10]//td//span")
	private List<WebElement> promotodatetable;

	@FindBy(xpath = "(//button[@type='button' and @class='dropdown-toggle btn btn-default'])[3]")
	private WebElement promofromdatepicker;

	@FindBy(xpath = "(//button[@type='button' and @class='dropdown-toggle btn btn-default'])[4]")
	private WebElement promotodatepicker;

	@FindBy(xpath = "//*[@id='code']")
	private WebElement promocodesearch;

	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-primary submit-btn submit-filter']")
	private WebElement searchbtn;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[1]//span")
	private WebElement promoid;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[2]//span")
	private WebElement promocodename;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[3]//span")
	private WebElement promocodemarket;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[4]//span")
	private WebElement promocodetype;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[5]//span")
	private WebElement promocodesource;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[6]//span//p")
	private WebElement promocodesatus;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[7]//span")
	private WebElement promocodemaxdiscount;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[8]//span")
	private WebElement promocodeglobalusaglimit;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[9]//span")
	private WebElement promocodeuserusagelimit;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[10]//span")
	private WebElement promocodevalidfromdate;

	@FindBy(xpath = "//table[@class='table table-striped list-body mt0 mb0']//tbody//tr//td[11]//span")
	private WebElement promocodvalidtodate;

	@FindBy(xpath = "(//*[@id='file'])[2]")
	private WebElement promocodcustomerid;

	@FindBy(xpath = "(//*[@id='file'])[1]")
	private WebElement promocodproductid;

	@FindBy(xpath = "//a[text()='Customer ID']")
	private WebElement promocodcustomeridtab;

	@FindBy(xpath = "//a[text()='General']")
	private WebElement promocodgenraltab;

	@FindBy(xpath = "//a[text()='Product ID']")
	private WebElement promocodproductidtab;

	@FindBy(xpath = "//a[text()='Product Filter']")
	private WebElement promocodproductfiltertab;

	@FindBy(xpath = "(//table[@class='table table-bordered']//tbody/tr/td)[1]")
	private WebElement getpromocodcustomerid;

	@FindBy(xpath = "//button[@class='btn btn-primary' and text()='Upload ']")
	private WebElement promocodproductidupload;

	@FindBy(xpath = "//table[@class='table table-bordered']//tr")
	private List<WebElement> promocodproductidrows;

	@FindBy(xpath = "//*[@id='productId']")
	private WebElement promocodaddproductid;

	@FindBy(xpath = "//button[@class='btn btn-primary' and text()='Add Product']")
	private WebElement promocodaddproducbtn;

	@FindBy(xpath = "//*[@id='seller_type']")
	private WebElement sellertypdropdown;

	@FindBy(xpath = "//*[@id='section_id']")
	private WebElement sectiontypedropdown;

	@FindBy(xpath = "(//select[@class='form-control'])[10]")
	private WebElement sectionconditiondropdown;

	@FindBy(xpath = "(//select[@class='form-control'])[11]")
	private WebElement sectionoperatordropdown;

	@FindBy(xpath = "//div[@class='form-group col-sm-3']//input[@type='number']")
	private WebElement pricerange;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement savefilter;

	@FindBy(xpath = "//button[text()='Add filter']")
	private WebElement addfilter;

	@FindBy(xpath = "//*[@id='seller_ids']")
	private WebElement selleridfilter;

	@FindBy(xpath = "//*[@id='exclude_seller']")
	private WebElement selleridexcludefilter;

	@FindBy(xpath = "//*[@id='min_rank']")
	private WebElement minrankfilter;

	@FindBy(xpath = "//*[@id='is_brand_zone']")
	private WebElement brandzonefilter;

	@FindBy(xpath = "//*[@id='brand_name']")
	private WebElement brandnamefilter;

	@FindBy(xpath = "//*[@id='hot_keywords']")
	private WebElement hotkeywordsfilter;
	
	@FindBy(xpath = "//*[@id='category_ids']")
	private WebElement categoryidfilter;
	
	@FindBy(xpath = "(//input[@placeholder='Type to search...'])[1]")
	private WebElement subcategorylevelfilter;
	
	@FindBy(xpath = "(//input[@placeholder='Type to search...'])[2]")
	private WebElement subtosubcategorylevelfilter;
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Women’s Clothing')]")
	private WebElement womencategoryidfilter;
	
	@FindBy(xpath = "//span[contains(text(),'Women’s Clothing >> Women Tops')]")
	private WebElement womensubcategoryfilter;
	
	
	@FindBy(xpath = "//span[contains(text(),'Women Tops >> Shirt')]")
	private WebElement womensubtosubcategoryfilter;
	
	@FindBy(xpath = "//span[contains(text(),'COD-UZ')]")
	private WebElement supportpaymethodcod;
	
	@FindBy(xpath = "//label//span[contains(text(),'Payme')]")
	private WebElement supportpaymethodpayme;
	
	@FindBy(xpath = "//div[@role='alert']//span")
	private WebElement valitemarketmessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[1]")
	private WebElement valitecodefiledmessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[2]")
	private WebElement valiteglobalusagemessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[3]")
	private WebElement valiteuserlimitmessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[4]")
	private WebElement valitemaxdismessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[5]")
	private WebElement valitetypefieldmessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[6]")
	private WebElement valitepromosourcefieldmessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[7]")
	private WebElement valitefromdatemessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[8]")
	private WebElement valitediscountpermessage;
	
	@FindBy(xpath = "(//div[@role='alert']//span//br)[9]")
	private WebElement valitediscounttypemessage;
	
	@FindBy(xpath = "//*[@type='button' and @class='btn btn-primary dropdown-toggle']")
	private WebElement promosetting;
	
	@FindBy(xpath = "//a[text()='Remove']")
	private WebElement promoremove;
	
	@FindBy(xpath = "//button[@type='button' and text()='OK']")
	private WebElement promoremoveok;
	
	
	
	
	public void verifyallvalidationonpromo() throws InterruptedException, IOException {

		BaseClass.createalert("User Verify all validation Message ", PromoCodePage.driver);
		Thread.sleep(2000);
		newpromocode.click();
		Thread.sleep(2000);
		promosave.click();
		Thread.sleep(2000);
		System.out.println( valitemarketmessage.getText().substring(0,30).trim());
		System.out.println( valitemarketmessage.getText().substring(30,58).trim());
		System.out.println( valitemarketmessage.getText().substring(58,99).trim());
		System.out.println( valitemarketmessage.getText().substring(99,143).trim());
		System.out.println( valitemarketmessage.getText().substring(143,185).trim());
		System.out.println( valitemarketmessage.getText().substring(185,213).trim());
		System.out.println( valitemarketmessage.getText().substring(213,253).trim());
		System.out.println( valitemarketmessage.getText().substring(253,300).trim());
		System.out.println( valitemarketmessage.getText().substring(300,343).trim());
		System.out.println( valitemarketmessage.getText().substring(343,380).trim());
		
		
		Assert.assertEquals("Promocode Market Validation", valitemarketmessage.getText().substring(0,30).trim(), "The Market field is required.");
		Assert.assertEquals("Promocode Code Field Validation", valitemarketmessage.getText().substring(30,58).trim(), "The Code field is required.");
		Assert.assertEquals("Promocode Global Usage Validation", valitemarketmessage.getText().substring(58,99).trim(), "The Global Usage Limit field is required.");
		Assert.assertEquals("Promocode User Limit Validation", valitemarketmessage.getText().substring(99,143).trim(), "The Usage Limit Per User field is required.");
		Assert.assertEquals("Promocode Max Discount Validation", valitemarketmessage.getText().substring(143,185).trim(), "The Max discount amount must be a number.");
		Assert.assertEquals("Promocode Type Field Validation", valitemarketmessage.getText().substring(185,213).trim(), "The type field is required.");
		Assert.assertEquals("Promocode Promo Source Code Validation",  valitemarketmessage.getText().substring(213,253).trim(), "The PromoCode Source field is required.");
		Assert.assertEquals("Promocode Validate From Date Validation", valitemarketmessage.getText().substring(253,300).trim(), "The Valid from must be a date before Valid to.");
		Assert.assertEquals("Promocode Discount Percentage Validation", valitemarketmessage.getText().substring(300,343).trim(), "The Discount percentage field is required.");
		Assert.assertEquals("Promocode Discont Type Validation",valitemarketmessage.getText().substring(343,380).trim(), "The Discount type field is required.");
	
	}
	

	public void verifyprmocodecreated() throws InterruptedException, IOException {

		BaseClass.createalert("User Check Promo Created Successfully", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodesearch.sendKeys(PromoName);
		Thread.sleep(2000);
		searchbtn.click();
		Thread.sleep(2000);
		Assert.assertNotNull(promoid);
		Assert.assertEquals("Promocode Code Name Validation", promocodename.getText(), PromoName);
		Assert.assertEquals("Promocode Code Market Validation", promocodemarket.getText(), "UZ");
		//Assert.assertEquals("Promocode Code Type Validation", promocodetype.getText(), "Order Discount");
		Assert.assertEquals("Promocode Code Source Validation", promocodesource.getText(), "ZoodMall");
		Assert.assertEquals("Promocode Code Status Validation", promocodesatus.getText(), "Active");
		Assert.assertEquals("Promocode Code Max Discount Validation", promocodemaxdiscount.getText(), "1000");
		Assert.assertEquals("Promocode Code Global usable Validation", promocodeglobalusaglimit.getText(), "10");
		Assert.assertEquals("Promocode Code Usage limit User Validation", promocodeuserusagelimit.getText(), "100");
		
		String trimfromdate = promocodevalidfromdate.getText().substring(0,10);
		String trimtodate = promocodvalidtodate.getText().substring(0,10);
		System.out.println("Dates => " + trimfromdate + trimtodate);
		
		Date futureDate = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(futureDate);
		c1.add(Calendar.DATE, 1);
		Date convertedfutureDate=c1.getTime();
		String promotodate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(convertedfutureDate);
		System.out.println("Future Day" + promotodate);
		Assert.assertEquals("Promocode Code From Date Validation", trimfromdate, promofromdate);
		Assert.assertEquals("Promocode Code To Date User Validation", trimtodate, promotodate);
		BaseClass.createalert("Create Promo code Validation Successfull !!", PromoCodePage.driver);

	}
	
	
	public void deleteprmocodecreated() throws InterruptedException, IOException {

		BaseClass.createalert("User Will Delete Created Promo", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodesearch.clear();
		Thread.sleep(2000);
		promocodesearch.sendKeys(PromoName);
		Thread.sleep(2000);
		searchbtn.click();
		Thread.sleep(2000);
		promosetting.click();
		Thread.sleep(2000);
		promoremove.click();
		Thread.sleep(2000);
		promoremoveok.click();
		Thread.sleep(2000);
		BaseClass.createalert("Create Promo Deleted Successfully !!", PromoCodePage.driver);

	}
	
	
	

	public void createpromcustomerspeci() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Customer Specific", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodcustomerid.sendKeys(importExcelCustomerIdfilePath);
		Thread.sleep(2000);
		BaseClass.createalert("User Verify Customer ID Added Successfully", PromoCodePage.driver);
		promocodcustomeridtab.click();
		Thread.sleep(2000);
		Assert.assertEquals("Customer ID Assertion", getpromocodcustomerid.getText(), "776915");
		BaseClass.createalert("Customer ID Added Successfully !!", PromoCodePage.driver);
		promocodgenraltab.click();
		Thread.sleep(2000);
		savepromo();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Customer Id Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromproductspeci() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Product Specific", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductidtab.click();
		Thread.sleep(2000);

		promocodproductid.sendKeys(importExcelProductIdfilePath);
		Thread.sleep(2000);
		promocodproductidupload.click();
		Thread.sleep(5000);
		BaseClass.createalert("User Verify Product ID Added Successfully", PromoCodePage.driver);
		Thread.sleep(2000);
		System.out.println("Total Products on PromoCode" + promocodproductidrows.size());
		Assert.assertEquals("Customer ID Assertion", promocodproductidrows.size(), 7);
		BaseClass.createalert("Product ID Added Successfully !!", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodgenraltab.click();
		Thread.sleep(2000);
		savepromo();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Product Id Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromproductspecimanuallyadd() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Product Specific Manual addition", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductidtab.click();
		Thread.sleep(2000);
		promocodaddproductid.sendKeys("949111");
		Thread.sleep(2000);
		promocodaddproducbtn.click();
		Thread.sleep(5000);
		BaseClass.createalert("User Verify Product ID Added Successfully", PromoCodePage.driver);
		Thread.sleep(2000);
		System.out.println("Total Products on PromoCode" + promocodproductidrows.size());
		Assert.assertEquals("Customer ID Assertion", promocodproductidrows.size(), 2);
		BaseClass.createalert("Product ID Added Successfully !!", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodgenraltab.click();
		Thread.sleep(2000);
		savepromo();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Manaul Product Id added Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromsellertypespeci(String sellertype) throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Seller Type Specificn", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, sellertypdropdown, sellertype);
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Seller Type Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromsectiontypespeci(String section) throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Section Type Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, sectiontypedropdown, section);
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Section Type Created Successfully !!", PromoCodePage.driver);

	}
	
	
	public void createpromonsectionandsellertype(String section,String sellertype) throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code With Combination of Section Type and Seller Type Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, sectiontypedropdown, section);
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, sellertypdropdown, sellertype);
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo code With Combination of Section Type and Seller Type Created Successfully !!", PromoCodePage.driver);

	}

	

	public void createpromprocerange(String condition, String operator, String price)
			throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code With Price Range Condition", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);

		BaseClass.selectdropdown(PromoCodePage.driver, sectionconditiondropdown, condition);
		Thread.sleep(4000);
		BaseClass.selectdropdown(PromoCodePage.driver, sectionoperatordropdown, operator);
		Thread.sleep(4000);
		pricerange.sendKeys(price);
		Thread.sleep(4000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Price Range Created Successfully !!", PromoCodePage.driver);

	}
	
	
	
	public void createpromprowithcombination(String condition, String operator, String price)
			throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code With Combination of Price Range,Category,BrandName Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		categoryidfilter.click();
		Thread.sleep(2000);
		womencategoryidfilter.click();
		Thread.sleep(2000);

		brandnamefilter.sendKeys("Apple");
		Thread.sleep(2000);
	
		BaseClass.selectdropdown(PromoCodePage.driver, sectionconditiondropdown, condition);
		Thread.sleep(4000);
		BaseClass.selectdropdown(PromoCodePage.driver, sectionoperatordropdown, operator);
		Thread.sleep(4000);
		pricerange.sendKeys(price);
		Thread.sleep(4000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo code With Combination of Price Range,Category,BrandName Filter Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromselleridspeci() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Seller ID Specificn", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		selleridfilter.sendKeys("1381");
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Seller ID Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromminrankfilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Minimum Rank Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		minrankfilter.sendKeys("1000");
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Minimum Rank Filter Created Successfully !!", PromoCodePage.driver);

	}

	public void createprombrandzonefilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code on BrandZone Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		brandzonefilter.click();
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With BrandZone Filter Created Successfully !!", PromoCodePage.driver);

	}
	
	public void createpromcategoryfilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code on Root Category Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		categoryidfilter.click();
		Thread.sleep(2000);
		womencategoryidfilter.click();
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Root Category Filter Created Successfully !!", PromoCodePage.driver);

	}
	
	
	public void createpromcategorysublevelfilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code on Category Sub Level Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		categoryidfilter.click();
		Thread.sleep(2000);
		womencategoryidfilter.click();
		Thread.sleep(2000);
		categoryidfilter.click();
		Thread.sleep(2000);
		subcategorylevelfilter.sendKeys("Women Tops");
		Thread.sleep(4000);
		womensubcategoryfilter.click();
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Sub Category Level Filter Created Successfully !!", PromoCodePage.driver);

	}
	
	
	public void createpromcategorysubtosublevelfilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code on Category Sub To Sub Level Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		categoryidfilter.click();
		Thread.sleep(2000);
		womencategoryidfilter.click();
		Thread.sleep(2000);
		categoryidfilter.click();
		Thread.sleep(2000);
		subcategorylevelfilter.sendKeys("Women Tops");
		Thread.sleep(4000);
		womensubcategoryfilter.click();
		Thread.sleep(2000);
		subtosubcategorylevelfilter.sendKeys("Shirt");
		Thread.sleep(2000);
		womensubtosubcategoryfilter.click();
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Sub To Sub Category Level Filter Created Successfully !!", PromoCodePage.driver);

	}

	public void createprombrandnamefilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code on BrandName Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		brandnamefilter.sendKeys("Apple");
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With BrandName Filter Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromhotkeywordsfilter() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code on hot Keywords Filter", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		hotkeywordsfilter.sendKeys("Apple");
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With HotKeywords Filter Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromexcludeselleridspeci() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo code Exclude Seller ID Specificn", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodproductfiltertab.click();
		Thread.sleep(2000);
		addfilter.click();
		Thread.sleep(2000);
		selleridexcludefilter.sendKeys("1381");
		Thread.sleep(2000);
		savefilter.click();
		Thread.sleep(3000);
		BaseClass.createalert("Promo With Exclude Seller ID Created Successfully !!", PromoCodePage.driver);

	}

	public void createpromomarket(String promocodetype) throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo Code ", PromoCodePage.driver);
		Thread.sleep(2000);
		newpromocode.click();
		Thread.sleep(2000);
		promoname.sendKeys(PromoName);
		Thread.sleep(2000);
		BaseClass.selectdropdownbyvalue(PromoCodePage.driver, promomarket, "UZ");
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, promotype, promocodetype);
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, promosource, "ZoodMall");
		Thread.sleep(2000);
		promomessage.sendKeys("AutomationPromoMessage");
		Thread.sleep(2000);
		promotitle.sendKeys("AutomationPromotitle");
		Thread.sleep(2000);
		promoinfotext.sendKeys("AutomationPromotext");
		Thread.sleep(2000);
		promoglobalusage.sendKeys("10");
		Thread.sleep(2000);
		promousagelimit.sendKeys("100");
		Thread.sleep(2000);
		promopercentradio.click();
		Thread.sleep(2000);
		promodiscountpercent.sendKeys("10");
		Thread.sleep(2000);
		promominorder.sendKeys("10000");
		Thread.sleep(2000);
		promomaxamount.sendKeys("1000");
		Thread.sleep(2000);

		promofromdatepicker.click();

		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		int CurrentDayDate = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("Current Day" + CurrentDayDate);
		BaseClass.selectdate(PromoCodePage.driver, promofromdatetable, CurrentDayDate);

		Thread.sleep(5000);

		promotodatepicker.click();
		Date futureDate = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(futureDate);
		c1.add(Calendar.DATE, 1);
		int FutureDayDate = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println("Future Day" + FutureDayDate);
		BaseClass.selectdate(PromoCodePage.driver, promotodatetable, FutureDayDate);

		Thread.sleep(2000);

	}
	
	public void createpromofixdiscount(String promocodetype) throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo Code With Fix Discount", PromoCodePage.driver);
		Thread.sleep(2000);
		newpromocode.click();
		Thread.sleep(2000);
		promoname.sendKeys(PromoName);
		Thread.sleep(2000);
		BaseClass.selectdropdownbyvalue(PromoCodePage.driver, promomarket, "UZ");
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, promotype, promocodetype);
		Thread.sleep(2000);
		BaseClass.selectdropdown(PromoCodePage.driver, promosource, "ZoodMall");
		Thread.sleep(2000);
		promomessage.sendKeys("AutomationPromoMessage");
		Thread.sleep(2000);
		promotitle.sendKeys("AutomationPromotitle");
		Thread.sleep(2000);
		promoinfotext.sendKeys("AutomationPromotext");
		Thread.sleep(2000);
		promoglobalusage.sendKeys("10");
		Thread.sleep(2000);
		promousagelimit.sendKeys("100");
		Thread.sleep(2000);
		promofixedamountradio.click();
		Thread.sleep(2000);

		promodiscountpercent.sendKeys("1000");
		Thread.sleep(2000);
		promominorder.sendKeys("10000");
		Thread.sleep(2000);
		promomaxamount.sendKeys("1000");
		Thread.sleep(2000);

		promofromdatepicker.click();

		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		int CurrentDayDate = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("Current Day" + CurrentDayDate);
		BaseClass.selectdate(PromoCodePage.driver, promofromdatetable, CurrentDayDate);

		Thread.sleep(5000);

		promotodatepicker.click();
		Date futureDate = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(futureDate);
		c1.add(Calendar.DATE, 1);
		int FutureDayDate = c1.get(Calendar.DAY_OF_MONTH);
		System.out.println("Future Day" + FutureDayDate);
		BaseClass.selectdate(PromoCodePage.driver, promotodatetable, FutureDayDate);

		Thread.sleep(2000);

	}

	public void savepromo() throws InterruptedException {
		promosave.click();
		Thread.sleep(2000);

	}
	
	public void selectpromopaymethod() throws InterruptedException, IOException {
		BaseClass.createalert("Create Promo Code Supported Payment Option Selection", PromoCodePage.driver);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		Thread.sleep(3000);
		supportpaymethodcod.click();
		Thread.sleep(2000);
		supportpaymethodpayme.click();
		Thread.sleep(2000);

	}

	public void promocodetab() throws InterruptedException {
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");
		BaseClass.waitForVisibility(promocodetab, PromoCodePage.driver);
		promocodetab.click();
		Thread.sleep(2000);

	}

	public void promomanagement() throws InterruptedException, IOException {

		BaseClass.createalert("User Will Navigate to Promo Code Management", PromoCodePage.driver);
		Thread.sleep(2000);
		promocodemanagmenttab.click();

	}

	public void verifyprmocodemanagmentpage() throws InterruptedException, IOException {
		Thread.sleep(3000);
		BaseClass.waitForVisibility(newpromocode, PromoCodePage.driver);
		Assert.assertTrue("User Not able to navigate promo managment",
				driver.getPageSource().contains("Promo Codes Management "));

	}

}
