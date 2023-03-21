package com.qa.TestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_SonyXperia_VerifyCost_002 extends BaseClass {
	@Test
    public void VerifyCostSony() throws InterruptedException {
    	//Clicking on mobile button
    	hp.getMobileBtn().click();
    	Thread.sleep(2000);
    	//Reading the cost of SoneXperia Mobile
    	WebElement costSony1 = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
    	String beforecost = costSony1.getText();
    	
    	Thread.sleep(2000);
    	//Clicking on sony xperia mobile
    	mp.getSonyBtn().click();
    	
    	Thread.sleep(4000);
    	
    	//Reading cost of mobile on sony xperia page
    	WebElement costSony2 = driver.findElement(By.xpath("//*[@id=\"product-price-1\"]/span"));
    	String aftercost = costSony2.getText();
    	
    	Thread.sleep(2000);
    	//Verifying cost before and after
    	Assert.assertEquals(beforecost, aftercost);
    	if(beforecost.equals(aftercost)) {
    		System.out.println("Verified Successfully");
    	}
    	else {
    		System.out.println("Error while verifying");
    	}
    	
    }
}
