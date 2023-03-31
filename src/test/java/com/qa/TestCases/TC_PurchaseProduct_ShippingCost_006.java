package com.qa.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TC_PurchaseProduct_ShippingCost_006 extends BaseClass{
	@SuppressWarnings("deprecation")
	@Test
    public void verifyPurchase() throws InterruptedException, IOException {
    	//Go to my account login page
    	hp.getMyAccountBtn().click();
    	
    	//Login to account
    	map.getEmailTxt().sendKeys("pratiik220@gmail.com");
    	map.getPasswordTxt().sendKeys("Pratik@1243");
    	map.getLoginBtn().click();
    	
    	//Click on my wishlist from my dashboard page
    	md.getMyWishlistBtn().click();
    	
    	
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	//Click on add to cart button from my wishlist page
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"item_66060\"]/td[5]/div/button/span")));
    	mwl.getAddToCartBtn().click();
    	
    	//Select country and state from add to cart page
    	Select state = new Select(atc.getStateSel());
    	state.selectByVisibleText("Alaska");
    	
    	//Enter the zip code
    	atc.getZipTxt().sendKeys("443001");
    	
    	//Click on estimate
    	atc.getEstimateBtn().click();
    	
    	//Verify the flat rate price
    	String flatrate = driver.findElement(By.xpath("//*[@id=\"co-shipping-method-form\"]/dl/dd/ul/li/label/span")).getText();
    	System.out.println("Flat rate of "+ flatrate + "is generated");
    	
    	//Select shipping cost and update total
    	atc.getFlatRateCb().click();
    	atc.getUpdateTotalBtn().click();
    	
    	//Verify subtotal and flat rate is added to total value
    	String subtotal = driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tbody/tr[1]/td[2]/span")).getText();
    	//Converting string values to double and removing $ sign
    	double flatrateDouble = Double.parseDouble(flatrate.substring(1));
    	double subtotalDouble = Double.parseDouble(subtotal.substring(1));
    	//Adding and verifying total
    	Double total = flatrateDouble + subtotalDouble;
    	String totalString = String.format("$%.2f", total);
    	String grandTotal = driver.findElement(By.xpath("//*[@id=\"shopping-cart-totals-table\"]/tfoot/tr/td[2]/strong/span")).getText();
    	if(totalString.equals(grandTotal)) {
    		System.out.println("Grand Total is verified successfully");
    	}
    	else {
    		System.out.println("Error while adding or verifying");
    	}
    	
    	//Click proceed to checkout
    	atc.getCheckoutBtn().click();
    	
    	//Fill the billing information
    	cop.getFirstNameTxt().sendKeys("Pratik");
    	cop.getMiddleNameTxt().sendKeys("Rajendra");
    	cop.getLastNameBtn().sendKeys("Bhusari");
    	cop.getAddressTxt().sendKeys("Buldhana");
    	cop.getCityTxt().sendKeys("Buldhana");
    	Select stateBill = new Select(cop.getStateSel());
    	stateBill.selectByVisibleText("Alaska");
    	cop.getZipTxt().sendKeys("443001");
    	cop.getTelephoneTxt().sendKeys("7775826677");
    	
    	//Continue button
    	cop.getContinueBtn().click();
    	
    	//flat rate continue button
    	cop.getContinueShippBtn().click();
    	
    	//click checkbox for check/money order
    	cop.getMoneyOrderCb().click();
    	
    	//Continue button for payment option
    	cop.getContinuePaymentBtn().click();
    	
    	//place the order
    	cop.getPlaceOrderBtn().click();
    	
    	//Verify with screenshot
    	File ff = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(ff, new File("D:\\java 2022\\Project_guru99\\Screenshots\\OrderPlaced.jpg"));
    	
    	//Verify order placed and note the order number
    	String ordNot = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")).getText();
    	String orderNo = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/p[1]/a")).getText();
    	
    	if(ordNot.equals("Your order has been received.")) {
    		System.out.println("Order has been placed and verified successfully");
    	}
    	else {
    		System.out.println("Order was not placed");
    	}
    	
    	System.out.println("Order number is:" + orderNo);
    }
}
