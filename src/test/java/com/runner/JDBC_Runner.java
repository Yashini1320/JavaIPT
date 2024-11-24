package com.runner;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.JDBC_Connector;

public class JDBC_Runner {
	
	public static void main (String[] args) throws SQLException{
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.youtube.com");
		String fname = JDBC_Connector.getParticularData();
		Driver.findElement(By.name("search_query")).sendKeys(fname);

	}
}
