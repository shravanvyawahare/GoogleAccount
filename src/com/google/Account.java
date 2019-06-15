package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\group021\\Desktop\\Software\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		
		  driver.findElement(By.name("firstName")).sendKeys("shravan");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("lastName")).sendKeys("vyawahare");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("Username")).sendKeys("shr1.infoway");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("Passwd")).sendKeys("info@cdac");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("ConfirmPasswd")).sendKeys("info@cdac");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("7770070868");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//*[@id=\"gradsIdvPhoneNext\"]/span")).click();
		  Thread.sleep(2000);
		  
		  driver.close();
		  
		  
		
		
		
		
		
	
		

	}

}
