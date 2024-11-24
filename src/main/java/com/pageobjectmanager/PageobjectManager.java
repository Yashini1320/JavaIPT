package com.pageobjectmanager;

import com.baseclass.Baseclass;
import com.pageobjectmodel.AdactinBookpage;
import com.pageobjectmodel.AdactinLoginpage;
import com.pageobjectmodel.AdactinSearchPage;

import srcmainresources.FilereaderManager;


public class PageobjectManager extends Baseclass {

	private AdactinLoginpage loginpage;
	private FilereaderManager filereader;
	private AdactinSearchPage searchpage;
	private AdactinBookpage bookHotel;
	public AdactinLoginpage getLoginpage() {
		if (loginpage == null) {
			loginpage = new AdactinLoginpage(driver);	
		}
		return loginpage;
	}
	public FilereaderManager getFilereader() {
		
		if (filereader == null) {
			filereader = new FilereaderManager ();	
		}
		return filereader;
	}
	public AdactinSearchPage getSearchpage() {
		if (searchpage == null) {
			searchpage = new AdactinSearchPage(driver);	
		}
		return searchpage;
	}
	public AdactinBookpage getBookHotel() {
		if (bookHotel == null) {
			bookHotel = new AdactinBookpage(driver);	
		}
		return bookHotel;
	}
	}
   


