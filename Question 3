package com.JavaPracticeTask16.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocatorsFirefox {

	public static void main(String[] args) throws InterruptedException {

		// Create a new instance of the FirefoxDriver that includes WebDriver setup
		WebDriver driver = new FirefoxDriver();

		// Maximizing the browser window
		driver.manage().window().maximize();

		// Navigating to google.com
		driver.navigate().to("https://www.google.com/");

		// Printing the URL of current page
		System.out.println("URL of the current WebPage is: " + driver.getCurrentUrl());

		// Reloading the current page
		driver.navigate().refresh();

		// Wait for 2 seconds and Close the browser
		Thread.sleep(2000);
		driver.close();

	}

}
