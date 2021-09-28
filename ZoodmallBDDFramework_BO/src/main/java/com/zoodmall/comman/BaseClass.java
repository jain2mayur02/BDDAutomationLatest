package com.zoodmall.comman;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	static WebDriver driver;

	static String movefiletopath = System.getProperty("user.dir")
			+ "\\configs\\TestDataExcel\\import-product-template.xlsx";
	static long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
	static long updatenumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
	
	 static boolean colunvaluematch = false;

	public BaseClass(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	public static void selectdate(WebDriver driverclass,List<WebElement> datepicker,Integer PromoDayDate) 
	{
	
	 List<WebElement> columns=datepicker;
	 for (WebElement cell: columns){
	    if (cell.getText().equals(PromoDayDate.toString())){
	       cell.click();
	       break;
	  }
	    
	 }
}
	
	

	
	

	public static void selectdropdown(WebDriver driverclass, WebElement dealofthedaymrkdropdwn, String dropdowntxt) {
		Select dropdownobj = new Select(dealofthedaymrkdropdwn);
		dropdownobj.selectByVisibleText(dropdowntxt);
		// dropdownobj.selectByValue(byvalue);
		// dropdownobj.selectByIndex(byindex);

	}
	
	public static void selectdropdownbyvalue(WebDriver driverclass, WebElement dealofthedaymrkdropdwn, String dropdownvalue) {
		Select dropdownobj = new Select(dealofthedaymrkdropdwn);
		dropdownobj.selectByValue(dropdownvalue);


	}
	
	
	public static void movehover(WebDriver driverclass, WebElement dealofthedaymrkdropdwn)
	{	
	Actions action = new Actions(driverclass);
	action.moveToElement(dealofthedaymrkdropdwn).perform();
	
	}

	public static String deleteexistingfile(String filename) {

		String home = System.getProperty("user.home");
		String file_name = filename;
		String file_with_location = home + "\\Downloads\\" + file_name;
		System.out.println("Navigate to File Location ===========================" + home + "\\Downloads\\" + file_name);
		File file = new File(file_with_location);
		if (file.exists()) {
			System.out.println(file_with_location + " is present");
			file.delete();
				System.out.println("file deleted");
			
		} else {
			System.out.println(file_with_location + " is not present");
		}
		return file_with_location;

	}

	public static String verifyfileexist(String filename) {
		String home = System.getProperty("user.home");
		String file_name = filename;
		String file_with_location = home + "\\Downloads\\" + file_name;
		System.out
				.println("Navigate to File Location ===========================" + home + "\\Downloads\\" + file_name);
		File file = new File(file_with_location);
		if (file.exists()) {
			System.out.println(file_with_location + " is present");
		} else {
			Assert.fail("File Not downloaded successfully");
		}
		return file_with_location;

	}

	public static void movefile(String filename) {
		String home = System.getProperty("user.home");
		String file_name = filename;
		//String file_name = "import-product-template.xlsx";
		String movefiletopath = System.getProperty("user.dir")
				+ "\\configs\\TestDataExcel\\"+file_name;
		File from_file = new File(home + "\\Downloads\\" + file_name);
		File to_file = new File(movefiletopath);

		if (to_file.exists()) {
			System.out.println(to_file + " is present");
			if (to_file.delete()) {
				System.out.println("file deleted");
				from_file.renameTo(to_file);
				System.out.println("Successfully moved file");

			}
		} else {
			from_file.renameTo(to_file);
			System.out.println("Successfully moved file");
		}
	}

	public static void waitForVisibility(WebElement element, WebDriver driverclass) throws Error {
		new WebDriverWait(driverclass, 10).until(ExpectedConditions.visibilityOf(element));

	}

	public static Boolean waitForelementclicable(WebElement element, WebDriver driverclass) throws Error {
		new WebDriverWait(driverclass, 10).until(ExpectedConditions.elementToBeClickable(element));
		return true;
	}

	public static void removereadonlyattr(WebElement element, WebDriver driverclass) {
		JavascriptExecutor js1 = (JavascriptExecutor) driverclass;
		js1.executeScript("arguments[0].removeAttribute('readonly','readonly')", element);

	}
	

	

	public static void writeexcel(String importexcelfile) throws IOException, InterruptedException {

		// Create an object of File class to open xlsx file
		File file = new File(importexcelfile);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");
		Thread.sleep(3000);
		
		//sheet.removeRow(sheet.getRow(3));
		sheet.removeRow(sheet.getRow(4));
		sheet.removeRow(sheet.getRow(5));
		sheet.removeRow(sheet.getRow(6));

		sheet.getRow(1).createCell(0).setCellValue(number);
		sheet.getRow(1).createCell(1).setCellValue("TestAutomationSKU" + number);
		sheet.getRow(1).createCell(2).setCellValue("TestAutomationProduct" + number);
		sheet.getRow(1).createCell(3).setCellValue("2");
		sheet.getRow(1).createCell(8).setCellValue("15");
		sheet.getRow(1).createCell(10).setCellValue("USD");
		sheet.getRow(1).createCell(14).setCellValue("Automation Description addedd");
		sheet.getRow(1).createCell(34).setCellValue("UZ");
		sheet.getRow(1).createCell(35).setCellValue("12");

		sheet.getRow(2).createCell(0).setCellValue(number + "1");
		sheet.getRow(2).createCell(1).setCellValue("TestAutomationSKU01" + number + "||BLACK");
		sheet.getRow(2).createCell(2).setCellValue("TestAutomationProduct01" + number);
		sheet.getRow(2).createCell(3).setCellValue("2");
		sheet.getRow(2).createCell(7).setCellValue("L||BLACK");
		sheet.getRow(2).createCell(8).setCellValue("15");
		sheet.getRow(2).createCell(10).setCellValue("USD");
		sheet.getRow(2).createCell(14).setCellValue("Automation Description addedd Multivarient");
		sheet.getRow(2).createCell(15).setCellValue("https://i.ebayimg.com/images/g/iIkAAOSwvjdZPzla/s-l1600.jpg");
		sheet.getRow(2).createCell(34).setCellValue("UZ");
		sheet.getRow(2).createCell(35).setCellValue("12");
		
		sheet.getRow(3).createCell(0).setCellValue(number + "1");
		sheet.getRow(3).createCell(1).setCellValue("TestAutomationSKU01" + number + "||WHITE");
		sheet.getRow(3).createCell(2).setCellValue("TestAutomationProduct01" + number);
		sheet.getRow(3).createCell(3).setCellValue("2");
		sheet.getRow(3).createCell(7).setCellValue("L||WHITE");
		sheet.getRow(3).createCell(8).setCellValue("15");
		sheet.getRow(3).createCell(10).setCellValue("USD");
		sheet.getRow(3).createCell(14).setCellValue("Automation Description addedd Multivarient");
		sheet.getRow(3).createCell(15).setCellValue("https://i.ebayimg.com/images/g/iIkAAOSwvjdZPzla/s-l1600.jpg");
		sheet.getRow(3).createCell(34).setCellValue("UZ");
		sheet.getRow(3).createCell(35).setCellValue("12");

		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream(importexcelfile);
		wb.write(outputStream);
		wb.close();
	}
	
	public static void writeexcelupdate(String updateexcelfile) throws IOException, InterruptedException {
		File file = new File(updateexcelfile);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");
		Thread.sleep(3000);

		sheet.removeRow(sheet.getRow(3));
		sheet.removeRow(sheet.getRow(4));
		
		
		sheet.getRow(1).createCell(0).setCellValue(number);
		sheet.getRow(1).createCell(1).setCellValue("TestAutomationSKU" + number);
		sheet.getRow(1).createCell(2).setCellValue("TestAutomationProductUpdate" + number);
		sheet.getRow(1).createCell(3).setCellValue("1");
		sheet.getRow(1).createCell(8).setCellValue("16");
		sheet.getRow(1).createCell(10).setCellValue("USD");
		sheet.getRow(1).createCell(11).setCellValue("50");
		sheet.getRow(1).createCell(35).setCellValue("UZ");
		sheet.getRow(1).createCell(36).setCellValue("14");

		sheet.getRow(2).createCell(0).setCellValue(number + "1");
		sheet.getRow(2).createCell(1).setCellValue("TestAutomationSKU01" + number);
		sheet.getRow(2).createCell(2).setCellValue("TestAutomationProduct01Update" + number);
		sheet.getRow(2).createCell(3).setCellValue("1");
		sheet.getRow(2).createCell(8).setCellValue("16");
		sheet.getRow(2).createCell(10).setCellValue("USD");
		sheet.getRow(2).createCell(11).setCellValue("50");
		sheet.getRow(2).createCell(15).setCellValue("Automation Update Description addedd");
		sheet.getRow(2).createCell(16).setCellValue("https://i.ebayimg.com/images/g/iIkAAOSwvjdZPzla/s-l1600.jpg");
		sheet.getRow(2).createCell(35).setCellValue("UZ");

		// write the data in excel using output stream
		FileOutputStream outputStream = new FileOutputStream(updateexcelfile);
		wb.write(outputStream);
		wb.close();
	}
	
	public static void readexcel(String importexcelfile) throws IOException {
		

		// Create an object of File class to open xlsx file
		File file = new File(importexcelfile);

		// Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		// creating a Sheet object using the sheet Name
		XSSFSheet sheet = wb.getSheet("Template");
		
		sheet.getRow(1).getCell(1);
		sheet.getRow(2).getCell(1);
		
	
	}
	
	public static void createalert(String alertmessage,WebDriver driverclass) throws IOException, InterruptedException {
		
	
		JavascriptExecutor jse=(JavascriptExecutor)driverclass;
		jse.executeScript("window.confirm('"+alertmessage+"')");
		Thread.sleep(5000);
		Alert alert = driverclass.switchTo().alert();
		alert.accept();
			
		
	}
	

	public static void  getTheNewestFile(String filePath, String ext) {
	
		String home = System.getProperty("user.home");
	    File theNewestFile = null;
	    File dir = new File(filePath);
	    FileFilter fileFilter = new WildcardFileFilter("*." + ext);
	    File[] files = dir.listFiles(fileFilter);
	    if (files.length > 0) {
	        /** The newest file comes first **/
	        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_REVERSE);
	        theNewestFile = files[0];
	        System.out.println("File that import and move " +files[0] );
	        String movefiletopath = System.getProperty("user.dir")
					+ "\\configs\\TestDataExcel\\"+"import-negativefile.xlsx";
	        
	        File to_file = new File(movefiletopath);
	        
	        if (to_file.exists()) {
				System.out.println(to_file + " is present");
				if (to_file.delete()) {
					System.out.println("file deleted");
					files[0].renameTo(to_file);
					System.out.println("Successfully moved file");

				}
			} else {
				files[0].renameTo(to_file);
				System.out.println("Successfully moved file");
			}
	        
	        
	      
	    }
	}
	
		
	
	public static void gettablecols(List<WebElement> colselement, String categoryname) throws IOException, InterruptedException {
	
		List<WebElement> cols = colselement;
		System.out.println("Total Products ==>" +  cols.size());
		for(int j=0; j<cols.size(); j++) {
        String ColsValue = cols.get(j).getText().trim();
    	System.out.println(cols.get(j).getText().trim());
    	Assert.assertEquals(ColsValue, categoryname);
  
		
     /* if(ColsValue.equals(categoryname)){
        	colunvaluematch = true;
}	    
        else 
        	 break;*/
}	
	}

}
