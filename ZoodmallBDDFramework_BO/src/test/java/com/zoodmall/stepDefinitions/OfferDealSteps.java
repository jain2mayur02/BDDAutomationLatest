package com.zoodmall.stepDefinitions;

import java.io.IOException;

import com.zoodmall.contextmanager.TestContext;
import com.zoodmall.pageObjects.OfferDealPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OfferDealSteps {

	TestContext testContext;
	OfferDealPage offerdealpage;

	public OfferDealSteps(TestContext context) {
		testContext = context;
		offerdealpage = testContext.getPageObjectManager().getofferdeal();
	}
	
	@When("^user click on offer deal$")
	public void user_click_on_offer_dealy() {
		offerdealpage.offerpage();

	}
	
	@Then("^offer deal of the page open successfully$")
	public void offer_deal_of_the_page_open_successfuly() throws InterruptedException, IOException {
		offerdealpage.verifyofferdealpage();

	}
	
	@And("^create the offer deal$")
	public void create_the_offer() throws InterruptedException, IOException {
		offerdealpage.createofferdeal();

	}
	
	
	@Then("^verify offerdeal should be create successfully$")
	public void verify_offerdeal_should_be_create_successfully() throws InterruptedException, IOException {
		offerdealpage.verifyofferdealcreate();

	}
	
	@Then("^delete the offerdeal$")
	public void delete_the_offerdeal() throws InterruptedException, IOException {
		offerdealpage.verifyofferdealdelete();

	}
	
	@And("^check download sample file offer productid tab$")
	public void check_download_sample_file_offer_productid_tab() throws InterruptedException, IOException {
		offerdealpage.verifyofferfiledownloadod();

	}
	
	@And("^upload offer product by excel$")
	public void upload_offer_product_by_excel() throws InterruptedException, IOException {
		offerdealpage.verifyuploadofferproductexcel();

	}
	
	
	
	@And("^add product using productid option for offerdeal$")
	public void add_product_using_productid_option_for_offerdeal() throws InterruptedException, IOException {
		offerdealpage.verifyuploadproductbyidofferdeal();

	}
	
	@And("^check export option on offerdeal$")
	public void check_export_option_on_offerdeal() throws InterruptedException, IOException {
		offerdealpage.verifyexportonoffer();

	}
	
	@And("^click on delete all on offerdeal$")
	public void click_on_delete_all_on_offerdeal() throws InterruptedException, IOException {
		offerdealpage.verifydeletealloffer();

	}
	
	@And("^edit the offerdeal$")
	public void edit_the_offerdeal() throws InterruptedException, IOException {
		offerdealpage.editofferdeal();

	}
	
	@Then("^verify offerdeal should be updated successfully$")
	public void verify_offerdeal_should_be_updated_successfully() throws InterruptedException, IOException {
		offerdealpage.verifyeditofferdeal();

	}
	
	@And("^delete the edit offerdeal$")
	public void delete_the_edit_offerdeal() throws InterruptedException, IOException {
		offerdealpage.verifyeditdeleteofferdeal();

	}

}

