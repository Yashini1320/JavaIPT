package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;
import com.interfaceelements.adactinapplicationelements;

import srcmainresources.FilereaderManager;

public class AdactinLoginpage extends Baseclass implements adactinapplicationelements {

	@FindBy(id = username_id)
	private WebElement username;

	@FindBy(name = password_name)
	private WebElement password;

	@FindBy(xpath = Login_xpath)
	private WebElement login;

	public AdactinLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public void validusernameandvalidpassword() throws IOException{ 
		
	FilereaderManager data= new FilereaderManager();
	passInput(username, data.getDataProperty("loginusername")); 
	passInput(password, data.getDataProperty("loginpassword"));
	elementclick(login);

}

}


