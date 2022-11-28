package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class reuseselect {
	
		public static void selectmethod(WebElement element,String text) {
			Select select=new Select(element);
			select.selectByVisibleText(text);
			
		}

		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.telerik.com/blogs/5-design-tips-dropdown-menus-websites-apps");
			selectmethod(driver.findElement(By.id("Country-1")), "India");
			driver.findElement(By.xpath("//button[@class='TK-Products-Menu-Item-Button']")).click();
}
}