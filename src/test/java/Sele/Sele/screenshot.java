package Sele.Sele;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot{

	public static void Screen(WebDriver driver) throws IOException {
		TakesScreenshot shot=( (TakesScreenshot)driver);
		File source = shot.getScreenshotAs(OutputType.FILE);
		File destignation=new File("./scrrenshot//screenshot"+System.currentTimeMillis()+".png");
	FileUtils.copyFile(source, destignation);
	}
	

	public static WebDriver windows(WebDriver driver,String value) {
		Set<String> windowHandles = driver.getWindowHandles();
		for( String window: windowHandles) {
			driver.switchTo().window(window);
			if(driver.getTitle().contains(value)) {
			return driver;
			}
		}
		
		
		return driver;	
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html#Multiple");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click ']")).click();
		//Screen(driver);
		windows(driver, "Selenium");
		driver.findElement(By.xpath("//span[text()='Support']")).click();
		//Screen(driver);
		windows(driver,"Index");
		driver.findElement(By.id("email")).sendKeys("justinraja1995@gmail.com");
		driver.findElement(By.id("enterimg")).click();
		Thread.sleep(2000);
		windows(driver,"Support|Selenium");
		driver.findElement(By.xpath("//a[text()='Selenium PLC']")).click();
	//	Thread.sleep(2000);
	//	Screen(driver);
		
		
 			}
		
	}
 
	
	
