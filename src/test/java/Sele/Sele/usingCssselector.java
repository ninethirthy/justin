package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingCssselector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.indiamart.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("search-input")).sendKeys("udrill");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("//a[text()='Acrylonitrile']")).click();
		driver.findElement(By.cssSelector("a[href='/impcat/rubber-raw-material.html']")).click();
driver.findElement(By.cssSelector("input#txt-city")).sendKeys("chennai");
driver.findElement(By.cssSelector("a.h_ic42")).click();
	}


}