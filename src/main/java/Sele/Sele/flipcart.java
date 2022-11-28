package Sele.Sele;

import java.io.File;
import java.io.IOException; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class flipcart {
	
	public static void Screen(WebDriver driver) throws IOException {
		TakesScreenshot shot=( (TakesScreenshot)driver);
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destignation=new File("./scrrenshot//screenshot"+System.currentTimeMillis()+".png");
	FileUtils.copyFile(source, destignation);
	}
	




	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']")).click();
		Screen(driver);
		//WebElement findElement = driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice']"));
	//WebElement findElement2 = driver.findElement(By.xpath("//input[@value name='field-keywords']"))	;
	driver.findElement(By.xpath("//img[@alt='Keyboards']")).click();
	Screen(driver);
	Thread.sleep(3000);
	WebElement webElement = driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice'"));
	WebElement webElement2 = driver.findElement(By.xpath("//input[@value='gaming keyboard 60 percent']"));
	Actions act=new Actions(driver);
act.dragAndDrop(webElement, webElement2);
	

	}
	}