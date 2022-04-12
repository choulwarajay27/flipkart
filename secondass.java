package maventest.testmaven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class secondass {
	WebDriver wb;
	String value;
	String v1;
	String v2;
	String v3;
	String v4;
	@Test
	void setting(){
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\browsers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); //for incognito mode
		options.addArguments("--incognito");//for incognito mode
		wb = new ChromeDriver(options);//for incognito mode
		wb.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		wb.manage().window().maximize();//maximize the window
		
	}
	@Test(priority=0)
	void input(){
		try {
			FileInputStream fs = new FileInputStream("C:\\Users\\Ajay\\Desktop\\Book2.xlsx");
			XSSFWorkbook wk = new XSSFWorkbook(fs);
			XSSFSheet objsheet = wk.getSheet("Sheet1");
			
			XSSFRow row = objsheet.getRow(0);
			
			value = row.getCell(0).getStringCellValue();
			v1 = row.getCell(1).getStringCellValue();
			v2 = row.getCell(2).getStringCellValue();
			v3 = row.getCell(3).getStringCellValue();
			v4 = row.getCell(4).getStringCellValue();
			
			wk.close();
			fs.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	void sp(){
		wb.get(value);
		wb.findElement(By.xpath(v1)).click();
		wb.findElement(By.xpath(v2)).sendKeys("shoes");
		
		wb.findElement(By.xpath(v3)).click();
		
		wb.findElement(By.xpath(v4)).click();
		wb.findElement(By.xpath("//div[@data-id='SHOFZ6KYRXERHEEA']")).click();
		
		
		
	}

}
