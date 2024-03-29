package com.harman.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FbSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Core java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Yash");
		driver.findElement(By.name("lastname")).sendKeys("Yata");
		driver.findElement(By.name("reg_email__")).sendKeys("hello123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hello123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("welcome123");
        
		driver.findElement(By.xpath("//input[@value='1']")).click();
	    
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("9");
		
		Select selectMonth=new Select(driver.findElement(By.name("birthday_month")));
		selectMonth.selectByValue("11");
		
		Select selectYear=new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("2000");
		
		//driver.findElement(By.name("websubmit")).click();
	}

}
