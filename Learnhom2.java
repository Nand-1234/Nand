package week1day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnhom2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Adyar");
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("2000");
		
		WebElement op=driver.findElement(By.name("industryEnumId"));
		Select options=new Select(op);
		options.selectByVisibleText("Computer Software");
		
		
		WebElement op1=driver.findElement(By.name("ownershipEnumId"));
		Select options1=new Select(op1);
		options1.selectByVisibleText("S-Corporation");
	
		
		WebElement op2=driver.findElement(By.id("dataSourceId"));
		Select options2=new Select(op2);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement op3=driver.findElement(By.name("marketingCampaignId"));
		Select options3=new Select(op3);
		options3.selectByIndex(6);
	
		
		WebElement op4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4=new Select(op4);
		options4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
	}

}
