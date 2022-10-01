package testScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.clinique.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='text-link--style-2']")).click();
		 List<WebElement> ele = driver.findElements(By.xpath("header-gnav-section__label-wrapper"));
		for(  WebElement a : ele) {
			System.out.println(a.getText());
		}
			
		
		driver.close();

	}

}
