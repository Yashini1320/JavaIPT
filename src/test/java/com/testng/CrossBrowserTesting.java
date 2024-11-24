package com.testng;

import org.testng.annotations.Test;

import com.baseclass.Baseclass;

public class CrossBrowserTesting extends Baseclass{
	
	@Test(priority = 4)
	private void EdgeBrowser() {
		launchBrowser("Edge");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
		terminateBrowser();
		
	}
	
	@Test(priority = 0)
	private void ChromeBrowser() {
		launchBrowser("Chrome");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
		terminateBrowser();
		
	}
	
	@Test(priority = -8)
	private void FirefoxBrowser() {
		launchBrowser("Firefox");
		launchUrl("https://www.google.co.in/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
		terminateBrowser();
		
	}

}
