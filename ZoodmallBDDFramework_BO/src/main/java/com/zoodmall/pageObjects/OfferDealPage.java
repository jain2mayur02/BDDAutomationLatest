package com.zoodmall.pageObjects;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodmall.comman.BaseClass;

public class OfferDealPage {
	static WebDriver driver;

	Date now = new Date();
	String doddates = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).format(now);
	String bannerPath = System.getProperty("user.dir") + "\\configs\\TestImages\\TestImage.png";
	String offerdealfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\offer-product-details.xlsx";
	String offereditdealfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\offer-product-details-edit.xlsx";

	public OfferDealPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[contains(@class, 'text') and text() = '_Offer Deal']")
	private WebElement offerdealday;

	@FindBy(xpath = "//*[@class='btn btn-sm btn-success']")
	private WebElement offerdealbtn;

	@FindBy(xpath = "//*[@id='marketCode']/div")
	private WebElement offerdealmrkdropdwn;

	@FindBy(xpath = "//a/span[text()= 'LB']")
	private WebElement offerdealmrkLB;
	
	@FindBy(xpath = "//a/b[text()= 'LB']")
	private WebElement offerdealeditmrkLB;
	
	@FindBy(xpath = "//a/span[text()= 'KZ']")
	private WebElement offerdealmrkKZ;
	

	@FindBy(xpath = "//*[@id='name']")
	private WebElement offerdealname;

	@FindBy(xpath = "//*[@id='sort']")
	private WebElement offerdealsortorder;

	@FindBy(xpath = "//*[@id='short_description']")
	private WebElement offerdealpredescp;

	@FindBy(xpath = "//*[@id='description']")
	private WebElement offerdealdescp;

	@FindBy(xpath = "//*[@id='banner']")
	private WebElement offerdealbanner;

	@FindBy(xpath = "//input[@placeholder='HH']")
	private WebElement putofferdealhhfrom;

	@FindBy(xpath = "//*[@id='app']/div/div/div[4]/div/div/div[2]/form/section/div/div[1]/div/div/div[7]/div[2]/div/ul/li[2]/div/section/table/tbody/tr[2]/td[1]/input")
	private WebElement putofferdealhhto;

	@FindBy(xpath = "//*[@id='app']/div/div/div[4]/div/div/div[2]/form/section/div/div[1]/div/div/div[7]/div[1]/div/div/div/button")
	private WebElement clickofferfromdatebtn;

	@FindBy(xpath = "//*[@id='app']/div/div/div[4]/div/div/div[2]/form/section/div/div[1]/div/div/div[7]/div[2]/div/div/div/button")
	private WebElement clickoffertodatebtn;

	@FindBy(xpath = "//*[@class='btn btn-success']")
	private WebElement offersave;
	
	@FindBy(xpath = "//*[@id='valid_from']")
	private WebElement validdatefrom;
	
	@FindBy(xpath = "//*[@id='valid_to']")
	private WebElement validdateto;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[1]/form/div/div/div[4]/div[2]/button[1]")
	private WebElement search;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[1]/span")
	private WebElement getofferid;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[4]/span")
	private WebElement getoffermrk;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[5]/span")
	private WebElement getofferdealvalidfrom;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[6]/span")
	private WebElement getofferdealvalidto;
	
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div/div[2]/table/tbody/tr/td[7]/span")
	private WebElement getsortorder;
	
	@FindBy(xpath = "//*[@id='market_code']")
	private WebElement maktdrpofferdeal;
	
	@FindBy(xpath = "//button[@class='btn btn-primary dropdown-toggle' and @type = 'button']")
	private WebElement offerdealsetting;
	
	@FindBy(xpath = "//a[text() = 'Remove']")
	private WebElement offerdealremove;
	
	@FindBy(xpath = "//button[@class='btn btn-primary' and text() = 'OK']")
	private WebElement offerdealconfirm;
	
	@FindBy(xpath = "//*[text()= 'No records found']")
	private WebElement offerdealnorecord;
	
	@FindBy(xpath = "//*[text()='Product ID (Import)']")
	private WebElement offerproductidtab;
	
	@FindBy(xpath = "//*[text()=' Download Sample File ']")
	private WebElement offerdownloadsamplefile;
	
	@FindBy(xpath = "//*[@id='file']")
	private WebElement chooseofferfile;
	
	@FindBy(xpath = "//*[@class='btn btn-primary' and text() = 'Upload ']")
	private WebElement uploadofferfilebtn;
	
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr")
	private List<WebElement> offerproductuploadtable;
	
	@FindBy(xpath = "//*[@class='btn btn-success']/span")
	private WebElement offerdealsave;
	
	@FindBy(xpath = "//*[@id='productId']")
	private WebElement addproductidoffer;
	
	@FindBy(xpath = "//*[@class='btn btn-primary' and text() = 'Add Product']")
	private WebElement addproductbtn;
	
	@FindBy(xpath = "//*[@class='btn btn-primary' and text()= 'Export ']")
	private WebElement exportoffer;

	@FindBy(xpath = "//*[@class='btn btn-danger' and text()= 'Delete all']")
	private WebElement deleteallofferproduct;
	
	@FindBy(xpath = "//span[text()= 'No products found']")
	private WebElement noproductfoundonoffer;
	
	@FindBy(xpath = "//a[text()= 'Edit']")
	private WebElement editoffer;
	
	
	
	
	public void offerpage() {
		BaseClass.waitForVisibility(offerdealday, OfferDealPage.driver);
		offerdealday.click();
	}

	public void verifyofferdealpage() throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		Assert.assertTrue("User Not able to Navigate Offer deal page",
				driver.getPageSource().contains("Offer Management "));
	}

	public void createofferdeal() throws InterruptedException, IOException {

		BaseClass.createalert("Create Offer For Market Basis ",OfferDealPage.driver);
		Thread.sleep(2000);
		BaseClass.waitForVisibility(offerdealbtn, OfferDealPage.driver);
		offerdealbtn.click();
		BaseClass.waitForVisibility(offerdealmrkdropdwn, OfferDealPage.driver);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		offerdealmrkLB.click();
		offerdealmrkdropdwn.click();
		BaseClass.waitForVisibility(offerdealname, OfferDealPage.driver);
		offerdealname.sendKeys("TestOfferAutomation");
		BaseClass.waitForVisibility(offerdealsortorder, OfferDealPage.driver);
		offerdealsortorder.sendKeys("1");
		BaseClass.waitForVisibility(offerdealpredescp, OfferDealPage.driver);
		offerdealpredescp.sendKeys("Test Automation pre description");
		BaseClass.waitForVisibility(offerdealdescp, OfferDealPage.driver);
		Thread.sleep(2000);
		offerdealdescp.sendKeys("Test Automation description for creating offer deal");
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		Thread.sleep(2000);
		System.out.println("Path" + bannerPath);
		offerdealbanner.sendKeys(bannerPath);
		Thread.sleep(2000);
		clickofferfromdatebtn.click();
		Thread.sleep(2000);
		putofferdealhhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); 
		putofferdealhhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhfrom.sendKeys("00"); // enter new text
		clickoffertodatebtn.click();
		Thread.sleep(2000);
		putofferdealhhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all														
		putofferdealhhto.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickoffertodatebtn.click();
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		offersave.click();
		BaseClass.createalert("Offer Created Successfully ",OfferDealPage.driver);
	}
	
	
	
	public void verifyofferdealcreate() throws InterruptedException, IOException {
		
		BaseClass.createalert("Validate Offer Reflected With Correct Entries",OfferDealPage.driver);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdatefrom,OfferDealPage.driver);
		Thread.sleep(2000);
		validdatefrom.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdateto,OfferDealPage.driver);
		Thread.sleep(2000);
		validdateto.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.selectdropdown(OfferDealPage.driver, maktdrpofferdeal, "LB");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(2000);
		Assert.assertNotEquals(getofferid.getText(), null);
		Assert.assertEquals(getoffermrk.getText(), "LB");
		Assert.assertEquals(getofferdealvalidfrom.getText(), doddates + " 00:00:00");
		Assert.assertEquals(getofferdealvalidto.getText(), doddates + " 23:00:00");
		Assert.assertEquals(getsortorder.getText(), "1");
		System.out.println(getofferid.getText());
		System.out.println(getoffermrk.getText());
		System.out.println(getofferdealvalidfrom.getText());
		System.out.println(getofferdealvalidto.getText());
		System.out.println(getsortorder.getText());
		BaseClass.createalert("Offer Validation Successfull ",OfferDealPage.driver);

	}
	

	public void verifyofferdealdelete() throws InterruptedException, IOException {
		

		BaseClass.createalert("Delete Created Offer",OfferDealPage.driver);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdatefrom,OfferDealPage.driver);
		Thread.sleep(2000);
		validdatefrom.clear();
		Thread.sleep(2000);
		validdatefrom.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdateto,OfferDealPage.driver);
		Thread.sleep(2000);
		validdateto.clear();
		Thread.sleep(2000);
		validdateto.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.selectdropdown(OfferDealPage.driver, maktdrpofferdeal, "LB");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(2000);
		offerdealsetting.click();
		Thread.sleep(2000);
		offerdealremove.click();
		Thread.sleep(2000);
		offerdealconfirm.click();
		Thread.sleep(3000);
		Assert.assertEquals(offerdealnorecord.getText(), "No records found");
		BaseClass.createalert("Offer Deleted Successfully",OfferDealPage.driver);
	}
	
	public void verifyofferfiledownloadod() throws InterruptedException, IOException {

		BaseClass.createalert("Verify Download Sample Offer File",OfferDealPage.driver);
		offerdealbtn.click();
		Thread.sleep(2000);
		offerproductidtab.click();
		BaseClass.deleteexistingfile("offer-product-details.xlsx");
		offerdownloadsamplefile.click();
		Thread.sleep(3000);
		BaseClass.verifyfileexist("offer-product-details.xlsx");
		BaseClass.createalert("File Downloaded Successfully",OfferDealPage.driver);
	}
	
	public void verifyuploadofferproductexcel() throws InterruptedException, IOException {
		
		BaseClass.createalert("Create Offer By Uploading Products By Excel",OfferDealPage.driver);
		
		BaseClass.waitForVisibility(offerdealbtn, OfferDealPage.driver);
		offerdealbtn.click();
		BaseClass.waitForVisibility(offerdealmrkdropdwn, OfferDealPage.driver);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		offerdealmrkLB.click();
		offerdealmrkdropdwn.click();
		BaseClass.waitForVisibility(offerdealname, OfferDealPage.driver);
		offerdealname.sendKeys("TestOfferAutomation");
		BaseClass.waitForVisibility(offerdealsortorder, OfferDealPage.driver);
		offerdealsortorder.sendKeys("1");
		BaseClass.waitForVisibility(offerdealpredescp, OfferDealPage.driver);
		offerdealpredescp.sendKeys("Test Automation pre description");
		BaseClass.waitForVisibility(offerdealdescp, OfferDealPage.driver);
		Thread.sleep(2000);
		offerdealdescp.sendKeys("Test Automation description for creating offer deal");
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		Thread.sleep(2000);
		System.out.println("Path" + bannerPath);
		offerdealbanner.sendKeys(bannerPath);
		Thread.sleep(2000);
		clickofferfromdatebtn.click();
		Thread.sleep(2000);
		putofferdealhhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); 
		putofferdealhhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhfrom.sendKeys("00"); // enter new text
		clickoffertodatebtn.click();
		Thread.sleep(2000);
		putofferdealhhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all														
		putofferdealhhto.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickoffertodatebtn.click();
		BaseClass.waitForVisibility(offerproductidtab, OfferDealPage.driver);
		Thread.sleep(2000);
		offerproductidtab.click();
		System.out.println("Path" + offerdealfilePath);
		chooseofferfile.sendKeys(offerdealfilePath);
		BaseClass.waitForVisibility(uploadofferfilebtn, OfferDealPage.driver);
		uploadofferfilebtn.click();
		Thread.sleep(3000);
		List<WebElement> rows = offerproductuploadtable;
		int count = rows.size();
		System.out.println("ROW COUNT : " + count);

		if (count >= 1) {
			System.out.println("Data Added correctly");
		}
		
		BaseClass.createalert("Products Added Successfully",OfferDealPage.driver);
		BaseClass.waitForVisibility(offerdealsave, OfferDealPage.driver);
		offerdealsave.click();
		Thread.sleep(3000);

	}
	
	public void verifyuploadproductbyidofferdeal() throws InterruptedException, IOException {
	
		BaseClass.createalert("Create Offer By Adding Products By ProductID",OfferDealPage.driver);
		BaseClass.waitForVisibility(offerdealbtn, OfferDealPage.driver);
		offerdealbtn.click();
		BaseClass.waitForVisibility(offerdealmrkdropdwn, OfferDealPage.driver);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		offerdealmrkLB.click();
		offerdealmrkdropdwn.click();
		BaseClass.waitForVisibility(offerdealname, OfferDealPage.driver);
		offerdealname.sendKeys("TestOfferAutomation");
		BaseClass.waitForVisibility(offerdealsortorder, OfferDealPage.driver);
		offerdealsortorder.sendKeys("1");
		BaseClass.waitForVisibility(offerdealpredescp, OfferDealPage.driver);
		offerdealpredescp.sendKeys("Test Automation pre description");
		BaseClass.waitForVisibility(offerdealdescp, OfferDealPage.driver);
		Thread.sleep(2000);
		offerdealdescp.sendKeys("Test Automation description for creating offer deal");
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		Thread.sleep(2000);
		System.out.println("Path" + bannerPath);
		offerdealbanner.sendKeys(bannerPath);
		Thread.sleep(2000);
		clickofferfromdatebtn.click();
		Thread.sleep(2000);
		putofferdealhhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); 
		putofferdealhhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhfrom.sendKeys("00"); // enter new text
		clickoffertodatebtn.click();
		Thread.sleep(2000);
		putofferdealhhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all														
		putofferdealhhto.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickoffertodatebtn.click();
		BaseClass.waitForVisibility(offerproductidtab, OfferDealPage.driver);
		Thread.sleep(2000);
		offerproductidtab.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(addproductidoffer, OfferDealPage.driver);
		addproductidoffer.sendKeys("5111369");
		Thread.sleep(2000);
		addproductbtn.click();
		List<WebElement> rows = offerproductuploadtable;
		int count = rows.size();
		System.out.println("ROW COUNT : " + count);

		if (count >= 2) {
			System.out.println("Data Added correctly");
		}
		
		BaseClass.createalert("Products Added Successfully",OfferDealPage.driver);
		Thread.sleep(3000);
		BaseClass.waitForelementclicable(offerdealsave, OfferDealPage.driver);
		offerdealsave.click();

	}
	
	public void verifyexportonoffer() throws InterruptedException, IOException {

		BaseClass.createalert("Verify Export Functionality",OfferDealPage.driver);
		BaseClass.waitForVisibility(offerdealbtn, OfferDealPage.driver);
		offerdealbtn.click();
		BaseClass.waitForVisibility(offerdealmrkdropdwn, OfferDealPage.driver);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		offerdealmrkLB.click();
		offerdealmrkdropdwn.click();
		BaseClass.waitForVisibility(offerdealname, OfferDealPage.driver);
		offerdealname.sendKeys("TestOfferAutomation");
		BaseClass.waitForVisibility(offerdealsortorder, OfferDealPage.driver);
		offerdealsortorder.sendKeys("1");
		BaseClass.waitForVisibility(offerdealpredescp, OfferDealPage.driver);
		offerdealpredescp.sendKeys("Test Automation pre description");
		BaseClass.waitForVisibility(offerdealdescp, OfferDealPage.driver);
		Thread.sleep(2000);
		offerdealdescp.sendKeys("Test Automation description for creating offer deal");
		BaseClass.waitForVisibility(offerdealbanner, OfferDealPage.driver);
		Thread.sleep(2000);
		System.out.println("Path" + bannerPath);
		offerdealbanner.sendKeys(bannerPath);
		Thread.sleep(2000);
		clickofferfromdatebtn.click();
		Thread.sleep(2000);
		putofferdealhhfrom.sendKeys(Keys.CONTROL, Keys.chord("a")); 
		putofferdealhhfrom.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhfrom.sendKeys("00"); // enter new text
		clickoffertodatebtn.click();
		Thread.sleep(2000);
		putofferdealhhto.sendKeys(Keys.CONTROL, Keys.chord("a")); // select all														
		putofferdealhhto.sendKeys(Keys.BACK_SPACE); // delete it
		putofferdealhhto.sendKeys("23"); // enter new text
		Thread.sleep(2000);
		clickoffertodatebtn.click();
		BaseClass.waitForVisibility(offerproductidtab, OfferDealPage.driver);
		Thread.sleep(2000);
		offerproductidtab.click();
		System.out.println("Path" + offerdealfilePath);
		chooseofferfile.sendKeys(offerdealfilePath);
		BaseClass.waitForVisibility(uploadofferfilebtn, OfferDealPage.driver);
		uploadofferfilebtn.click();
		Thread.sleep(3000);
		List<WebElement> rows = offerproductuploadtable;
		int count = rows.size();
		System.out.println("ROW COUNT : " + count);

		if (count >= 1) {
			System.out.println("Data Added correctly");
		}
		BaseClass.waitForVisibility(exportoffer, OfferDealPage.driver);
		exportoffer.click();
		BaseClass.createalert("File Exported Successfully",OfferDealPage.driver);
	}
	
	public void verifydeletealloffer() throws InterruptedException, IOException

	{
		BaseClass.createalert("Verify Delete All",OfferDealPage.driver);
		Thread.sleep(5000);
		BaseClass.waitForVisibility(deleteallofferproduct, OfferDealPage.driver);
		deleteallofferproduct.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(noproductfoundonoffer, OfferDealPage.driver);
		Assert.assertEquals(noproductfoundonoffer.getText(), "No products found");
		BaseClass.createalert("All Products Deleted Successfully",OfferDealPage.driver);

	}
	
	public void editofferdeal() throws InterruptedException, IOException {
		BaseClass.createalert("Edit the Created Offer",OfferDealPage.driver);
		Thread.sleep(2000);
		offerdealsetting.click();
		BaseClass.waitForVisibility(editoffer, DealOfDayPage.driver);
		editoffer.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(offerdealmrkdropdwn, OfferDealPage.driver);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(offerdealmrkKZ, DealOfDayPage.driver);
		offerdealmrkKZ.click();
		Thread.sleep(2000);
		offerdealeditmrkLB.click();
		Thread.sleep(3000);
		offerdealmrkdropdwn.click();
		Thread.sleep(2000);
		offerproductidtab.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(deleteallofferproduct, OfferDealPage.driver);
		deleteallofferproduct.click();
		Thread.sleep(2000);
		System.out.println("Path" + offereditdealfilePath);
		chooseofferfile.sendKeys(offereditdealfilePath);
		BaseClass.waitForVisibility(uploadofferfilebtn, OfferDealPage.driver);
		uploadofferfilebtn.click();
		Thread.sleep(3000);
		List<WebElement> rows = offerproductuploadtable;
		int count = rows.size();
		System.out.println("ROW COUNT : " + count);
		//Assert.assertEquals(rows, "3");
		
		if (count >= 1) {
			System.out.println("Data Added correctly");
		}
		BaseClass.waitForVisibility(offerdealsave, OfferDealPage.driver);
		offerdealsave.click();
		Thread.sleep(3000);
		BaseClass.createalert("Offer Edited Successfully",OfferDealPage.driver);

	}
	
	public void verifyeditofferdeal() throws InterruptedException, IOException {

		
		driver.navigate().refresh();
		BaseClass.createalert("Validate Edited Data Reflected Correctly",OfferDealPage.driver);
		Thread.sleep(3000);
		BaseClass.removereadonlyattr(validdatefrom,OfferDealPage.driver);
		Thread.sleep(2000);
		validdatefrom.clear();
		Thread.sleep(2000);
		validdatefrom.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdateto,OfferDealPage.driver);
		Thread.sleep(2000);
		validdateto.clear();
		Thread.sleep(2000);
		validdateto.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.selectdropdown(OfferDealPage.driver, maktdrpofferdeal, "KZ");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(2000);
		Assert.assertNotEquals(getofferid.getText(), null);
		Assert.assertEquals(getoffermrk.getText(), "KZ");
		Assert.assertEquals(getofferdealvalidfrom.getText(), doddates + " 00:00:00");
		Assert.assertEquals(getofferdealvalidto.getText(), doddates + " 23:00:00");
		Assert.assertEquals(getsortorder.getText(), "1");
		System.out.println(getofferid.getText());
		System.out.println(getoffermrk.getText());
		System.out.println(getofferdealvalidfrom.getText());
		System.out.println(getofferdealvalidto.getText());
		System.out.println(getsortorder.getText());
		BaseClass.createalert("Data Validation Successfull",OfferDealPage.driver);

	}
	
	public void verifyeditdeleteofferdeal() throws InterruptedException, IOException {

		driver.navigate().refresh();
		BaseClass.createalert("Delete the Offer",OfferDealPage.driver);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdatefrom,OfferDealPage.driver);
		Thread.sleep(2000);
		validdatefrom.clear();
		Thread.sleep(2000);
		validdatefrom.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.removereadonlyattr(validdateto,OfferDealPage.driver);
		Thread.sleep(2000);
		validdateto.clear();
		Thread.sleep(2000);
		validdateto.sendKeys(doddates);
		Thread.sleep(2000);
		BaseClass.selectdropdown(OfferDealPage.driver, maktdrpofferdeal, "KZ");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(2000);
		offerdealsetting.click();
		Thread.sleep(2000);
		offerdealremove.click();
		Thread.sleep(2000);
		offerdealconfirm.click();
		Thread.sleep(3000);
		Assert.assertEquals(offerdealnorecord.getText(), "No records found");
		BaseClass.createalert("Offer Deleted Successfully",OfferDealPage.driver);
	}

}
