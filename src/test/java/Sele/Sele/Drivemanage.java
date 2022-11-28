package Sele.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivemanage {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
Thread.sleep(3000);
element.sendKeys("phone");
driver.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='a-button-text']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@href=\"https://sell.amazon.com/sell\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='nav-menu-cta link button button-type-primary ']")).click();
driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
driver.findElement(By.id("ap_customer_name")).sendKeys("justin");
driver.findElement(By.name("email")).sendKeys("jusoraja0@gmail.com");
driver.findElement(By.name("password")).sendKeys("justin@420");
driver.findElement(By.name("passwordCheck")).sendKeys("justin@420");

driver.findElement(By.id("continue")).click();
driver.findElement(By.id("home_children_button")).click();
	}

}
