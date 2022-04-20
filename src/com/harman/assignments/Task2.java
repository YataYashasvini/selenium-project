package com.harman.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Core java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.goto.com/meeting/");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.partialLinkText("Try Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("John");
		driver.findElement(By.id("last-name")).sendKeys("Wick");
		driver.findElement(By.name("Email")).sendKeys("John@gmail.com");
		driver.findElement(By.id("contact-number")).sendKeys("9988776655");
		driver.findElement(By.name("Password")).sendKeys("johnk9988");
		
		Select selectCompanySize=new Select(driver.findElement(By.id("CompanySize")));
	    selectCompanySize.selectByValue("2");
	    
	    driver.findElement(By.partialLinkText("Start My Trial")).click();
	    
		
	}

}
