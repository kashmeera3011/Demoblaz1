package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneAddtoCart 
{
	public static void phoneaddtocart() throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.findElement(By.linkText("Samsung galaxy s6")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("KAshmira");
		Thread.sleep(2000);
		
		driver.findElement(By.id("country")).sendKeys("India");
		Thread.sleep(2000);
		
		driver.findElement(By.id("city")).sendKeys("rangilu");
		Thread.sleep(2000);
		
		driver.findElement(By.id("card")).sendKeys("42424242424242");
		Thread.sleep(2000);
		
		driver.findElement(By.id("month")).sendKeys("02");
		Thread.sleep(2000);
		
		driver.findElement(By.id("year")).sendKeys("2026");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		
		
	}
}
