package com.JavaPracticeTask16.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsWikipedia {

	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the ChromeDriver that includes WebDriver setup
		WebDriver driver = new ChromeDriver();

		// Navigating to demoblaze.com
		driver.navigate().to("https://www.wikipedia.org/");

		// Maximizing the browser window
		driver.manage().window().maximize();

		// Find the search input field and enter the query
		WebElement searchForQuery = driver.findElement(By.xpath("//input[@id='searchInput']"));
		searchForQuery.sendKeys("Artificial Intelligence");

		// Click the submit button
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();

		// Click on the History section link
		WebElement historySection = driver.findElement(By.xpath("//a[@href='#History']"));
		historySection.click();

		// Get the title of current page
		System.out.println("Title of the webpage is: " + driver.getTitle());

		// Wait for 2 seconds and Close the browser
		Thread.sleep(2000);
		driver.close();
	}

}
