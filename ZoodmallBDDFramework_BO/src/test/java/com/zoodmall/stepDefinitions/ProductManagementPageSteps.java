package com.zoodmall.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.HomePage;
import com.zoodmall.pageObjects.ProductManagementPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductManagementPageSteps {
	
	TestContext testContext;
	ProductManagementPage productmanagement;
	
	public ProductManagementPageSteps(TestContext context) {
		testContext = context;
		productmanagement = testContext.getPageObjectManager().getProductManagementPage();
	}
	
	
	@When("^user click on product management tab$")
	public void user_click_on_product_management_tab() throws IOException, InterruptedException {
		productmanagement.productmanagementpage();

	}
	
	@Then("^product management page open successfully$")
	public void product_management_page_open_successfully() throws InterruptedException, IOException  {
		productmanagement.verifyproductmanagmentpage();

	}
	
	@And("^assign root category to test products$")
	public void assign_root_category_to_test_products() throws InterruptedException, IOException  {
		productmanagement.assigncategorytoproduct();

	}
	
	@Then("^verify root category assign to product successfully$")
	public void verify_root_category_assign_to_product_successfully() throws InterruptedException, IOException  {
		productmanagement.verifyassigncategory();

	}
	
	@And("^assign sub level category to test products$")
	public void assign_sub_level_category_to_test_products() throws InterruptedException, IOException  {
		productmanagement.assignsublevelcategorytoproduct();

	}
	
	@Then("^verify sub level category assign to product successfully$")
	public void verify_sub_level_category_assign_to_product_successfully() throws InterruptedException, IOException  {
		productmanagement.verifysublevelassigncategory();

	}
	
	@And("^assign sub to sub level category to test products$")
	public void assign_sub_to_sub_level_category_to_test_products() throws InterruptedException, IOException  {
		productmanagement.assignsubtosublevelcategorytoproduct();

	}
	
	@Then("^verify sub to sub level category assign to product successfully$")
	public void verify_sub_to_sub_level_category_assign_to_product_successfully() throws InterruptedException, IOException  {
		productmanagement.verifysubtosublevelassigncategory();

	}
	
	
	


	
}