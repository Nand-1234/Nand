package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelHome1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nanthini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Senguttuvan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nanthinimiffi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9940331914");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(10000);
	}

}