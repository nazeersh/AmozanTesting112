package pageObjectPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends basepage{

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement moveOnAct;
	
	@FindBy(xpath = "(//span[text()='Sign in'])[1]")
	WebElement lnkclicksign;
	
	@FindBy(id = "createAccountSubmit")
	WebElement lnkclickoncreateact;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;
	

	
	public void moveonToAccount() {
		Actions actobj=new Actions(driver);
		actobj.moveToElement(moveOnAct).perform();
	}
	public void ClickOnSign() {
		lnkclicksign.click();
	}
	public void ClickOnCreateAcc() {
		lnkclickoncreateact.click();
	}
	
	public void SearcingProdouct() throws InterruptedException {
		Actions actobj=new Actions(driver);
		actobj.sendKeys(searchbox,"iphone").perform();
		for(int i=0;i<=4;i++) {
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		actobj.sendKeys(Keys.ENTER).perform();
	}
	

}
