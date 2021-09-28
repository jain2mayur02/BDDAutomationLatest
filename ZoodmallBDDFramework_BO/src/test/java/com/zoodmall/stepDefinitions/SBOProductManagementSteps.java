package com.zoodmall.stepDefinitions;

import java.io.IOException;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.SBOProductManagement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SBOProductManagementSteps {

	TestContext testContext;
	SBOProductManagement sboproductmanagment;

	public SBOProductManagementSteps(TestContext context) throws InterruptedException {
		testContext = context;
		sboproductmanagment = testContext.getPageObjectManager().getsBOproductmanagement();
	}

	
	@Given("^user click on user management$")
	public void user_click_on_user_management() throws InterruptedException {
		sboproductmanagment.usermanagmenttab();

	}
	
	
	@When("^user click on seller management$")
	public void user_click_on_seller_management() throws InterruptedException, IOException {
		sboproductmanagment.sellermanagment();

	}
	
	@Then("^seller management page open successfully$")
	public void seller_management_page_open_successfuly() throws InterruptedException, IOException {
		sboproductmanagment.verifysellermanagmentpage();

	}
	
	@Then("^user navigate to seller back office$")
	public void user_navigate_to_selle_back_office() throws InterruptedException, IOException {
		sboproductmanagment.verifysbopage();

	}
	
	
	@And("^import product using import excel$")
	public void import_product_using_import_excel() throws InterruptedException, IOException {
		sboproductmanagment.importproductbyexcel();

	}
	
	@And("^import product using negative import excel$")
	public void import_product_using_negative_import_excel() throws InterruptedException, IOException {
		sboproductmanagment.importproductbynegativeexcel();

	}
	
	@And("^import update product using negative import excel$")
	public void import_update_product_using_negative_import_excel() throws InterruptedException, IOException {
		sboproductmanagment.importupdateproductbynegativeexcel();

	}
	
	@And("^update product using import excel$")
	public void update_product_using_import_excel() throws InterruptedException, IOException {
		sboproductmanagment.updateproductbyexcel();

	}
	
	@Then("^verify product imported successfully$")
	public void verify_product_imported_successfully() throws InterruptedException, IOException {
		sboproductmanagment.verifyimportproductbyexcel();

	}
	
	@Then("^verify validation message for all negative scenarios$")
	public void verify_validation_message_for_all_negative_scenarios() throws InterruptedException, IOException {
		sboproductmanagment.verifyimportproductnegativebyexcel();

	}
	
	
	@Then("^verify validation message for all update negative scenarios$")
	public void verify_validation_message_for_all_update_negative_scenarios() throws InterruptedException, IOException {
		sboproductmanagment.verifyimportupdateproductnegativebyexcel();

	}
	
	
	@Then("^verify multivarient product imported successfully$")
	public void verify_multivarient_product_imported_successfully() throws InterruptedException, IOException {
		sboproductmanagment.verifymultivarientimportproductbyexcel();

	}
	
	
	
	@Then("^verify updateproduct imported successfully$")
	public void verify_updateproduct_imported_successfully() throws InterruptedException, IOException {
		sboproductmanagment.verifyimportupdateproductbyexcel();

	}
	
	@Then("^verify product values reflected successfully$")
	public void verify_product_values_reflected_successfully() throws InterruptedException, IOException {

		sboproductmanagment.verifyimportproductvalues();
	}
	
	@Then("^verify multivarient product values reflected successfully$")
	public void verify_multivarient_product_values_reflected_successfully() throws InterruptedException, IOException {

		sboproductmanagment.verifymultiimportproductvalues();
	}
	
	
	
	
	@Then("^verify updateproduct values reflected successfully$")
	public void verify_updateproduct_values_reflected_successfully() throws InterruptedException, IOException {

		sboproductmanagment.verifyimportupdateproductvalues();
	}
	
	@Then("^verify manual add product values reflected successfully$")
	public void verify_manual_add_product_values_reflected_successfully() throws InterruptedException, IOException {

		sboproductmanagment.verifymanualaddproductvalues();
	}
	
	@And("^Edit the product and update the values$")
	public void Edit_the_product_and_update_the_values() throws InterruptedException, IOException {

		sboproductmanagment.manualEditproductvalues();
	}
	
	@Then("^verify manual edit product values reflected successfully$")
	public void verify_manual_edit_product_values_reflected_successfully() throws InterruptedException, IOException {

		sboproductmanagment.verifymanualeditproductvalues();
	}
	
	
	
	@And("^add product using Add Products$")
	public void import_product_using_Add_Products() throws InterruptedException, IOException {
		sboproductmanagment.importproductbyaddproduct();

	}
	
	@And("^user click on add product and click on save without giving any values$")
	public void user_click_on_add_product_and_click_on_save_without_giving_any_values() throws InterruptedException, IOException {
		sboproductmanagment.importproductbyaddproductwithnovalue();

	}
	
	@Then("^verify all validation message on add product$")
	public void verify_all_validation_message_on_add_product() throws InterruptedException, IOException {
		sboproductmanagment.verifyvalidatnonaddproduct();

	}
	
	
	
	@Then("^verify disable product using batch setting$")
	public void verify_disable_product_using_batch_setting() throws InterruptedException, IOException {
		sboproductmanagment.disprodbybatch();

	}
	
	@Then("^user set category for products$")
	public void user_set_category_for_products() throws InterruptedException, IOException {
		sboproductmanagment.setcategory();

	}
	
	@Then("^verify category set to all products successfully$")
	public void verify_category_set_to_all_products_successfully() throws InterruptedException, IOException {
		sboproductmanagment.checksetcategory();

	}
	
	
	
	
	@Then("^verify enable product using batch setting$")
	public void verify_enable_product_using_batch_setting() throws InterruptedException, IOException {
		sboproductmanagment.enableprodbybatch();

	}
	
	@Then("^verify archived product using batch setting$")
	public void verify_archived_product_using_batch_setting() throws InterruptedException, IOException {
		sboproductmanagment.archivedprodbybatch();

	}
	
	@Then("^verify set marketplace using batch setting$")
	public void verify_set_marketplace_using_batch_setting() throws InterruptedException, IOException {
		sboproductmanagment.semarketshippingbybatch();

	}
	
}
