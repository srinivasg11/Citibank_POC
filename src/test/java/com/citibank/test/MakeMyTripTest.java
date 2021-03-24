package com.citibank.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

import com.citibank.pages.MakeMyTripPages;

import io.github.bonigarcia.seljup.SeleniumJupiter;

@ExtendWith(SeleniumJupiter.class)
public class MakeMyTripTest {

	MakeMyTripPages makemytrip_page = new MakeMyTripPages();

	// This test is to search for One way Flights on Makemytrip Application
	@Test()
	void searchForFlights(ChromeDriver driver) throws InterruptedException {
		makemytrip_page.navigateTo_SearchFlights(driver);
	}
}