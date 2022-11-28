package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.id("nav-hamburger-menu")).click();
driver.findElement(By.xpath("//a[@data-menu-id='5']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Car & Vehicle Electronics']")).click();
driver.findElement(By.id("a-autoid-0-announce")).click();
driver.findElement(By.xpath("//a[text()='Price: Low to High']")).click();
driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
	}

}


