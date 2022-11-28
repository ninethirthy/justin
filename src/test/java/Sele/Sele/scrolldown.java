package Sele.Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class scrolldown {
	static WebDriver driver;
	public static WebDriver frame(WebDriver driver,String text) {
		driver.switchTo().frame(text);
		return driver;
	}
	public static void scroll(WebDriver driver,WebElement elements) {
	
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();",elements );
	
		
}
	public static  WebDriver namematch(WebDriver driver,String target) {
	 WebElement element = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr//td[normalize-space(text())='"+target+"']"));
	 String tr = element.getText();
		System.out.println(tr);
		

		return driver;
			
		}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		namematch(driver, "Roland Mendel");
		//WebElement elements = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[text()='Mexico']"));
		//String text = elements.getText();
		//System.out.println(text);
	

	
	
scroll(driver,driver.findElement(By.xpath("//a[normalize-space(text())='Automate GoDaddy.com Features with Selenium WebDriver']")));
	}
	}
