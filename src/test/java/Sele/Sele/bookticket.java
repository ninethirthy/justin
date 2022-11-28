package Sele.Sele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bookticket {
	static WebDriver driver;
public static void seatselect(WebDriver driver, String text) {
	WebElement sd = driver.findElement(By.xpath("//table/tbody/tr[6]/td[@class='SRow1']/div[@id='"+text+"']"));
	sd.click();
	
}



	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		ChromeOptions arguments = option.addArguments("disable-notifications");
		option.addArguments("disable-geolocation");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sc-bvTASY hZBmDF']/div/div/div/following::input")).sendKeys("chennai");
		driver.findElement(By.xpath("//div[@class='sc-bvTASY hZBmDF']/div/div/div/following::input")).click();
		driver.findElement(By.xpath("//div[@class='sc-kDhYZr dadFuJ']/ul/li/span[@class='sc-dBaXSw gYlrLO']")).click();
		driver.findElement(By.xpath("//a[text()='Movies']")).click();
		driver.findElement(By.xpath("(//div[text()='Tamil'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='Love Today']")).click();
		driver.findElement(By.xpath("//div[@class='sc-1vmod7e-2 iBonLL'][1]")).click();
		Thread.sleep(3000);
	//	try
	//	{
		//	driver.findElement(By.xpath("//button[text()='OK']")).click();
		//}catch(org.openqa.selenium.NoSuchElementException ex) {
		//	driver.findElement(By.xpath("//button[text()='OK']")).click();
		//}
	//	Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//ul[@id='venuelist']/li//div[@class='showtime-pill-container'][1]/a//div[@class='__text'])[1]"));
		Actions act= new Actions(driver);
		act.moveToElement(element).click().build().perform();
		driver.findElement(By.xpath("//div[text()='Accept'][1]")).click();
		driver.findElement(By.xpath("//ul[@id='popQty']/li[@id='pop_6']")).click();
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		Thread.sleep(2000);
		seatselect(driver, "A_5_021");
		seatselect(driver, "A_5_022");
		seatselect(driver, "A_5_0221");
		seatselect(driver, "A_5_0222");
		seatselect(driver, "A_5_0223");
		seatselect(driver, "A_5_0224");
		//div[@id='proceed-Qty']}

}
}
