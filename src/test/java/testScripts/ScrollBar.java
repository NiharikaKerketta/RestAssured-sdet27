package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.clinique.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window, scrollBy(0,3000)");
	driver.close();



}
}
