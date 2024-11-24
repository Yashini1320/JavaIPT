package com.pageobjectmodel;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;
import com.interfaceelements.adactinapplicationelements;
import srcmainresources.FilereaderManager;

public class AdactinBookpage extends Baseclass implements adactinapplicationelements {

	@FindBy(id = firstName_id)
	private WebElement firstName;
	@FindBy(id = LastName_id)
	private WebElement lastName;
	@FindBy(id = address_id)
	private WebElement address;
	@FindBy(id = creditNo_id)
	private WebElement creditNo;
	@FindBy(id = creditType_id)
	private WebElement creditType;
	@FindBy(id = selectMonth_id)
	private WebElement selectMonth;
	@FindBy(id = selectYear_id)
	private WebElement selectYear;
	@FindBy(id = cvvNumber_id)
	private WebElement cvv;
	@FindBy(id = bookNow_id)
	private WebElement bookNow;
	@FindBy(id = Logout_id)
	private WebElement logout;
	
	public AdactinBookpage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void bookhotel() throws IOException, InterruptedException {
		FilereaderManager book = new FilereaderManager();
		passInput(firstName,book.getDataProperty("firstName"));
		passInput(lastName, book.getDataProperty("lastName"));
		passInput (address, book.getDataProperty("address"));		
		passInput(creditNo, book.getDataProperty("creditNo"));
		passInput(creditType, book.getDataProperty("creditType"));
		passInput(selectMonth, book.getDataProperty("expiryDate"));
		passInput(selectYear, book.getDataProperty("year"));
		passInput(cvv, book.getDataProperty("cvv"));
		elementclick(bookNow);
		explicitwait(bookNow, 40);
		takesscreenshot(book.getDataProperty("path"));
		explicitwait(logout, 30);

	}

//	private void click(WebElement bookNow2) {
//		// TODO Auto-generated method stub
//
//	}

	private void takesscreenshot(Object dataProperty) {
		// TODO Auto-generated method stub

	}

	private void explicitwait(WebElement logout2, int i) {
		// TODO Auto-generated method stub

	}

}
