package Sele.Sele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Foodorder {
static WebDriver driver;
public static void selectmethod(WebElement element,String text) {
	Select select=new Select(element);
	select.selectByVisibleText(text);
}
		public static void sendkey(WebElement element,String text) {
			element.click();
			element.clear();
			element.sendKeys(text);
		}
	
		
	public static void main(String[] args) throws Exception {
		//Foodorder fo=new Foodorder();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bigbasket.com/");
		//driver.findElement(By.xpath("(//a[@qa='loginLink'])[2]")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	//	driver.findElement(By.xpath("//input[@id='otpEmail']")).sendKeys("justinraja1995@gmail.com");
	//	driver.findElement(By.xpath("//button[@class='btn btn-default login-btn']")).click();
		sendkey(driver.findElement(By.xpath("//input[@qa='searchBar']")),"newrice");
		driver.findElement(By.xpath("//button[@class='btn btn-default bb-search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='BB Popular'][1]")).click();
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//*[text()='New Rice/Akki - Sona Masoori']")).click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex) {
			driver.findElement(By.xpath("//*[text()='New Rice/Akki - Sona Masoori']")).click();
		}
		 WebDriverWait wa=new WebDriverWait(driver, Duration.ofSeconds(20));
		 wa.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"))));
		 driver.findElement(By.xpath("//span[text()='ADD TO BASKET']")).click();
		 Thread.sleep(2000);
		 WebElement ds = driver.findElement(By.xpath("//div[@data-qa='add']"));
		 for(int i=0; i<2; i++) {
			 Thread.sleep(2000); 
			 ds.click();
			
		 }
		//WebElement elements = driver.findElement(By.xpath("//h4[text()='Bigbasket']"));
		// JavascriptExecutor js = (JavascriptExecutor) driver;
	      // js.executeScript("window.scrollBy(0,600)", "");
			//JavascriptExecutor js = ((JavascriptExecutor) driver);
		//.executeScript("arguments[0].scrollIntoView();",elements);
		// Thread.sleep(5000);
	//	driver.findElement(By.xpath("//a[text()='BB Royal Sona Masoori Steam Rice/Akki']")).click();
	//List<WebElement> el = driver.findElements(By.xpath("//*[@class='_1uzoh']/child::div[2]"));
	//	for(WebElement ele:el) {
	//	ele.getSize();
		//	String l = ele.getText();
		
		//	System.out.println(l);
		
 driver.findElement(By.xpath("//a[text()='Rice & Rice Products']")).click();
// driver.findElement(By.xpath("(//input[@placeholder='Search by Brand'])[1]")).sendKeys("Aachi");
// driver.findElement(By.xpath("(//span[text()='Aachi'] ")).click();
 driver.findElement(By.xpath("(//div[@qa='product_name']/a)[2]")).click();
 driver.findElement(By.xpath("(//div[@class='_2Z6Vt    rippleEffect'])[1]")).click();
 driver.findElement(By.xpath("//div[@class='Cs6YO rippleEffect']")).click();
 driver.findElement(By.xpath("//a[text()='Poha, Sabudana & Murmura']")).click();
 driver.findElement(By.xpath("//div[@qa='product'][2]//div[@qa='product_name']")).click();
 driver.findElement(By.xpath("//div[@class='Cs6YO rippleEffect']")).click();
 Thread.sleep(3000);
 try {
 WebElement ele = driver.findElement(By.xpath("//div[@class='_18p4h'][3]/a[2]"));
 }
 catch(org.openqa.selenium.NoSuchElementException ex) {
	 WebElement ele = driver.findElement(By.xpath("//div[@class='_18p4h'][3]/a[2]"));
	 Actions dl=new Actions(driver);
	 dl.moveToElement(ele).click().build().perform();
	 }	 

// driver.findElement(By.xpath("//div[@class='eubx4']")).click();

 //List<WebElement> ld = driver.findElements(By.xpath("(//div[@class='col-xs-12 ng-scope'])[1]"));
 //for(WebElement ef:ld) {
	
	// if(ef.equals("Aachi")) {
		// ef.click();
	// }
 
 
// driver.findElement(By.xpath("//select[@id='sel1']")).click();
// Thread.sleep(4000);
// selectmethod (driver.findElement(By.xpath("//select[@id='sel1']")),"Price - Low to High");
 
 }
 
	}

	

	
	

		
			 
		 




	



