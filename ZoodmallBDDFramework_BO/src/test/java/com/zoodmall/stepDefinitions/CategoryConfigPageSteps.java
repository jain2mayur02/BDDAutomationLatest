package com.zoodmall.stepDefinitions;

import java.io.IOException;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.CategoryConfigPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoryConfigPageSteps {
	
	TestContext testContext;
	CategoryConfigPage categoryconfig;

	public CategoryConfigPageSteps(TestContext context) throws InterruptedException {
		testContext = context;
		categoryconfig = testContext.getPageObjectManager().getCategoryConfigPage();
	}
	

	@When("^user click on category config$")
	public void user_click_on_category_config() throws IOException, InterruptedException {
		categoryconfig.categoryconfigpage();

	}
	
	@Then("^category config page open successfully$")
	public void category_config_page_open_successfully() throws InterruptedException, IOException  {
		categoryconfig.verifycategoryconfigpage();

	}

	@And("^create the root category$")
	public void create_the_root_category() throws InterruptedException, IOException  {
		categoryconfig.createrootcategory();

	}
	
	@And("^verify root category create successfully$")
	public void verify_root_category_create_successfully() throws InterruptedException, IOException  {
		categoryconfig.verifycreaterootcategory();

	}
	
	@And("^assign sub category to root category$")
	public void assign_sub_category_to_root_category() throws InterruptedException, IOException  {
		categoryconfig.assignsubcategory();

	}
	
	@Then("^verify sub category assign successfully$")
	public void verify_sub_category_assign_successfully() throws InterruptedException, IOException  {
		categoryconfig.verifysubrootcategory();

	}
	
	@And("^assign sub to sub category$")
	public void assign_sub_to_sub_category() throws InterruptedException, IOException  {
		categoryconfig.assignsubtosubcategory();

	}
	
	@And("^verify sub to sub category assign successfully$")
	public void verify_sub_to_sub_category_assign_successfully() throws InterruptedException, IOException  {
		categoryconfig.verifysubtosubrootcategory();

	}
	
	
}
