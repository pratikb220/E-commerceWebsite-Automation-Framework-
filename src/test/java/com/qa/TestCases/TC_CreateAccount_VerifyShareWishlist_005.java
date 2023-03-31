package com.qa.TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TC_CreateAccount_VerifyShareWishlist_005 extends BaseClass{
	@Test
    public void VerifyAndCreateAccount() throws IOException {
    	//Go to My Account
    	hp.getMyAccountBtn().click();
    	
    	//Go to create my account
    	map.getCreateAccountBtn().click();
    	
    	//Fill the information given
    	//Enter first name
    	cap.getFirstNameTxt().sendKeys("Ashutosh");
    	//Enter middle name
    	cap.getMiddleNameTxt().sendKeys("Pravin");
    	//Enter last name
    	cap.getLastNameTxt().sendKeys("Bhelonde");
    	//Enter email address
    	cap.getEmailCreateTxt().sendKeys("pratiik220@gmail.com");
    	//Enter password
    	cap.getPasswordCreateTxt().sendKeys("Pratik@1243");
    	//Confirm your password
    	cap.getConfirmPasswordTxt().sendKeys("Pratik@1243");
    	
    	//Click on register
    	cap.getRegisterBtn().click();
    	
    	//Verify the registration
    	String regTxt = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div/ul/li/ul/li/span")).getText();
    	if(regTxt.equals("Thank you for registering with Main Website Store.")) {
    		System.out.println("Registration Successfull");
    	}
    	else {
    		System.out.println("Registration Unsuccessfull");
    	}
    	
    	//Verify with screenshot
    	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(f, new File("D:\\java 2022\\Project_guru99\\Screenshots\\RegistrationSuccessfull.jpg"));
	    
	    //Go to TV Button
	    hp.getTvBtn().click();
	    
	    //Add any product to the wishlist
	    tp.getWishlistLgBtn().click();
	    
	    //Share the wishlist 
	    mwl.getShareWishlistBtn().click();
	    
	    //Enter email id and message to share the wishlist
	    syw.getEmailToSendTxt().sendKeys("pratikbhusari220@gmail.com");
	    syw.getMessageToSendTxt().sendKeys("Hey! Here is my wishlist. Please Check it out.");
	    syw.getShareWishlistBtn().click();
	    
	    //Check if the list is shared or not
	    String share_wishlist_txt = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div/div[1]/ul/li/ul/li/span")).getText();
	    if(share_wishlist_txt.endsWith("Your Wishlist has been shared.")) {
	    	System.out.println("Wishlist successfully shared");
	    }
	    else {
	    	System.out.println("Error while sharing wishlist");
	    }
    }
}
