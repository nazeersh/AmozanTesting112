package pageObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MobilePage extends basepage {

	public MobilePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//span[text()='Get It in 2 Days'])[1]")
	WebElement clickcheckBox;
	
	@FindBy(xpath = "(//span[text()='256 GB'])[1]")
	WebElement clickGBcheck;
	
	@FindBy(xpath = "(//span[text()='Apple'])[1]")
	WebElement clickonApple;
	
	@FindBy(xpath = "(//span[text()='5G'])[1]")
	WebElement click5GBOX;
	
	@FindBy(xpath = "(//div[@class='colorsprite aok-float-left'])[1]")
	WebElement clickcolor;
	
//	@FindBy(xpath = "//span[text()='Apple iPhone 14 (128 GB) - Midnight']")
//	WebElement clicklink;
	
	
	public void ClickOnCheckBox() {
		clickcheckBox.click();
	}
	public void ClickOnGBbox() {
		clickGBcheck.click();
	}
	public void ClickOnAppleBox() {
		clickonApple.click();
	}
	public void ClickOn5GBox() {
		click5GBOX.click();
	}
	public void SelectColorBox() {
		clickcolor.click();
	}
//	public void ClickOnMobileLink() {
//		clicklink.click();
//	}

}
