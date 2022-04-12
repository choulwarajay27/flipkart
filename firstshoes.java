package maventest.testmaven;

import java.io.File;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class firstshoes {
	WebDriver driver;
	
	@Test
	void driversetting(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\browsers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); //for incognito mode
		options.addArguments("--incognito");//for incognito mode
		driver= new ChromeDriver(options);//for incognito mode
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.manage().window().maximize();//maximize the window
		}
	@Test
	void shoes(){
		driver.get("https://www.flipkart.com/");//open flipkart
		driver.findElement(By.xpath("//button[@Class='_2KpZ6l _2doB4z']")).click();
		//login window will be closed
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("shoes");
		//Type ‘shoes’ in the search textbox and click on the Search button.
		driver.findElement(By.xpath("//button[@Class='L0Z3Pu']")).click();
		//Type ‘shoes’ in the search textbox and click on the Search button.
		driver.findElement(By.xpath("//div[@Class='_5THWM1']//div[3]")).click();
		//Click on Sort option: Price – Low to High 
				
	}

}
