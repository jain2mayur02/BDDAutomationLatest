package com.zoodmall.pageObjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoodmall.comman.BaseClass;

public class SBOProductManagement {
	static WebDriver driver;

	String home = System.getProperty("user.home");
	String importExcelProductfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\import-product-template.xlsx";
	String updateExcelProductfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\update-product-template.xlsx";
	String importExcelNegativeProductfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\import-product-template-negative-local.xlsx";
	String importExcelNegativeUpdateProductfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\update-product-template-negative-local.xlsx";
	String importdetailreportExcelNegativeProductfilePath = System.getProperty("user.dir") + "\\configs\\TestDataExcel\\import-negativefile.xlsx";
	static long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
	static double defaultprice = Math.floor(Math.random());
	String productnam = "TestAutomationManual" + number;
	String productSPU = "TestAutomationManualSPU" + number;
	String productnamedit = "TestAutomationManualEdit" + number;
	String productSPUedit = "TestAutomationManualSPUEdit" + number;
	String productpricedit = "20";
	String msrppriceedit = "20";
	String defaultquantityedit = "20";
	String productpric = "10";
	String msrpprice = "10";
	String defaultquantity = "10";
	
	String imgpath = System.getProperty("user.dir") + "\\configs\\TestImages\\TestImage.png";
	String editimgpath = System.getProperty("user.dir") + "\\configs\\TestImages\\TestEditImage.jpg";
	
	public SBOProductManagement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[contains(@class, 'text') and text() = 'User Management']")
	private WebElement usermanagmenttab;

	@FindBy(xpath = "//span[contains(@class, 'text') and text() = 'Seller management']")
	private WebElement sellermanagmenttab;

	@FindBy(xpath = "//input[@placeholder='Please enter seller ID.']")
	private WebElement selleridfield;

	@FindBy(xpath = "//*[@class='btn btn-default' and @type = 'submit']")
	private WebElement sellersearch;

	@FindBy(xpath = "//*[@class='btn btn-default btn-sm' and text() = 'Enter seller back office']")
	private WebElement entersellerbackoffice;

	@FindBy(xpath = "//*[@class='btn btn-success' and text()= 'Import Products']")
	private WebElement clickimportproduct;
	
	
	@FindBy(xpath = "//*[@class='btn btn-success' and text()= 'Update Product']")
	private WebElement clickupdateproduct;
	
	
	@FindBy(xpath = "//*[@class = 'btn btn-success add-product' and text() = 'Add Product' ]")
	private WebElement clickaddproduct;
	

	@FindBy(xpath = "//*[@class='text-primary' and text()= 'Download excel template']")
	private WebElement clickdownloadexcel;
	
	@FindBy(xpath = "(//*[@class='text-primary' and text()= 'Download excel template'])[2]")
	private WebElement clickdownloadupdateexcel;
	
	
	

	@FindBy(xpath = "//*[@id='import-file-input']")
	private WebElement importexcelproduct;

	@FindBy(xpath = "//*[@class='btn btn-primary btn-embossed' and @type = 'submit']")
	private WebElement importbtn;

	@FindBy(xpath = "//input[@placeholder='SPU01 SPU02 SPU03']")
	private WebElement spufield;

	@FindBy(xpath = "//*[@class='btn btn-primary btn-block' and @type = 'button']")
	private WebElement searchproduct;

	@FindBy(xpath = "//*[@id='tr_11844102']/td[4]")
	private WebElement suptabefield;

	@FindBy(xpath = "//table[@class='table table-bordered multichoice m-b-0 table-fixed-head']/tbody/tr")
	private List<WebElement> producttable;
	
	@FindBy(xpath = "//*[contains(@id,'tr_')]/td[3]")
	private WebElement productname;
	
	@FindBy(xpath = "(//*[contains(@id,'tr_')]/td[3])[1]")
	private WebElement productnamefirst;
	
	
	@FindBy(xpath = "//*[contains(@id,'_salePrice')]")
	private WebElement productprice;
	
	
	
	@FindBy(xpath = "//*[contains(@id,'tr_')]/td[8]")
	private WebElement productquantity;
	
	@FindBy(xpath = "//*[contains(@id,'_categoryId')]")
	private WebElement productcategory;
	
	@FindBy(xpath = "//*[contains(@id,'_statusDisplayName')]")
	private WebElement salesStatus;
	
	
	@FindBy(xpath = "//*[@class='fa fa-plus-circle']")
	private WebElement productexpand;
	
	@FindBy(xpath = "(//*[contains(@id,'productStockTr')]/td[2])[1]")
	private WebElement productsku;
	
	@FindBy(xpath = "(//*[contains(@id,'productStockTr')]/td[2])[2]")
	private WebElement productsku01;
	
	
	
	@FindBy(xpath = "//*[contains(@id,'productStockTr')]/td[4]")
	private WebElement productskuprice;
	
	@FindBy(xpath = "(//*[contains(@id,'productStockTr')]/td[4])[2]")
	private WebElement productskuprice01;
	
	@FindBy(xpath = "//*[contains(@id,'productStockTr')]/td[7]")
	private WebElement productskusalesstatus;
	
	@FindBy(xpath = "(//*[contains(@id,'productStockTr')]/td[7])[2]")
	private WebElement productskusalesstatus01;
	
	@FindBy(xpath = "(//*[contains(@id,'productStockTr')]/td[8])[2]")
	private WebElement productskuquantity01;
	
	@FindBy(xpath = "//*[contains(@id,'productStockTr')]/td[8]")
	private WebElement productskuquantity;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement addproductname;
	
	@FindBy(xpath = "//input[@name='sku']")
	private WebElement addproductsku;
	
	@FindBy(xpath = "//input[@name='defaultPrice']")
	private WebElement adddefaultprice;
	
	@FindBy(xpath = "//input[@name='salePrice']")
	private WebElement editdefaultprice;
	
	
	@FindBy(xpath = "//input[@name='crossedPrice']")
	private WebElement addmsrpprice;
	
	
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement adddefaultquantity;
	
	@FindBy(xpath = "//*[@class='form-control categoryId_0 form-white' and @name ='categoryId[]']")
	private WebElement selectrootcat;
	
	@FindBy(xpath = "//*[@class='form-control subCate_0 form-white' and @name ='categoryId[]']")
	private WebElement selectsubcat;
	
	@FindBy(xpath = "//*[@class='form-control subtoCate_0 form-white' and @name ='categoryId[]']")
	private WebElement selectsubtosubcat;
	
	@FindBy(xpath = "//*[@id='multiple']")
	private WebElement uploadimg;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement adddesciption;
	
	@FindBy(xpath = "//*[@class='btn btn-primary' and @id='submitForm']")
	private WebElement saveproduct;
	
	@FindBy(xpath = "//*[@id='productEdit']")
	private WebElement prodeditframe;
	
	@FindBy(xpath = "//*[@id='liMenu_order']")
	private WebElement ordermantab;
	
	@FindBy(xpath = "//a[@class='text-success' and text()='Edit']")
	private WebElement editproduct;
	
	@FindBy(xpath = "(//input[@type ='checkbox' and @name='item'])[3]")
	private WebElement selectprd;
	
	@FindBy(xpath = "(//button[@type ='button' and @class='btn btn-primary dropdown-toggle'])[1]")
	private WebElement selectbatchset;
	
	@FindBy(xpath = "//a[text()='Disable Sales']")
	private WebElement seldisablesale;
	
	@FindBy(xpath = "//a[text()='Enable Sales']")
	private WebElement selenablesale;
	
	@FindBy(xpath = "//a[text()='Archive Selected']")
	private WebElement selarchive;
	
	@FindBy(xpath = "//a[text()='Marketplace']")
	private WebElement selmarketbatch;
	
	@FindBy(xpath = "(//*[contains(@id,'_statusDisplayName')])[1]")
	private WebElement salestatusoneprod;
	
	@FindBy(xpath = "(//*[@class='fa fa-plus-circle'])[1]")
	private WebElement expanprodfirst;
	
	@FindBy(xpath = "(//*[contains(@id,'productStockTr')]/td[7])[1]")
	private WebElement prodskusalesatusfirst;
	
	@FindBy(xpath = "//input[@type='checkbox' and @name='isArchiveProduct']")
	private WebElement showarchivedcheck;
	
	@FindBy(xpath = "//input[@placeholder='Please input product name or SPU']")
	private WebElement prodnameinput;
	
	@FindBy(xpath = "//*[@class='checkbox-inline shop']")
	private WebElement selectmarket;
	
	@FindBy(xpath = "//input[@type='text' and @placeholder='The minimum number of days']")
	private WebElement deliveminday;
	
	@FindBy(xpath = "//input[@type='text' and @placeholder='The maximum number of days']")
	private WebElement delivemaxday;
	
	@FindBy(xpath = "//input[@type='text' and @placeholder='ShippingFee']")
	private WebElement setshippingbybatch;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-embossed' and text()='Confirm']")
	private WebElement clickconfirm;
	
	@FindBy(xpath = "(//*[contains(@id,'tr_')]/td[10])[1]")
	private WebElement getshippingfirst;
	
	@FindBy(xpath = "//table[@class='table table-bordered fixed-table-word-wrap']/tbody[1]/tr[2]/td[6]/a[@class='btn btn-default' and text()='Download']")
	private WebElement downloadimportexcel;
	
	@FindBy(xpath = "//*[@id='name-error']")
	private WebElement prodnamevalidtn;
	
	@FindBy(xpath = "//*[@id='parentSku-error']")
	private WebElement prodspuvalidtn;
	
	@FindBy(xpath = "//*[@id='parentPrice-error']")
	private WebElement prodpricevalidtn;
	
	@FindBy(xpath = "//*[@id='crossedPrice-error']")
	private WebElement prodmsrpvalidtn;
	
	@FindBy(xpath = "//*[@id='catErr']")
	private WebElement prodcatevalidtn;
	
	@FindBy(xpath = "//*[@id='description-error']")
	private WebElement proddesvalidtn;
	
	@FindBy(xpath = "//*[@id='parentQuantity-error']")
	private WebElement prodqunatityvalidtn;
	
	@FindBy(xpath = "//input[@type='checkbox' and @value='all']")
	private WebElement selectallprod;
	
	
	@FindBy(xpath = "//button[@class='btn btn-primary dropdown-toggle' and text()='Set Category ']")
	private WebElement selectsetcate;

	
	@FindBy(xpath = "//a[text()='Men’s Clothing']")
	private WebElement selectmenscate;
	
	
	@FindBy(xpath = "//*[@id='productList']/tbody/tr/td[9]")
	private List<WebElement> productcolumnslisttable;
	
	
	
	
	public void semarketshippingbybatch() throws IOException, InterruptedException{
		BaseClass.createalert("User Will Select Market and Set Shipping Using Batch Setting ",SBOProductManagement.driver);
		Thread.sleep(2000);
		selectprd.click();
		Thread.sleep(2000);
		selectbatchset.click();
		Thread.sleep(2000);
		selmarketbatch.click();
		Thread.sleep(3000);
		selectmarket.click();
		Thread.sleep(2000);
		deliveminday.sendKeys("1");
		Thread.sleep(2000);
		delivemaxday.sendKeys("2");
		Thread.sleep(2000);
		setshippingbybatch.sendKeys("50");
		Thread.sleep(2000);
		clickconfirm.click();
		Thread.sleep(2000);
		System.out.println("Shiping => " + getshippingfirst.getText());
		Assert.assertEquals("Market and Shipping Assertion" ,getshippingfirst.getText(), "Uzbekistan:50.00");
		
	}
	
	public void disprodbybatch() throws IOException, InterruptedException{
		BaseClass.createalert("User Will Select Product and Disable it From Batch Setting ",SBOProductManagement.driver);
		Thread.sleep(2000);
		selectprd.click();
		Thread.sleep(2000);
		selectbatchset.click();
		Thread.sleep(2000);
		seldisablesale.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(salestatusoneprod, SBOProductManagement.driver);
		System.out.println("Productsalesstatus => " + salestatusoneprod.getText());
		Assert.assertEquals("Productsalesstatus Assertion" ,salestatusoneprod.getText(), "Disabled");
		Thread.sleep(2000);
		expanprodfirst.click();
		System.out.println("Productskusalesstatus => " + prodskusalesatusfirst.getText());
		Assert.assertEquals("Productskusalesstatus Assertion" ,prodskusalesatusfirst.getText(), "No");
		BaseClass.createalert("Validation Done !! Product Disable Successfully",SBOProductManagement.driver);
	}
	
	public void setcategory() throws IOException, InterruptedException{
		BaseClass.createalert("User Will Select Products and Set Category ",SBOProductManagement.driver);
		Thread.sleep(2000);
		selectallprod.click();
		Thread.sleep(2000);
		selectsetcate.click();
		Thread.sleep(2000);
		selectmenscate.click();
		Thread.sleep(5000);
	
	}
	
	public void verifyvalidatnonaddproduct() throws IOException, InterruptedException{
		
		Thread.sleep(2000);
		BaseClass.createalert("User Will Check Validation for "
				+ "1.Product Name "
				+ "2.Product SPU "
				+ "3.Product Price 4."
				+ "Product MSRP 5.Product Categ "
				+ "6.Product Descp "
				+ "7.Product Quantity",SBOProductManagement.driver);
		Thread.sleep(3000);
		Assert.assertEquals("Product Name Validation" , prodnamevalidtn.getText() , "The product name is required.");
		Assert.assertEquals("Product SPU Validation" , prodspuvalidtn.getText() , "The product SPU is required.");
		Assert.assertEquals("Product Price Validation" , prodpricevalidtn.getText() , "Price is required.");
		Assert.assertEquals("Product MSRP Validation" , prodmsrpvalidtn.getText() , "MSRP/Retail Price Must Be Greater Than 0");
		Assert.assertEquals("Product Categ Validation" , prodcatevalidtn.getText() , "Please Select Category");
		Assert.assertEquals("Product Descp Validation" , proddesvalidtn.getText() , "Please fill in the description!");
		Assert.assertEquals("Product Quantity Validation" , prodqunatityvalidtn.getText() , "This field is required.");
		BaseClass.createalert("Validation Done !! All check are Pass !!",SBOProductManagement.driver);
		Thread.sleep(3000);
	}
	
	
	public void enableprodbybatch() throws IOException, InterruptedException{
		BaseClass.createalert("User Will Select Product and Enable it From Batch Setting ",SBOProductManagement.driver);
		Thread.sleep(2000);
		selectprd.click();
		Thread.sleep(2000);
		selectbatchset.click();
		Thread.sleep(2000);
		selenablesale.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(salestatusoneprod, SBOProductManagement.driver);
		System.out.println("Productsalesstatus => " + salestatusoneprod.getText());
		Assert.assertEquals("Productsalesstatus Assertion" ,salestatusoneprod.getText(), "Available");
		Thread.sleep(2000);
		expanprodfirst.click();
		System.out.println("Productskusalesstatus => " + prodskusalesatusfirst.getText());
		Assert.assertEquals("Productskusalesstatus Assertion" ,prodskusalesatusfirst.getText(), "Yes");
		BaseClass.createalert("Validation Done !! Product Enable Successfully",SBOProductManagement.driver);
	}
	
	
	public void checksetcategory() throws IOException, InterruptedException{
		BaseClass.createalert("User Validate Category assign to all products Successfully ",SBOProductManagement.driver);
		Thread.sleep(3000);
		BaseClass.gettablecols(productcolumnslisttable,"Men’s Clothing");
		Thread.sleep(2000);
		BaseClass.createalert("Validation Successfully Category assign to all products Successfully !!",SBOProductManagement.driver);
		Thread.sleep(3000);
	}
	
	
	public void archivedprodbybatch() throws IOException, InterruptedException{
		BaseClass.createalert("User Will Select Product and Archived it From Batch Setting ",SBOProductManagement.driver);
		Thread.sleep(2000);
		selectprd.click();
		Thread.sleep(2000);
		selectbatchset.click();
		Thread.sleep(2000);
		seldisablesale.click();
		Thread.sleep(2000);
		BaseClass.waitForVisibility(salestatusoneprod, SBOProductManagement.driver);
		BaseClass.createalert("Product Disable Successfully",SBOProductManagement.driver);
		Thread.sleep(8000);
		System.out.println("First =>" +productnamefirst.getText() );
		String ProductName = productnamefirst.getText();
		selectprd.click();
		Thread.sleep(2000);
		selectbatchset.click();
		Thread.sleep(2000);
		selarchive.click();
		Thread.sleep(8000);
		BaseClass.waitForVisibility(salestatusoneprod, SBOProductManagement.driver);
		BaseClass.createalert("Product Archieved Successfully",SBOProductManagement.driver);
		prodnameinput.sendKeys(ProductName);
		Thread.sleep(2000);
		showarchivedcheck.click();
		Thread.sleep(200);
		searchproduct.click();
		Thread.sleep(8000);
		BaseClass.waitForVisibility(productnamefirst, SBOProductManagement.driver);
		System.out.println("First =>" +productnamefirst.getText() );
		String ProductNameArchive = productnamefirst.getText();
		Assert.assertEquals("Product Move to Archieved Assertion" ,ProductName, ProductNameArchive);
		BaseClass.createalert("Product Archieved Successfully !! ",SBOProductManagement.driver);
	}
	

	public void usermanagmenttab() throws InterruptedException {
		
		
		BaseClass.waitForVisibility(usermanagmenttab, SBOProductManagement.driver);
		usermanagmenttab.click();
		Thread.sleep(2000);
	}

	public void sellermanagment() throws InterruptedException, IOException {

		BaseClass.createalert("User Will Navigate to Seller Management Module",SBOProductManagement.driver);
		BaseClass.waitForVisibility(sellermanagmenttab, SBOProductManagement.driver);
		Thread.sleep(2000);
		sellermanagmenttab.click();
		
	}

	public void verifysellermanagmentpage() throws InterruptedException, IOException {
		Thread.sleep(3000);
		Assert.assertTrue("User Not able to Seller Management", driver.getPageSource().contains("Seller management"));
		/*selleridfield.sendKeys("1381");
		Thread.sleep(2000);
		sellersearch.click();
		Thread.sleep(2000);
		entersellerbackoffice.click();
		Thread.sleep(5000);
		Assert.assertTrue("User Not able to SBO", driver.getPageSource().contains("Seller"));
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));*/
		Thread.sleep(5000);
		
	}
	
	public void verifysbopage() throws IOException, InterruptedException{
		BaseClass.createalert("User Will move now to SBO ",SBOProductManagement.driver);
		selleridfield.sendKeys("11");
		Thread.sleep(2000);
		sellersearch.click();
		Thread.sleep(2000);
		entersellerbackoffice.click();
		Thread.sleep(5000);
		Assert.assertTrue("User Not able to SBO", driver.getPageSource().contains("Seller"));
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		
	}

	public void importproductbyexcel() throws InterruptedException, IOException {

	
		BaseClass.createalert("User Will Navigate to Import Product For Importing Products ",SBOProductManagement.driver);
		clickimportproduct.click();
		Thread.sleep(2000);
		BaseClass.createalert("User Will check Download Import Excel ",SBOProductManagement.driver);
		BaseClass.deleteexistingfile("import-product-template.xlsx");
		Thread.sleep(2000);
		clickdownloadexcel.click();
		Thread.sleep(6000);
		BaseClass.verifyfileexist("import-product-template.xlsx");
		Thread.sleep(2000);
		BaseClass.movefile("import-product-template.xlsx");
		Thread.sleep(5000);
		BaseClass.writeexcel(importExcelProductfilePath);
		BaseClass.createalert("User Will Now Upload Product Import File ",SBOProductManagement.driver);
		Thread.sleep(5000);
		importexcelproduct.sendKeys(importExcelProductfilePath);
		Thread.sleep(2000);
		importbtn.click();
		Thread.sleep(8000);

	}
	
	public void importproductbynegativeexcel() throws InterruptedException, IOException {

		
		BaseClass.createalert("User Will Navigate to Import Product For Importing Negative Scenarios Products ",SBOProductManagement.driver);
		clickimportproduct.click();
		Thread.sleep(2000);
		BaseClass.createalert("User Will Now Upload Negative Scenario Product Import File ",SBOProductManagement.driver);
		Thread.sleep(5000);
		File file = new File(importExcelNegativeProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");
		Thread.sleep(3000);

		sheet.getRow(1).createCell(2).setCellValue("TestAutomationSKU" + number);
		sheet.getRow(1).createCell(3).setCellValue("878855");
		
		// write the data in excel using output stream
				FileOutputStream outputStream = new FileOutputStream(importExcelNegativeProductfilePath);
				wb.write(outputStream);
				wb.close();
		Thread.sleep(3000);		
		importexcelproduct.sendKeys(importExcelNegativeProductfilePath);
		Thread.sleep(2000);
		importbtn.click();
		Thread.sleep(8000);
		
	}
	
public void importupdateproductbynegativeexcel() throws InterruptedException, IOException {

		
		BaseClass.createalert("User Will Navigate to Import Update Product For Importing Negative Scenarios Products ",SBOProductManagement.driver);
		clickupdateproduct.click();
		Thread.sleep(2000);
		BaseClass.createalert("User Will Now Upload Negative Scenario Update Product File ",SBOProductManagement.driver);
		Thread.sleep(5000);
		File file = new File(importExcelNegativeUpdateProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");
		Thread.sleep(3000);

		sheet.getRow(1).createCell(2).setCellValue("TestAutomationSKU" + number);
		//sheet.getRow(1).createCell(3).setCellValue("878855");
		
		// write the data in excel using output stream
				FileOutputStream outputStream = new FileOutputStream(importExcelNegativeUpdateProductfilePath);
				wb.write(outputStream);
				wb.close();
		Thread.sleep(3000);		
		importexcelproduct.sendKeys(importExcelNegativeUpdateProductfilePath);
		Thread.sleep(2000);
		importbtn.click();
		Thread.sleep(8000);
		
	}
	
	
	
	public void updateproductbyexcel() throws InterruptedException, IOException {
		BaseClass.createalert("User Will Navigate to Update Product For Updating Products ",SBOProductManagement.driver);
		clickupdateproduct.click();
		Thread.sleep(2000);
		BaseClass.createalert("User Will check Download Update Excel ",SBOProductManagement.driver);
		BaseClass.deleteexistingfile("update-product-template.xlsx");
		Thread.sleep(2000);
		clickdownloadupdateexcel.click();
		Thread.sleep(8000);
		BaseClass.verifyfileexist("update-product-template.xlsx");
		Thread.sleep(2000);
		BaseClass.movefile("update-product-template.xlsx");
		Thread.sleep(2000);
		BaseClass.writeexcelupdate(updateExcelProductfilePath);
		BaseClass.createalert("User Will Now Upload Product Import File ",SBOProductManagement.driver);
		Thread.sleep(5000);
		importexcelproduct.sendKeys(updateExcelProductfilePath);
		Thread.sleep(2000);
		importbtn.click();
		Thread.sleep(8000);
	}
	
	
	
	
	
	public void importproductbyaddproduct() throws InterruptedException, IOException {

		
		BaseClass.createalert("User Will Navigate to Add Product ",SBOProductManagement.driver);
		clickaddproduct.click();
		Thread.sleep(2000);
		addproductname.sendKeys(productnam);
		Thread.sleep(2000);
		addproductsku.sendKeys(productSPU);
		Thread.sleep(2000);
		adddefaultprice.sendKeys(productpric);
		Thread.sleep(2000);
		addmsrpprice.sendKeys(msrpprice);
		Thread.sleep(2000);
		adddefaultquantity.sendKeys(defaultquantity);
		Thread.sleep(2000);
		selectrootcat.click();
		Thread.sleep(2000);
		BaseClass.selectdropdownbyvalue(SBOProductManagement.driver,selectrootcat,"3");
		Thread.sleep(3000);
		BaseClass.selectdropdownbyvalue(SBOProductManagement.driver,selectsubcat,"762");
		Thread.sleep(2000);
		BaseClass.selectdropdownbyvalue(SBOProductManagement.driver,selectsubtosubcat,"763");
		Thread.sleep(2000);
		uploadimg.sendKeys(imgpath);
		Thread.sleep(2000);
		adddesciption.sendKeys("Test Automation Maunally created the Product");
		Thread.sleep(2000);
		saveproduct.click();
		Thread.sleep(5000);
	}
	
	
	public void importproductbyaddproductwithnovalue() throws InterruptedException, IOException {
		
		BaseClass.createalert("User Will Navigate to Add Product ",SBOProductManagement.driver);
		clickaddproduct.click();
		Thread.sleep(2000);
		saveproduct.click();
	}

	public void verifyimportproductbyexcel() throws IOException, InterruptedException {

		Thread.sleep(3000);
		BaseClass.createalert("User Will Validated Prouducts Imported Successfully",SBOProductManagement.driver);
		// Create an object of File class to open xlsx file
		File file = new File(importExcelProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");

		//Cell SPU01 = sheet.getRow(1).getCell(0);

		String SPUValue = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(0));

		// objFormulaEvaluator.evaluate(SPU01);

		System.out.println("SPUValue ==> " + SPUValue);

		int i = 5;
		while (i >= 5) {
			driver.navigate().refresh();
			Thread.sleep(6000);
			spufield.clear();
			spufield.sendKeys(SPUValue);
			searchproduct.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

			List<WebElement> rows = producttable;
			int count = rows.size();
			System.out.println("ROW COUNT : " + count);

			if (count >= 2) {
				break;
			}

			i++;

		}
	}
	
	
	public void verifyimportproductnegativebyexcel() throws IOException, InterruptedException {
		Thread.sleep(3000);
		BaseClass.createalert("User Will Download Imported Negative scenario excel",SBOProductManagement.driver);
		int i =0;
		do{
		
			driver.navigate().refresh();
			clickimportproduct.click();
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			Thread.sleep(2000);
			
		  try{
			 boolean importdowloaddisplay = downloadimportexcel.isDisplayed();
			
					if(importdowloaddisplay == true)
							downloadimportexcel.click();
					Thread.sleep(8000);
					break;

		  } catch (NoSuchElementException e){
		    i++;
		  }
		} while(i <= 5);
		

		
		BaseClass.getTheNewestFile(home + "\\Downloads\\", "xlsx");
		
		BaseClass.createalert("User Will Check All Validation MEssage for Negative Prouducts Imported",SBOProductManagement.driver);
		// Create an object of File class to open xlsx file
		File file = new File(importdetailreportExcelNegativeProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("my sheet");


		String GetSKUErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(0));
		System.out.println("Validation for Blanck SKU => " +GetSKUErrorMessage);
		String GetProductErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(0));
		System.out.println("Validation for Blanck Product => " +GetProductErrorMessage);
		String GetCategIDErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(3).getCell(0));
		System.out.println("Validation for Blanck Categ => "+GetCategIDErrorMessage);
		String GetPriceErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(4).getCell(0));
		System.out.println("Validation for Blanck Price => "+GetPriceErrorMessage);
		String GetMSPRErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(5).getCell(0));
		System.out.println("Validation for Blanck MSRP => "+GetMSPRErrorMessage);
		String GetQuantityErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(6).getCell(0));
		System.out.println("Validation for Blanck Quantity => "+GetQuantityErrorMessage);
		String GetPricemoreErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(7).getCell(0));
		System.out.println("Validation for Blanck Price => "+GetPricemoreErrorMessage);
		String GetCurrencyErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(8).getCell(0));
		System.out.println("Validation for Currency => "+GetCurrencyErrorMessage);
		String GetDescpErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(9).getCell(0));
		System.out.println("Validation for Blanck Desc => "+GetDescpErrorMessage);
		String GetImagErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(10).getCell(0));
		System.out.println("Validation for Blanck Imag => "+GetImagErrorMessage);
		String GetMarkErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(11).getCell(0));
		System.out.println("Validation for Blanck Market/Shipping => "+GetMarkErrorMessage);
		String GetPriceZeroErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(12).getCell(0));
		System.out.println("Validation for Zero Price=> "+GetPriceZeroErrorMessage);
		String GetForbitnameErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(13).getCell(0));
		System.out.println("Validation for Forbitten in Name=> "+GetForbitnameErrorMessage);
		String GetForbitdescriptnErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(14).getCell(0));
		System.out.println("Validation for Forbitten in Description=> "+GetForbitdescriptnErrorMessage);
		String GetincortcategidErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(15).getCell(0));
		System.out.println("Validation for Incorrect Category ID=> "+GetincortcategidErrorMessage);
		String GetincortcategidstringErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(16).getCell(0));
		System.out.println("Validation for String Category ID=> "+GetincortcategidstringErrorMessage);
		
		String GetuniquespuErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(17).getCell(0));
		System.out.println("Validation for Unique SPU=> "+GetuniquespuErrorMessage);
		
		String GetuniquespuErrorMessage01 = new DataFormatter().formatCellValue(sheet.getRow(18).getCell(0));
		System.out.println("Validation for Unique SPU=> "+GetuniquespuErrorMessage01);
		
																			
		Assert.assertEquals("SKU Assertion Check " , GetSKUErrorMessage , "[\"\\\"Unique Property SKU\\\" must be a string\"]");
		Assert.assertEquals("Product Assertion Check" ,GetProductErrorMessage,"[\"\\\"Product name\\\" must be a string\"]");
		Assert.assertEquals("CtrgID Assertion Check", GetCategIDErrorMessage,"[\"\\\"Category ID\\\" must be a string\"]");
		Assert.assertEquals("Price Assertion Check", GetPriceErrorMessage,"[\"\\\"Price\\\" must be a number\"]");
		Assert.assertEquals("MSRP Assertion Check", GetMSPRErrorMessage,"[\"\\\"MSRP\\\" must be a number\", \"\\\"Price\\\" limit references \\\"ref:msrp\\\" which must be a number\"]");
		Assert.assertEquals("Quatity Assertion Check", GetQuantityErrorMessage,"[\"\\\"Quantity\\\" must be a number\"]");
		Assert.assertEquals("Price More Assertion Check", GetPricemoreErrorMessage,"[\"\\\"Price\\\" must be less than or equal to ref:msrp\"]");
		Assert.assertEquals("Currency Assertion Check", GetCurrencyErrorMessage,"[\"\\\"currency\\\" must be [USD]\"]");
		Assert.assertEquals("Desc Assertion Check", GetDescpErrorMessage,"[\"\\\"Description\\\" must be a string\"]");
		Assert.assertEquals("Image Assertion Check", GetImagErrorMessage,"[\"\\\"Main Image Url\\\" must be a string\"]");
		Assert.assertEquals("Market Assertion Check", GetMarkErrorMessage,"[\"\\\"marketCode\\\" must be a string\", \"\\\"shippingFee\\\" must be a string\"]");
		Assert.assertEquals("Price Assertion Check", GetPriceZeroErrorMessage,"[\"\\\"Price\\\" must be a number\"]");
		Assert.assertEquals("Forbitten In Name Assertion Check", GetForbitnameErrorMessage,"[\"\\\"name\\\" failed custom validation because contains illegal keywords: Sex\"]");
		Assert.assertEquals("Forbitten In Description Assertion Check", GetForbitdescriptnErrorMessage,"[\"\\\"description\\\" failed custom validation because contains illegal keywords: Sex\"]");
		Assert.assertEquals("Invalid Category Check", GetincortcategidErrorMessage,"[\"\\\"Category ID\\\" failed custom validation because category id 878855 invalid.\"]");
		Assert.assertEquals("String Category Check", GetincortcategidstringErrorMessage,"[\"\\\"Category ID\\\" failed custom validation because category id String invalid.\"]");
		Assert.assertEquals("String Unique SPU Check", GetuniquespuErrorMessage,"[\"SPU and SKU pairs must be unique\", \"Property value must be unique\"]");
		Assert.assertEquals("String Unique SPU Check", GetuniquespuErrorMessage01,"[\"SPU and SKU pairs must be unique\", \"Property value must be unique\"]");
		

		
	}
	
	public void verifyimportupdateproductnegativebyexcel() throws IOException, InterruptedException {
		Thread.sleep(3000);
		BaseClass.createalert("User Will Download Imported Update Negative scenario excel",SBOProductManagement.driver);
		int i =0;
		do{
		
			driver.navigate().refresh();
			clickupdateproduct.click();
			((JavascriptExecutor) driver).executeScript("scroll(0,300)");
			Thread.sleep(2000);
			
		  try{
			 boolean importdowloaddisplay = downloadimportexcel.isDisplayed();
			
					if(importdowloaddisplay == true)
							downloadimportexcel.click();
					Thread.sleep(8000);
					break;

		  } catch (NoSuchElementException e){
		    i++;
		  }
		} while(i <= 5);
		

		
		BaseClass.getTheNewestFile(home + "\\Downloads\\", "xlsx");
		
		BaseClass.createalert("User Will Check All Validation Message for Update Negative Prouducts Imported",SBOProductManagement.driver);
		// Create an object of File class to open xlsx file
		File file = new File(importdetailreportExcelNegativeProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("my sheet");


		String GetSKUErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(0));
		System.out.println("Validation for Blanck SKU => " +GetSKUErrorMessage);
		String GetPriceErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(0));
		System.out.println("Validation for Blanck Price => "+GetPriceErrorMessage);
		String GetCurrencyErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(3).getCell(0));
		System.out.println("Validation for Currency => "+GetCurrencyErrorMessage);
		String GetImagSizeErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(4).getCell(0));
		System.out.println("Validation for Invalid Size Imag => "+GetImagSizeErrorMessage);
		String GetSalesStatusErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(5).getCell(0));
		System.out.println("Validation for Sales Status=> "+GetSalesStatusErrorMessage);
		String GetincortcategidErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(6).getCell(0));
		System.out.println("Validation for Incorrect Category ID=> "+GetincortcategidErrorMessage);
		String GetImagErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(7).getCell(0));
		System.out.println("Validation for Blanck Imag => "+GetImagErrorMessage);
		String GetForbitnameErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(8).getCell(0));
		System.out.println("Validation for Forbitten in Name=> "+GetForbitnameErrorMessage);
		String GetForbitdescriptnErrorMessage = new DataFormatter().formatCellValue(sheet.getRow(9).getCell(0));
		System.out.println("Validation for Forbitten in Description=> "+GetForbitdescriptnErrorMessage);
		
																			
		Assert.assertEquals("SKU Assertion Check " , GetSKUErrorMessage , "[\"\\\"Unique Property SKU\\\" must be a string\"]");
		Assert.assertEquals("Price Assertion Check", GetPriceErrorMessage,"[\"\\\"Price\\\" must be less than or equal to ref:msrp\"]");
		Assert.assertEquals("Currency Assertion Check", GetCurrencyErrorMessage,"[\"\\\"currency\\\" must be [USD]\"]");
		//Assert.assertEquals("Image Assertion Check", GetImagErrorMessage,"[\"\\\"Main Image Url\\\" must be a valid uri\"]");
		Assert.assertEquals("Image Size Assertion Check", GetImagSizeErrorMessage,"[\"\\\"Size Guide Url\\\" must be a valid uri\"]");
		Assert.assertEquals("Sales Status", GetSalesStatusErrorMessage,"[\"\\\"Sale Status\\\" must be one of [1, 2, null]\"]");
		Assert.assertEquals("Invalid Category Check", GetincortcategidErrorMessage,"[\"\\\"Category ID\\\" failed custom validation because category id 87777 invalid.\"]");
		Assert.assertEquals("Forbitten In Name Assertion Check", GetForbitnameErrorMessage,"[\"\\\"name\\\" failed custom validation because contains illegal keywords: Sex\"]");
		Assert.assertEquals("Forbitten In Description Assertion Check", GetForbitdescriptnErrorMessage,"[\"\\\"description\\\" failed custom validation because contains illegal keywords: Sex\"]");

	
	}


	

	private boolean waitForelementclicable(WebElement downloadimportexcel2, WebDriver driver2) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifymultivarientimportproductbyexcel() throws IOException, InterruptedException {

		Thread.sleep(3000);
		BaseClass.createalert("User Will Validated MultiVarient Prouducts Imported Successfully",SBOProductManagement.driver);
		// Create an object of File class to open xlsx file
		File file = new File(importExcelProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");

		//Cell SPU01 = sheet.getRow(1).getCell(0);

		String MultiSPUValue = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(0));

		// objFormulaEvaluator.evaluate(SPU01);

		System.out.println("SPUValue ==> " + MultiSPUValue);

		int i = 5;
		while (i >= 5) {
			driver.navigate().refresh();
			Thread.sleep(6000);
			spufield.clear();
			spufield.sendKeys(MultiSPUValue);
			searchproduct.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

			List<WebElement> rows = producttable;
			int count = rows.size();
			System.out.println("ROW COUNT : " + count);

			if (count >= 2) {
				break;
			}

			i++;

		}
	}
	
	public void verifyimportupdateproductbyexcel() throws IOException, InterruptedException {

		Thread.sleep(3000);
		BaseClass.createalert("User Will Validated Prouducts Update Imported Successfully",SBOProductManagement.driver);
		// Create an object of File class to open xlsx file
		File file = new File(updateExcelProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");

		//Cell SPU01 = sheet.getRow(1).getCell(0);

		String SPUUdateValue = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(0));

		// objFormulaEvaluator.evaluate(SPU01);

		System.out.println("SPUValue ==> " + SPUUdateValue);

		int i = 5;
		while (i <= 5) {
			driver.navigate().refresh();
			Thread.sleep(6000);
			spufield.clear();
			spufield.sendKeys(SPUUdateValue);
			searchproduct.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

			List<WebElement> rows = producttable;
			int count = rows.size();
			System.out.println("ROW COUNT : " + count);

			if (count >= 2) {
				break;
			}

			i++;

		}
	}
	
	public void verifymultiimportproductvalues() throws InterruptedException, IOException {
		Thread.sleep(2000);
		File file = new File(importExcelProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");

		//Cell ProductName01 = sheet.getRow(1).getCell(1);

		String ProductSKU01 = new DataFormatter().formatCellValue(sheet.getRow(3).getCell(1));
		String ProductName01 = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(2));
		String ProductPrice01 = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(8));
		String ProductQuantity01 = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(11));
	
		String ProductSKU02 = new DataFormatter().formatCellValue(sheet.getRow(2).getCell(1));
		String ProductName02 = new DataFormatter().formatCellValue(sheet.getRow(3).getCell(2));
		String ProductPrice02 = new DataFormatter().formatCellValue(sheet.getRow(3).getCell(8));
		String ProductQuantity02 = new DataFormatter().formatCellValue(sheet.getRow(3).getCell(11));
		

		// objFormulaEvaluator.evaluate(SPU01);

		System.out.println("ProductName ==> " + ProductName01);
		System.out.println("ProductName ==> " + productname.getText());
		System.out.println("ProductPrice ==> " + productprice.getText());
		System.out.println("ProductPrice ==> " + ProductPrice01);
		System.out.println("ProductQuantity ==> " + ProductQuantity01);
		System.out.println("ProductQunatity ==> " + productquantity.getText());
		System.out.println("ProductSalesStatus ==> " + salesStatus.getText());
		System.out.println("ProductCategory ==> " + productcategory.getText());
		
		
		Assert.assertEquals(productname.getText(), ProductName01);
		Assert.assertEquals(productprice.getText(), ProductPrice01 +".00");
		Assert.assertEquals(Integer.parseInt(productquantity.getText()), Integer.parseInt(ProductQuantity01) + 10);
		Assert.assertEquals(productcategory.getText(), "Men’s Clothing");
		Assert.assertEquals(salesStatus.getText(), "Available");
		
                         
		
		productexpand.click();
		
		System.out.println("ProductSKU ==> " + productsku.getText());
		System.out.println("ProductSKU01 ==> " + ProductSKU01);
		System.out.println("ProductSalesStatus ==> " + productskusalesstatus.getText());
		
		
		Assert.assertEquals(productsku.getText(), ProductSKU01);
		Assert.assertEquals(productskuprice.getText(), ProductPrice01+".00");
		Assert.assertEquals(productskusalesstatus.getText(), "Yes");
		Assert.assertEquals(productskuquantity.getText(), ProductQuantity01);
		
		
		System.out.println("ProductSKU01 ==> " + productsku01.getText());
		System.out.println("ProductSKU02 ==> " + ProductSKU02);
		System.out.println("ProductSalesStatus ==> " + productskusalesstatus01.getText());
		
		
		Assert.assertEquals(productsku01.getText(), ProductSKU02);
		Assert.assertEquals(productskuprice01.getText(), ProductPrice02+".00");
		Assert.assertEquals(productskusalesstatus01.getText(), "Yes");
		Assert.assertEquals(productskuquantity01.getText(), ProductQuantity02);
		
		
		
		
		BaseClass.createalert("Validation Done !! Products Imported Successfully :) ",SBOProductManagement.driver);
		
		
		
	}
	
	public void verifyimportproductvalues() throws InterruptedException, IOException {
		Thread.sleep(2000);
		File file = new File(importExcelProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");

		//Cell ProductName01 = sheet.getRow(1).getCell(1);

		String ProductSKU = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(1));
		String ProductName = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(2));
		String ProductPrice = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(8));
		String ProductQuantity = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(11));
	
		

		// objFormulaEvaluator.evaluate(SPU01);

		System.out.println("ProductName ==> " + ProductName);
		System.out.println("ProductName ==> " + productname.getText());
		System.out.println("ProductPrice ==> " + productprice.getText());
		System.out.println("ProductPrice ==> " + ProductPrice);
		System.out.println("ProductQuantity ==> " + ProductQuantity);
		System.out.println("ProductQunatity ==> " + productquantity.getText());
		System.out.println("ProductSalesStatus ==> " + salesStatus.getText());
		System.out.println("ProductCategory ==> " + productcategory.getText());
		
		
		Assert.assertEquals(productname.getText(), ProductName);
		Assert.assertEquals(productprice.getText(), ProductPrice +".00");
		Assert.assertEquals(productquantity.getText(), ProductQuantity);
		Assert.assertEquals(productcategory.getText(), "Men’s Clothing");
		Assert.assertEquals(salesStatus.getText(), "Available");
		

                                   
		
		productexpand.click();
		
		System.out.println("ProductSKU ==> " + productsku.getText());
		System.out.println("ProductSKU ==> " + ProductSKU);
		System.out.println("ProductSalesStatus ==> " + productskusalesstatus.getText());
		
		
		Assert.assertEquals(productsku.getText(), ProductSKU);
		Assert.assertEquals(productskuprice.getText(), ProductPrice+".00");
		Assert.assertEquals(productskusalesstatus.getText(), "Yes");
		Assert.assertEquals(productskuquantity.getText(), ProductQuantity);
		
		BaseClass.createalert("Validation Done !! Products Imported Successfully :) ",SBOProductManagement.driver);
		
		
		
	}
	
	
	public void verifyimportupdateproductvalues() throws InterruptedException, IOException {
		Thread.sleep(2000);
		File file = new File(updateExcelProductfilePath);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFFormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator((XSSFWorkbook) wb);
		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");

		//Cell ProductName01 = sheet.getRow(1).getCell(1);

		String ProductUpdateSKU = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(1));
		String ProductUpdateName = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(2));
		String ProductUpdatePrice = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(8));
		String ProductUpdateQuantity = new DataFormatter().formatCellValue(sheet.getRow(1).getCell(11));
	

		// objFormulaEvaluator.evaluate(SPU01);

		System.out.println("ProductUpdateName ==> " + ProductUpdateName);
		System.out.println("ProductUpdateName ==> " + productname.getText());
		System.out.println("ProductUpdatePrice ==> " + productprice.getText());
		System.out.println("ProductUpdatePrice ==> " + ProductUpdatePrice);
		System.out.println("ProductUpdateQuantity ==> " + ProductUpdateQuantity);
		System.out.println("ProductUpdateQuantity ==> " + productquantity.getText());
		System.out.println("ProductSalesStatus ==> " + salesStatus.getText());
		System.out.println("ProductCategory ==> " + productcategory.getText());
		
		
		Assert.assertEquals(productname.getText(), ProductUpdateName);
		Assert.assertEquals(productprice.getText(), ProductUpdatePrice +".00");
		Assert.assertEquals(productquantity.getText(), ProductUpdateQuantity);
		Assert.assertEquals(productcategory.getText(), "Women’s Clothing");
		Assert.assertEquals(salesStatus.getText(), "Available");
		

                                   
		
		productexpand.click();
		
		System.out.println("ProductUpdateSKU ==> " + productsku.getText());
		System.out.println("ProductUpdateSKU ==> " + ProductUpdateSKU);
		System.out.println("ProductSalesStatus ==> " + productskusalesstatus.getText());
		
		
		Assert.assertEquals(productsku.getText(), ProductUpdateSKU);
		Assert.assertEquals(productskuprice.getText(), ProductUpdatePrice +".00");
		Assert.assertEquals(productskusalesstatus.getText(), "Yes");
		Assert.assertEquals(productskuquantity.getText(), ProductUpdateQuantity);
		
		BaseClass.createalert("Validation Done !! Products Upated By Imported Successfully :) ",SBOProductManagement.driver);
		
		
		
	}
	
	
	public void verifymanualaddproductvalues() throws InterruptedException, IOException {
		Thread.sleep(2000);
		int i = 5;
		while (i >= 5) {
			driver.navigate().refresh();
			Thread.sleep(6000);
			spufield.clear();
			spufield.sendKeys(productSPU);
			//spufield.sendKeys("TestAutomationManualSPU6784595223");
			
			searchproduct.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

			List<WebElement> rows = producttable;
			int count = rows.size();
			System.out.println("ROW COUNT : " + count);

			if (count >= 2) {
				break;
			}

			i++;

		}
		
		System.out.println("ProductSKU ==> " + productname.getText());
		System.out.println("ProductPrice ==> " +productprice.getText());
		System.out.println("ProductQuantity ==> " + productquantity.getText());
		System.out.println("ProductCategory ==> " + productcategory.getText());
		System.out.println("ProductSalesStatus ==> " + salesStatus.getText());
		
		Assert.assertEquals("Productname Assertion", productname.getText(), productnam);
		Assert.assertEquals("Productprice Assertion",productprice.getText(), productpric +".00");
		Assert.assertEquals("Productquantity Assertion",productquantity.getText(), defaultquantity);
		Assert.assertEquals("Productcategory Assertion",productcategory.getText(), "Phones & Accessories");
		Assert.assertEquals("Productsales Assertion",salesStatus.getText(), "Available");
		
		productexpand.click();
		Thread.sleep(2000);
		
		System.out.println("ProductSKU ==> " + productsku.getText());
		System.out.println("ProductSalesStatus ==> " + productskusalesstatus.getText());
		
		
		Assert.assertEquals("Productsku Assertion" , productsku.getText(), productSPU);
		Assert.assertEquals("Productskuprice Assertion" ,productskuprice.getText(), productpric+".00");
		Assert.assertEquals("Productskusalesstatus Assertion" ,productskusalesstatus.getText(), "Yes");
		Assert.assertEquals("Productquantity Assertion" ,productskuquantity.getText(), defaultquantity);
		
	}
	
	public void manualEditproductvalues() throws InterruptedException, IOException {
		Thread.sleep(2000);
		editproduct.click();
		Thread.sleep(2000);
		addproductname.clear();
		Thread.sleep(2000);
		addproductname.sendKeys(productnamedit);
		Thread.sleep(2000);
		editdefaultprice.clear();
		Alert alert = HomePage.driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		editdefaultprice.sendKeys(productpricedit);
		Thread.sleep(2000);
		addmsrpprice.clear();
		Alert alert1 = HomePage.driver.switchTo().alert();
		alert1.accept();
		addmsrpprice.sendKeys(msrppriceedit);
		Thread.sleep(2000);
		adddefaultquantity.clear();
		adddefaultquantity.sendKeys(defaultquantityedit);
		Thread.sleep(2000);
		selectrootcat.click();
		Thread.sleep(2000);
		BaseClass.selectdropdownbyvalue(SBOProductManagement.driver,selectrootcat,"2");
		Thread.sleep(3000);
		BaseClass.selectdropdownbyvalue(SBOProductManagement.driver,selectsubcat,"715");
		Thread.sleep(2000);
		BaseClass.selectdropdownbyvalue(SBOProductManagement.driver,selectsubtosubcat,"716");
		Thread.sleep(2000);
		uploadimg.sendKeys(imgpath);
		Thread.sleep(2000);
		adddesciption.clear();
		adddesciption.sendKeys("Test Automation Edit Product Details");
		Thread.sleep(2000);
		saveproduct.click();
		Thread.sleep(5000);
	
	}
	
	public void verifymanualeditproductvalues() throws InterruptedException, IOException {
		Thread.sleep(2000);
		int i = 5;
		while (i >= 5) {
			driver.navigate().refresh();
			Thread.sleep(6000);
			spufield.clear();
			spufield.sendKeys(productSPU);
			//spufield.sendKeys("TestAutomationManualSPU6784595223");
			
			searchproduct.click();
			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript("scroll(0,1000)");

			List<WebElement> rows = producttable;
			int count = rows.size();
			System.out.println("ROW COUNT : " + count);

			if (count >= 2) {
				break;
			}

			i++;

		}
		
		System.out.println("ProductSKUEdit ==> " + productname.getText());
		System.out.println("ProductPriceEdit ==> " +productprice.getText());
		System.out.println("ProductQuantityEdit ==> " + productquantity.getText());
		System.out.println("ProductCategoryEdit ==> " + productcategory.getText());
		System.out.println("ProductSalesStatusEdit ==> " + salesStatus.getText());
		
		Assert.assertEquals("Productnameedit Assertion", productname.getText(), productnamedit);
		Assert.assertEquals("Productpriceedit Assertion",productprice.getText(), productpricedit +".00");
		Assert.assertEquals("Productquantityedit Assertion",productquantity.getText(), defaultquantityedit);
		Assert.assertEquals("Productcategoryedit Assertion",productcategory.getText(), "Men’s Clothing");
		Assert.assertEquals("Productsales Assertion",salesStatus.getText(), "Available");
		
		productexpand.click();
		Thread.sleep(2000);
		
		System.out.println("ProductSKU ==> " + productsku.getText());
		System.out.println("ProductSalesStatus ==> " + productskusalesstatus.getText());
		
		
		Assert.assertEquals("Productsku Assertion" , productsku.getText(), productSPU);
		Assert.assertEquals("Productskupriceedit Assertion" ,productskuprice.getText(), productpricedit+".00");
		Assert.assertEquals("Productskusalesstatusedit Assertion" ,productskusalesstatus.getText(), "Yes");
		Assert.assertEquals("Productquantityedit Assertion" ,productskuquantity.getText(), defaultquantityedit);
		
	}
	
	
}
