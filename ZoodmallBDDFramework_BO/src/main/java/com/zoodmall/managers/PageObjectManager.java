package com.zoodmall.managers;

import org.openqa.selenium.WebDriver;

import com.zoodmall.comman.BaseClass;
import com.zoodmall.pageObjects.CategoryConfigPage;
import com.zoodmall.pageObjects.DealOfDayPage;
import com.zoodmall.pageObjects.HomePage;
import com.zoodmall.pageObjects.OfferDealPage;
import com.zoodmall.pageObjects.ProductManagementPage;
import com.zoodmall.pageObjects.PromoCodePage;
import com.zoodmall.pageObjects.SBOProductManagement;

public class PageObjectManager {

	private WebDriver driver;

	private BaseClass baseclass;
	private HomePage homePage;
	private DealOfDayPage dealofdaypage;
	private OfferDealPage offerdealpage;
	private SBOProductManagement sboproductmanagment;
	private CategoryConfigPage categoryconfig;
	private ProductManagementPage productmanagement;
	private PromoCodePage promocode;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	public ProductManagementPage getProductManagementPage() {

		return (productmanagement == null) ? productmanagement = new ProductManagementPage(driver) : productmanagement;

	}
	
	public PromoCodePage getPromoCodePage() throws InterruptedException {

		return (promocode == null) ? promocode = new PromoCodePage(driver) : promocode;

	}

	public BaseClass getBaseClass() {

		return (baseclass == null) ? baseclass = new BaseClass(driver) : baseclass;
	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public DealOfDayPage getDealOfDayPage() throws InterruptedException {

		return (dealofdaypage == null) ? dealofdaypage = new DealOfDayPage(driver) : dealofdaypage;
	}

	public OfferDealPage getofferdeal() {

		return (offerdealpage == null) ? offerdealpage = new OfferDealPage(driver) : offerdealpage;
	}

	public SBOProductManagement getsBOproductmanagement() {

		return (sboproductmanagment == null) ? sboproductmanagment = new SBOProductManagement(driver)
				: sboproductmanagment;
	}

	public CategoryConfigPage getCategoryConfigPage() throws InterruptedException {

		return (categoryconfig == null) ? categoryconfig = new CategoryConfigPage(driver) : categoryconfig;

	}

}