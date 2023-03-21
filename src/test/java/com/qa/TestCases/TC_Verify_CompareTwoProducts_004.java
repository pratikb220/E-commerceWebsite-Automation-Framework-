package com.qa.TestCases;

import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_Verify_CompareTwoProducts_004 extends BaseClass {
	@Test
    public void VerifyTwoProdcuts() throws IOException, InterruptedException{
		//Hitting Mobile page button
		hp.getMobileBtn().click();
		
		//Adding any two products to compare list
		mp.getIphoneAddToCompareBtn().click();
		String mainMobile1 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();
		Thread.sleep(2000);
		mp.getSamsungAddToCompareBtn().click();
		String mainMobile2 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();
		Thread.sleep(2000);
		//
		
		//Clicling on compare button
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Compare")));
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", mp.getCompareBtn());
		
//	    mp.getCompareBtn().click();
	    
		Thread.sleep(2000);
		
		//handling the popup window
//	    List<String> handles = new ArrayList<String>(driver.getWindowHandles());
//	    driver.switchTo().window(handles.get(1));
		for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
		
		//Verifying that these two products are in the compare products list by taking screenshot
		String strHead = ("COMPARE PRODUCTS");
	    String compHead = driver.findElement(By.xpath(".//*[@id='top']/body/div[1]/div[1]/h1")).getText();	
	    System.out.println("compHead = "+compHead);
	    String popupMobile1 = driver.findElement(By.xpath("//h2/a[@title='IPhone']")).getText();  // text captured is "IPHONE" in uppercase
	    String popupMobile2 = driver.findElement(By.xpath("//h2/a[@title='Sony Xperia']")).getText();  // text captured "SONY XPERIA" in uppercase
	    System.out.println("popupMobile1 = "+popupMobile1);
	    System.out.println("popupMobile2 = "+popupMobile2);
	    Thread.sleep(1000);
	    // to check the popup heading/title
	    try {	    	
	    	assertEquals(strHead, compHead);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }	
	    // to check the 2 mobiles selected are the two in the popup - this is tp check the IPhone
	    try {	    	
	    	assertEquals(mainMobile1, popupMobile1);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }	
	    // to check the 2 mobiles selected are the two in the popup - this is to check Sony X
	    try {	    	
	    	assertEquals(mainMobile2, popupMobile2);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }	
	    	    
	    // 6. Close the Popup Windows
	    driver.findElement(By.xpath("//button[@title='Close Window']")).click();
	    
	    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    driver.switchTo().window(handle);
	    }
//	    driver.close();
//	    driver.switchTo().window(handles.get(0));
    }
}
