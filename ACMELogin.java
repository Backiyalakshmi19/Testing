package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();  
		ChromeDriver driver=new ChromeDriver();  
		driver.get("https://acme-test.uipath.com/login"); 
		
		WebElement eleUserName=driver.findElement(By.id("email"));
		eleUserName.sendKeys("kumar.testleaf@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button [@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		System.out.println("The title is :"+driver.getTitle());
	
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();
		


	}

}
