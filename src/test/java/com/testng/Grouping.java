package com.testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test (groups = "Transport")
	private void Car() {
		System.out.println("Car");
	}
	@Test (groups = "Transport")
	private void Bus() {
		System.out.println("Bus");
	}
	@Test (groups = Transport)
	private void Auto() {
		System.out.println("Auto");
	}
	private void Flipcart() {
		System.out.println("Flipcart");
	}
	private void Amazon() {
		System.out.println("Amazon");
	}
	private void Meesho() {
		System.out.println("Meesho");
	}


}
