package com.runner;

import java.io.IOException;

import com.baseclass.Baseclass;
import com.pageobjectmanager.PageobjectManager;
import com.pageobjectmodel.AdactinSearchPage;
//import com.pageobjectmodel.AdactinBookPage;

public class TestRunner extends Baseclass {
	
	public static void main(String[] args) throws IOException, InterruptedException {

		PageobjectManager pom = new PageobjectManager();

		// Login testing
		
		launchBrowser (pom.getfilereader().getDataProperty("browser"));

		launchUrl(pom.getfilereader().getDataProperty("url"));

//		launchBrowser("chrome");
//		launchUrl("https://adactinhotelapp.com/index.php");
		 
		pom.getloginpage().validusernameandvalidpassword();

		// search hotel

		((AdactinSearchPage) pom.getsearchpage()).searchPage();

		// book hotel

		pom.getbookpage().bookhotel();
	

//	 
//	pom.getfilereader().getDataProperty("browser");
//	
//	pom.getfilereader().getDataProperty("url");

	

	

	}

		
}

