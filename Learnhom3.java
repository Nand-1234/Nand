package week1day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnhom3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nand");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nanthinimiffi@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    String title=driver.getTitle();
	    System.out.println("The title of the page is  :"+title);
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaftest");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krish");
	    driver.findElement(By.name("submitButton")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	 
	    
	}

}
