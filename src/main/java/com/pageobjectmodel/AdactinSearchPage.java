package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;
import com.interfaceelements.adactinapplicationelements;

import srcmainresources.FilereaderManager;

public class AdactinSearchPage extends Baseclass implements adactinapplicationelements{

		@FindBy(id=Location_id)
		private WebElement location;
		@FindBy(id=hotels_id) 
		private WebElement hotel; 
		@FindBy(id=roomType_id) 
		private WebElement roomType;
		@FindBy(id=numberOfRooms_id) 
		private WebElement noOfRooms; 
		@FindBy(id=checkin_id) 
		private WebElement checkin; 
		@FindBy(id=checkout_id) 
		private WebElement checkout; 
		@FindBy(id=adultRoom_id) 
		private WebElement adultRoom; 
		@FindBy (id=childRoom_id)
		private WebElement childRoom;
		@FindBy(id=searchBtn)
		private WebElement searchElement;
		@FindBy (id=selectBtn_id)
		private WebElement select;
		@FindBy(id=continue_id)
		private WebElement continueBtn;
		public AdactinSearchPage (WebDriver driver) { 
			PageFactory.initElements (driver, this);
		}

		public void searchPage() throws IOException{
		FilereaderManager search=new FilereaderManager();
		passInput(location,"Sydney");
		passInput(hotel,"Hotel Sunshine");
		passInput(roomType,"Deluxe");
		passInput(noOfRooms,"3 - Three");
		clear (checkin);
        passInput (checkin,"checkinDate");
		clear (checkout);
		passInput (checkout,"checkOutDate");
		passInput(adultRoom,"2 - Two");
		passInput(childRoom,"3 Three");
		elementclick(searchElement);
		elementclick(select);
		elementclick(continueBtn);

        }
		
		
//		selectByVisibleText (location, search.getDataProperty("location")); 
//		selectByVisibleText (hotel, search.getDataProperty("hotels")); 
//		selectByVisibleText (roomType, search.getDataProperty("roomType")); 
//		selectByVisibleText (noOfRooms, search.getDataProperty("numberOfRooms")); 	
//		selectByVisibleText (adultRoom, search.getDataProperty("adultRoom"));
//		selectByVisibleText (childRoom, search.getDataProperty("childRoom")); 
		
			
		private void clear(WebElement checkin2) {
			// TODO Auto-generated method stub
			
		}

		public void searchPage1() {
			// TODO Auto-generated method stub
			
		}
		}
		