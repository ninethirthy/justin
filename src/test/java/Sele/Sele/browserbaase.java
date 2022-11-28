package Sele.Sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserbaase {
	static WebDriver driver;
	static String gh="https://www.bigbasket.com/";
	public static void launch(String str) {
		if (str.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get(gh);
			if(str.equalsIgnoreCase("Firebox")) {
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver1=new ChromeDriver();
				driver.get(gh);
			}
		}
		
	}
	public static void main(String[] args) {
		
	}

}
