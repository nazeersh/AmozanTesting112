package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends basepage{

	public AccountLoginPage(WebDriver driver) {
		super(driver);
		
	}
     
	@FindBy(name = "customerName")
	WebElement txtname;
	
	@FindBy(name = "email")
	WebElement txtemail;
	
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@FindBy(id = "continue")
	WebElement clickCont;
	
	public void setCustomerName(String sname) {
		txtname.sendKeys(sname);
		System.out.println(txtname.getAttribute("value"));
	}
	public void setEmail(String email) {
		txtemail.sendKeys(email);
		System.out.println(txtemail.getAttribute("value"));
	}
	public void setPassword(String pass) {
		txtpassword.sendKeys(pass);
		System.out.println(txtpassword.getAttribute("value"));
	}
	public void ClickOnCount() {
		clickCont.click();
	}

}
