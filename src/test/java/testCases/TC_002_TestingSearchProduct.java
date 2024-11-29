package testCases;

import org.testng.annotations.Test;

import pageObjectPage.HomePage;
import pageObjectPage.MobilePage;
import testBase.baseClass;

public class TC_002_TestingSearchProduct extends baseClass {
	@Test
	public void TesingMobile() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.SearcingProdouct();
		
		MobilePage mp=new MobilePage(driver);
		mp.ClickOnCheckBox();
		mp.ClickOnGBbox();
		mp.ClickOnAppleBox();
		mp.ClickOn5GBox();
//		mp.ClickOnMobileLink();
		
		
	}

}
