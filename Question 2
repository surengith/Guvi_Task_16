package com.JavaPracticeTask16.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsChrome {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the ChromeDriver that includes WebDriver setup
		WebDriver driver = new ChromeDriver();

		// Navigating to demoblaze.com
		driver.navigate().to("https://www.demoblaze.com/");

		// Maximizing the browser window
		driver.manage().window().maximize();

		// Getting the title of WebPage and printing
		String title = driver.getTitle();
		System.out.println("Title of the current WebPage is: " + title);

		// Verifying the title of WebPage and print the verification message
		if (title.contains("STORE")) {
			System.out.println("Page Landed on Correct Website");
		} else {
			System.out.println("Page Not Landed on Correct Website");
		}

		// Wait for 2 seconds and Close the browser
		Thread.sleep(2000);
		driver.close();
	}
}
