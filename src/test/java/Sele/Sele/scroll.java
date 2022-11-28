package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/blogs/5-design-tips-dropdown-menus-websites-apps");
		//WebElement element = driver.findElement(By.xpath("//a[text()='Partners']"));
		JavascriptExecutor je=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		je.executeScript("window.scrollBy(0,3000);", "");
		Thread.sleep(3000);
		
		je.executeScript("window.scrollBy(0,-3000);", "");
		Thread.sleep(3000);
		
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Release History']"));
		
		je.executeScript("arguments[0].scrollIntoView();", element1);
	}
	
}