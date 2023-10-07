package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Categories
{
	public static void categories() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		driver.findElement(By.linkText("Phones")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Monitors")).click();
		Thread.sleep(2000);
	}
}
