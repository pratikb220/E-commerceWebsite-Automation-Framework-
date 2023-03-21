package com.qa.TestCases;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_Homepage_HitMobile_001 extends BaseClass{
	
	@Test
	public void verifyMobile() {
		//Verifying title of homepage
		if(driver.getTitle().equals("Home page")) {
			System.out.println("Homepage title verified");
		}
		else {
			System.out.println("Error while verifying");
		}
		
		//Clicking Mobile Button
		hp.getMobileBtn().click();
		
		//Verifying Mobile list page
		if(driver.getTitle().equals("Mobile")) {
			System.out.println("Mobile Page title verified");
		}
		else {
			System.out.println("Error while verifying");
		}
		
		//Saving the names before sorting
		List<WebElement> beforeFilterName = driver.findElements(By.className("product-name"));
		List<String> beforeFilterNameList = new ArrayList<String>();
		
		for(WebElement p : beforeFilterName) {
			beforeFilterNameList.add(p.getText());
		}
		
		//Select sort by name from dropdown
		Select sortbyDropDown = new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
		sortbyDropDown.selectByVisibleText("Name");
		
		//Capture names after selecting name from sortby dropdown
		List<WebElement> afterFilterName = driver.findElements(By.className("product-name"));
		List<String> afterFilterNameList = new ArrayList<String>();
		
		for(WebElement p : afterFilterName) {
			afterFilterNameList.add(p.getText());
		}
		
		//verify the names after sorting by names
		Collections.sort(beforeFilterNameList);
		Assert.assertEquals(beforeFilterNameList, afterFilterNameList);
		if(beforeFilterNameList.equals(afterFilterNameList)) {
			System.out.println("Verified successfully");
		}
		else {
			System.out.println("Error while verifying");
		}
	}

}
