package org.isgn.testing;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Indecomm {

	public static WebDriver driver;

	@BeforeClass
	private void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\KannanTest\\driver\\chromedriver_84.0.4147.89.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}

	@AfterClass
	private void quitBrowser() {
		driver.quit();

	}

	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterMethod
	private void endTime() {

		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	private void tc1() {
		driver.findElement(By.id("email")).sendKeys("kanna608@gmail.com");

	}
	
	@Test
	private void tc2() {
		WebElement p = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		p.sendKeys("raji_9442432207");
		
	}
	
	@Test
	private void tc3() {
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test
	private void tc4() throws InterruptedException {
		Thread.sleep(5000);
	WebElement v = driver.findElement(By.xpath("(//span[text()='Kannan'])[1]"));
	String text = v.getText();
	if(text.equals("Kannan")) {
		System.out.println("I Love You Raji");
	}
	}

}
