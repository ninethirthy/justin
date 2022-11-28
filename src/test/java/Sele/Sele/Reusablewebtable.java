package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusablewebtable {
	WebDriver driver=null;

	public static  WebDriver namematch(WebDriver driver,String target) {
		 WebElement element = driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr/td//font[normalize-space(text())='"+target+"']/parent::td/parent::tr/following::tr/td/following::td/font"));
			String text = element.getText();
			
				int num=Integer.parseInt(text);
			
System.out.println(num);
			
			return driver;
	}
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		try {
			namematch(driver,"Learn to interact with Elements");
		}catch
		(NumberFormatException ex){
			ex.printStackTrace();
		
		}
//WebElement element = driver.findElement(By.xpath("//table[@cellspacing='0']/tbody/tr/td//font[normalize-space(text())='Learn Locators']"));
	//String text = element.getText();
	//System.out.println(text);
		///parent::td/parent::tr//font[@color='black'"

//table[@cellspacing='0']/tbody/tr/td//font[normalize-space(text())='"+target+"']/parent::td/parent::tr/following::tr/td/following::td/font
}
}