package com.testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

import com.baseclass.Baseclass;

public class DataProviderTest extends Baseclass{
	
	@Test(dataProvider = "login")
	public void login(String username, String password) throws InterruptedException {
		launchBrowser("chrome");
		launchUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		terminateBrowser();
		
	}
	
	@DataProvider(name = "login")
	public Object[][] dataset() {
		return new Object[][]
				{{"Admin","Admin123"},{"admin1","Admin!12"},{"Admin","1234"},{"  ","  "}};		
	}
}
