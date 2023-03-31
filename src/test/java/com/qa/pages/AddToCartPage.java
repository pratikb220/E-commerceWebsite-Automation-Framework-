package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	WebDriver driver;
	public AddToCartPage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//proceed to checkout button
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div/div[2]/div/div/div/div[1]/ul/li/button")
	WebElement btnCheckout;
	public WebElement getCheckoutBtn() {
		return btnCheckout;
	}
	
	//Empty cart button
	@FindBy(xpath="//*[@id=\"empty_cart_button\"]")
	WebElement btnEmptyCart;
	public WebElement getEmptyCartBtn() {
		return btnEmptyCart;
	}
	
	
	//Update shopping cart button
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tfoot/tr/td/button[3]")
	WebElement btnUpdateCartout;
	public WebElement getUpdateCartBtn() {
		return btnUpdateCartout;
	}
	
	//Textbox for discount code
	@FindBy(xpath="//*[@id=\"coupon_code\"]")
	WebElement txtDiscountCode;
	public WebElement getDiscountCodeTxt() {
		return txtDiscountCode;
	}
	
	//Apply button for discount code
	@FindBy(xpath="//*[@id=\"discount-coupon-form\"]/div/div/div/div/button")
	WebElement btnDiscountApply;
	public WebElement getDiscountApplyBtn() {
		return btnDiscountApply;
	}
	
	//Tetxtbox for quantity
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")
	WebElement txtProductQuantity;
	public WebElement getProductQuantityTxt() {
		return txtProductQuantity;
	}
	
	//Update button visible after changing the quantity
	@FindBy(xpath="//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button")
	WebElement btnUpdateQuantity;
	public WebElement getUpdateQuantityBtn() {
		return btnUpdateQuantity;
	}
	
	//Estimate shipping and tax field
	//Select country
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement selCountry;
	public WebElement getCountrySel() {
		return selCountry;
	}
	
	//Select state or province
	@FindBy(xpath="//*[@id=\"region_id\"]")
	WebElement selState;
	public WebElement getStateSel() {
		return selState;
	}
	
	//Zip code
	@FindBy(xpath="//*[@id=\"postcode\"]")
	WebElement txtZip;
	public WebElement getZipTxt() {
		return txtZip;
	}
	
	//Estimate button
	@FindBy(xpath="//*[@id=\"shipping-zip-form\"]/div/button")
	WebElement btnEstimate;
	public WebElement getEstimateBtn() {
		return btnEstimate;
	}
	
	//Flat rate checkbox
	@FindBy(xpath="//*[@id=\"s_method_flatrate_flatrate\"]")
	WebElement cbFlatRate;
	public WebElement getFlatRateCb() {
		return cbFlatRate;
	}
    
	//Update total button
	@FindBy(xpath="//*[@id=\"co-shipping-method-form\"]/div/button")
	WebElement btnUpdateTotal;
	public WebElement getUpdateTotalBtn() {
		return btnUpdateTotal;
	}
}
