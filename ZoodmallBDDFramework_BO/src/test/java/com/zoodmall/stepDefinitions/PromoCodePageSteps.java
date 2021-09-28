package com.zoodmall.stepDefinitions;

import java.io.IOException;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.PromoCodePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PromoCodePageSteps {

	TestContext testContext;
	PromoCodePage promocodepage;
	

	public PromoCodePageSteps(TestContext context) throws InterruptedException {
		testContext = context;
		promocodepage = testContext.getPageObjectManager().getPromoCodePage();
	}
	
	@Given("^user click on promo Code$")
	public void user_click_on_promo_Code() throws InterruptedException {
		promocodepage.promocodetab();

	}
	
	@When("^user click on promo management$")
	public void user_click_on_promo_management() throws InterruptedException, IOException {
		promocodepage.promomanagement();

	}
	
	@Then("^promo management page open successfully$")
	public void promo_management_page_open_successfully() throws InterruptedException, IOException {
		promocodepage.verifyprmocodemanagmentpage();

	}
	
	@Then("^verify promocode should be create successfully$")
	public void verify_promocode_should_be_create_successfully() throws InterruptedException, IOException {
		promocodepage.verifyprmocodecreated();

	}
	
	@Then("^delete created test promocode$")
	public void delete_created_test_promocode() throws InterruptedException, IOException {
		promocodepage.deleteprmocodecreated();

	}
	
	
	
	@And("^verify all validation message on promo code$")
	public void verify_all_validation_message_on_promo_code() throws InterruptedException, IOException {
		
	
		promocodepage.verifyallvalidationonpromo();

	}
	
	
	
	@And("^create the promo code \"(.*?)\"$")
	public void create_the_promo_code(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.savepromo();

	}
	
	@And("^create the promo code with supported payment option \"(.*?)\"$")
	public void create_the_promo_code_with_supported_payment_option(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.selectpromopaymethod();
		promocodepage.savepromo();

	}

	
	
	@And("^create the promo code with fixed discount type \"(.*?)\"$")
	public void create_the_promo_code_with_fixed_discount_type(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromofixdiscount(promocodetype);
		promocodepage.savepromo();

	}
	
	
	@And("^create the promo code of customer specific \"(.*?)\"$")
	public void create_the_promo_code_of_customer_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromcustomerspeci();
	

	}
	
	@And("^create the promo code of product specific \"(.*?)\"$")
	public void create_the_promo_code_of_product_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromproductspeci();
	

	}
	
	@And("^create the promo code of product specific Manually add \"(.*?)\"$")
	public void create_the_promo_code_of_product_specific_Manually_add(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromproductspecimanuallyadd();
	

	}
	

	
	@And("^create the promo code with seller ID filter specific \"(.*?)\"$")
	public void create_the_promo_code_with_seller_ID_filter_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromselleridspeci();

	}
	
	@And("^create the promo code with mininium rank filter specific \"(.*?)\"$")
	public void create_the_promo_code_with_mininium_rank_filter_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromminrankfilter();

	}
	
	@And("^create the promo code brandzone filter specific \"(.*?)\"$")
	public void create_the_promo_code_brandzone_filter_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createprombrandzonefilter();

	}
	
	@And("^create the promo code with category filter \"(.*?)\"$")
	public void create_the_promo_code_with_category_filter(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromcategoryfilter();

	}
	
	@And("^create the promo code with category sub level filter \"(.*?)\"$")
	public void create_the_promo_code_with_category_sub_level_filter(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromcategorysublevelfilter();

	}
	
	@And("^create the promo code with category sub to sub level filter \"(.*?)\"$")
	public void create_the_promo_code_with_category_sub_to_sub_level_filter(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromcategorysubtosublevelfilter();

	}
	
	
	@And("^create the promo code with brandname filter specific \"(.*?)\"$")
	public void create_the_promo_code_with_brandname_filter_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createprombrandnamefilter();

	}
	
	@And("^create the promo code with hotkeywords filter specific \"(.*?)\"$")
	public void create_the_promo_code_with_hotkeywords_filter_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromhotkeywordsfilter();

	}
	
	
	
	
	@And("^create the promo code with exclude seller ID filter specific \"(.*?)\"$")
	public void create_the_promo_code_with_exclude_seller_ID_filter_specific(String promocodetype) throws InterruptedException, IOException {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromexcludeselleridspeci();
	

	}
	
	
	
	
	
	@When("^create the promo code with seller type filter specific \"(.*?)\" \"(.*?)\"$")
	public void create_the_promo_code_with_seller_type_filter_specific(String promocodetype,String sellertype) throws Throwable {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromsellertypespeci(sellertype);
	   
	}
	
	@When("^create the promo code with section specific \"(.*?)\" \"(.*?)\"$")
	public void create_the_promo_code_with_section_specific(String promocodetype,String section) throws Throwable {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromsectiontypespeci(section);
	   
	}
	
	@When("^create the promo code with filter combination of \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void create_the_promo_code_with_filter_combination_of(String promocodetype,String section,String sellertype) throws Throwable {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromonsectionandsellertype(section,sellertype);
	   
	}
	
	
	
	
	@Then("^create the promo code with price range filter \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void create_the_promo_code_with_price_range_filter(String promocodetype,String condition, String operator, String price) throws Throwable {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromprocerange(condition,operator,price);
	}
	
	
	@Then("^create the promo code with filter combination of category brandname pricerange \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void create_the_promo_code_with_filter_combination_of_category_brandname_pricerange(String promocodetype,String condition, String operator, String price) throws Throwable {
		promocodepage.createpromomarket(promocodetype);
		promocodepage.createpromprowithcombination(condition,operator,price);
	}
	 
	
	


}