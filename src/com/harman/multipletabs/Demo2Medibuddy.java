package com.harman.multipletabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Medibuddy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Core java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.medibuddy.in/");
		driver.findElement(By.id("wzrk-cancel")).click();
		
		driver.findElement(By.partialLinkText("For Employer")).click();
		
        List<String> windows=new ArrayList<String>(driver.getWindowHandles());
        
		System.out.println(windows.get(0));
		System.out.println(windows.get(1));
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("getInTouchName")).sendKeys("Yash");
		driver.findElement(By.id("getInTouchEmail")).sendKeys("Yash@gmail.com");
		driver.findElement(By.id("getInTouchMobile")).sendKeys("123456");
		//driver.findElement(By.id("getInTouchDesignation")).sendKeys("");
		//driver.findElement(By.id("getInTouchEmpCount")).sendKeys("");
		
		driver.findElement(By.xpath("//button[text()='Get In Touch']")).click();
		
	    String errorText = driver.findElement(By.xpath("(//div[contains(text(),'10 digit')]")).getText();
        System.out.println(errorText);
		
        driver.quit();
	}

}
