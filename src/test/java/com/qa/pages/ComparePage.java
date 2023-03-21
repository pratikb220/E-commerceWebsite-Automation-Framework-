package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
	WebDriver driver;
	public ComparePage(WebDriver rdriver) {
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Print this page button
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div[1]/a")
	WebElement btnPrintPage;
	public WebElement getPrintPageBtn() {
		return btnPrintPage;
	}
    
	//CLose Window button
	@FindBy(xpath="//*[@id=\"top\"]/body/div/div[2]/button")
	WebElement btnCloseWindow;
	public WebElement getCloseWindowBtn() {
		return btnCloseWindow;
	}
}
