package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.indiamart.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-input")).sendKeys("udrill");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//a[text()='Acrylonitrile']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@onkeypress='return isNumberValid1(event)']")).sendKeys("9865331669");
		driver.findElement(By.id("logintoidentify")).click();
		driver.findElement(By.xpath("//a[starts-with(@href,\"/impcat/rubber-raw-material.html\")]")).click();
		driver.findElement(By.xpath("//a[text()='Synthetic Rubbers']")).click();
		driver.findElement(By.xpath("//a[text()='Thermoplastic Rubber']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@class='vrfy-otp'][@alt value='Submit']")).click();
	}
}