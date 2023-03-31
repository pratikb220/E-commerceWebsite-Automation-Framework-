package com.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.AddToCartPage;
import com.qa.pages.CheckoutPage;
import com.qa.pages.ComparePage;
import com.qa.pages.CreateAnAccountPage;
import com.qa.pages.HomePage;
import com.qa.pages.MobilePage;
import com.qa.pages.MyAccountPage;
import com.qa.pages.MyDashboard;
import com.qa.pages.MyOrdersPage;
import com.qa.pages.MyWishlistPage;
import com.qa.pages.ShareYourWishlistPage;
import com.qa.pages.SonyXperiaPage;
import com.qa.pages.TvPage;
import com.qa.pages.ViewOrderPage;
import com.qa.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	HomePage hp;
	MobilePage mp;
	SonyXperiaPage sxp;
	AddToCartPage atc;
	ComparePage cp;
	MyAccountPage map;
	CreateAnAccountPage cap;
	ShareYourWishlistPage syw;
	MyWishlistPage mwl;
	TvPage tp;
	MyDashboard md;
	CheckoutPage cop;
	MyOrdersPage mop;
	ViewOrderPage vop;
	ReadConfig readconfig = new ReadConfig();
	
	public String Driver = readconfig.getDriver();
	public String baseURL = readconfig.getUrl();
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		if(Driver.equals("chrome")) {
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().driverVersion("110.0.5481").setup();
			driver = new ChromeDriver();
		}
		else if(Driver.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		hp = new HomePage(driver);
		mp = new MobilePage(driver);
		sxp = new SonyXperiaPage(driver);
		atc = new AddToCartPage(driver);
		cp = new ComparePage(driver);
		map = new MyAccountPage(driver);
		cap = new CreateAnAccountPage(driver);
		syw = new ShareYourWishlistPage(driver);
		mwl = new MyWishlistPage(driver);
		tp = new TvPage(driver);
		md = new MyDashboard(driver);
		cop = new CheckoutPage(driver);
		mop = new MyOrdersPage(driver);
		vop = new ViewOrderPage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
