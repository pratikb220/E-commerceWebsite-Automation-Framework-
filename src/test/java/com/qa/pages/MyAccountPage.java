package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    WebDriver driver;
    public MyAccountPage(WebDriver rdriver) {
    	this.driver = rdriver;
    	PageFactory.initElements(rdriver, this);
    }
    
    //Create an account button
    @FindBy(xpath="//*[@id=\"login-form\"]/div/div[1]/div[2]/a")
    WebElement btnCreateAccount;
    public WebElement getCreateAccountBtn() {
    	return btnCreateAccount;
    }
    
    //Email address text field
    @FindBy(xpath="//*[@id=\"email\"]")
    WebElement txtEmail;
    public WebElement getEmailTxt() {
    	return txtEmail;
    }
    
    //Password Text Field
    @FindBy(xpath="//*[@id=\"pass\"]")
    WebElement txtPassword;
    public WebElement getPasswordTxt() {
    	return txtPassword;
    }
    
    //Login Button
    @FindBy(xpath="//*[@id=\"send2\"]")
    WebElement btnLogin;
    public WebElement getLoginBtn() {
    	return btnLogin;
    }
    
    //Forgot your password button
    @FindBy(xpath="//*[@id=\"login-form\"]/div/div[2]/div[1]/ul/li[3]/a")
    WebElement btnForgotPassword;
    public WebElement getForgotPasswordBtn() {
    	return btnForgotPassword;
    }
    
    //Mobile Page button from my account page
    @FindBy(xpath="//*[@id=\"nav\"]/ol/li[1]/a")
    WebElement btnMobile_fromMyAccount;
    public WebElement getMobile_fromMyAccountBtn() {
    	return btnMobile_fromMyAccount;
    }
    
    //TV Page button from my account page
    @FindBy(xpath="//*[@id=\"nav\"]/ol/li[2]/a")
    WebElement btnTV_fromMyAccount;
    public WebElement getTV_fromMyAccountBtn() {
    	return btnTV_fromMyAccount;
    }
}
