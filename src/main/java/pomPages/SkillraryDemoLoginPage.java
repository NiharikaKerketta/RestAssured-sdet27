package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
		
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(xpath = "//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getCourses() {
		return course;
	}
	
	public void seleniumTrainingTab() {
		seleniumtraining.click();
	
	}
}
