package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertTextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
         Alert objAlert=driver.switchTo().alert();
//		Alert alertWindow =mywait.until(ExpectedConditions.alertIsPresent());
//	    System.out.println(alertWindow.getText());
         
         objAlert.sendKeys("RAJ");
        System.out.print(objAlert.getText());
         //objAlert.accept();
	    
	    
	    
		


	}

}
