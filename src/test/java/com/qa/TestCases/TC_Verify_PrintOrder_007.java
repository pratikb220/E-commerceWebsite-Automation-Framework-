package com.qa.TestCases;

public class TC_Verify_PrintOrder_007 extends BaseClass{
    public void VerifyPrintOrder() { 
    	//Go to my account page/link
        hp.getMyAccountBtn().click();
    	
    	//Login to account
    	map.getEmailTxt().sendKeys("pratikbhusari220@gmail.com");
    	map.getPasswordTxt().sendKeys("Pratik@1243");
    	map.getLoginBtn().click();
    	
    	
    }
}
