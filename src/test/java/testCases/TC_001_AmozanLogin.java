package testCases;

import org.testng.annotations.Test;

import pageObjectPage.AccountLoginPage;
import pageObjectPage.HomePage;
import testBase.baseClass;

public class TC_001_AmozanLogin extends baseClass {
	@Test
	public void AccountLogin() {
		try {
		logger.info("******TC_001_AmozanLogin.........");
		HomePage hp=new HomePage(driver);
		logger.info("moveonToAccount......");
		hp.moveonToAccount();
		logger.info("ClickOnSign....");
		hp.ClickOnSign();
		logger.info("ClickOnCreateAcc.....");
		hp.ClickOnCreateAcc();
		
	
		AccountLoginPage actpage=new AccountLoginPage(driver);
		actpage.setCustomerName("Shaik Nazeer");
		actpage.setEmail("9347085868");
		actpage.setPassword("nazeer123@");
		actpage.ClickOnCount();
		}
		catch (Exception e) {
			logger.error("test is Faild");
		}
		logger.info("FINISHED TC_001_AmozanLogin.....");
	}

}
