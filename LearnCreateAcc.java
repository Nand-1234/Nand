package week1day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnCreateAcc {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Nanthini");
		driver.findElement(By.name("lastname")).sendKeys("Senguttuvan");
		driver.findElement(By.name("reg_email__")).sendKeys("9940331914");
		driver.findElement(By.id("password_step_input")).sendKeys("Nand@99947");
		
		WebElement op=driver.findElement(By.id("day"));
		Select options=new Select(op);
		options.selectByValue("27");
		
		
		WebElement op1=driver.findElement(By.id("month"));
		Select options1=new Select(op1);
		options1.selectByValue("3");
	
		
		WebElement op2=driver.findElement(By.id("year"));
		Select options2=new Select(op2);
		options2.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		driver.manage().window().maximize();

	}

}
