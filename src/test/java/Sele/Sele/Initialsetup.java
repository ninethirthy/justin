package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialsetup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.id("pass"));
element.sendKeys("01061995");
Thread.sleep(2000);
WebElement element2 = driver.findElement(By.id("email"));
element2.sendKeys("9865331669");
driver.findElement(By.name("login")).click();
WebElement element3 = driver.findElement(By.name("Search Facebook"));
element3.sendKeys("Vicky Mass");
//driver.close();
	}

}
