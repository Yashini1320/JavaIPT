package com.interfaceelements;

public interface adactinapplicationelements {
	//Adactin Login
	String username_id= "username";
	String password_name="password";
	String Login_xpath="//input[@type='Submit']"; 
	
	//Adactin search
	String Location_id="location"; 
	String hotels_id="hotels";
	String roomType_id="room_type"; 
	String numberOfRooms_id=" room_nos";
	String checkin_id="datepick_in";
	String checkout_id="datepick_out";
	String adultRoom_id="adult_room"; 
	String childRoom_id="child_room"; 
	String searchBtn="Submit";
	String selectBtn_id="radiobutton_0"; 
	String continue_id="continue"; 
	
	//Adactin booking
	String firstName_id="first_name"; 
	String LastName_id="last_name";
	String address_id="address";
	String creditNo_id="cc_num"; 
	String creditType_id="cc_type";
	String selectMonth_id="cc_exp_month"; 
	String selectYear_id="cc_exp_year";
	String cvvNumber_id="cc_cvv";
	String bookNow_id="book_now";
	
	//Adactin Logout
	String Logout_id="//input[@id='logout']";


}
