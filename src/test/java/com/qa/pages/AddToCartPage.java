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

}
