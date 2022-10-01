package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//a[text()=' GEARS ']")	
	private WebElement gearBtn;
	
	@FindBy(xpath = "//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
			
	public void gearsButton() {
		gearBtn.click();
		
	}
	
	public void skillraryDemoAppbtn() {
		skillrarydemoapp.click();
	}
	
	
}
