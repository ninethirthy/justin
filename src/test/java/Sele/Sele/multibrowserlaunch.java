package Sele.Sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multibrowserlaunch {
	static WebDriver driver;
	static String name="firebox";
public static void laungh() {
	switch(name) {
	case "Chrome":
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
	break;
	case "firebox":
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.co.in");
	break;
	}
	
	
	
}
	public static void main(String[] args) {
		multibrowserlaunch lk=new multibrowserlaunch ();
		lk.laungh();

	}

}
