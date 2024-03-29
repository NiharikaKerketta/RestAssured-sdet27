package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
		
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath = "//button[@ondblclick='addtocart()']")
	private WebElement addtocart;
	
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getAddbtn() {
		return addbtn;
	}
		
	public void addtoCartButton() {
		addbtn.click();
	}
	
}
