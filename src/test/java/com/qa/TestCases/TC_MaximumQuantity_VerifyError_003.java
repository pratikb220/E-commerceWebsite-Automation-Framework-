package com.qa.TestCases;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TC_MaximumQuantity_VerifyError_003 extends BaseClass {
	@Test
	public void VerifyQuantityError() throws InterruptedException, IOException {
	    //Clicking on mobile from homepage
	    hp.getMobileBtn().click();
	    
	    //Click Add to cart option for sony xperia
	    mp.getSonyAddToCartBtn().click();
	    
	    Thread.sleep(4000);
	    //Changing quantity to 1000 and hitting update button
	    atc.getProductQuantityTxt().sendKeys("1000");
	    atc.getUpdateQuantityBtn().click();
	    
	    Thread.sleep(2000);
	    
	    //Verifying error message with screenshot after hitting update button
	    File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(f, new File("D:\\java 2022\\Project_guru99\\Screenshots\\ErrorQuantityLimit.jpg"));
	    
	    String quantityErrorMsg = driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")).getText();
	    
	    if(quantityErrorMsg.equals("* The maximum quantity allowed for purchase is 500.")) {
	    	System.out.println("Error verification Successfull");
	    }
	    else {
	    	System.out.println("Not Verified");
	    }
	    
	    Thread.sleep(3000);
	    
	    //Hitting empty cart button and verifying if the list is empty
	    atc.getEmptyCartBtn().click();
	    File ff = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(ff, new File("D:\\java 2022\\Project_guru99\\Screenshots\\EmptyProductList.jpg"));
	    
	    Thread.sleep(2000);
	    
	    String txtAfterEmptyCart = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[2]/p[1]")).getText();
	    
	    if(txtAfterEmptyCart.equals("You have no items in your shopping cart.")) {
	    	System.out.println("Cart empty verification successfull");
	    }
	    else {
	    	System.out.println("Error verifying empty list");
	    }
	    
	    Thread.sleep(4000);
	}

}
