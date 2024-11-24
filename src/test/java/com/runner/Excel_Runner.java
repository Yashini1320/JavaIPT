package com.runner;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.ReadExcelData;

public class Excel_Runner {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		String username = ReadExcelData.readParticularCellData("Sheet1",1,1);
		driver.findElement(By.id("email")).sendKeys(username);
		
		String password = ReadExcelData.readParticularCellData("Sheet1",1,2);
		driver.findElement(By.id("pass")).sendKeys(password);
		
	
	}

}
