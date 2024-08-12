package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frrame {

	public static void ma(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frmin1");
		Thread.sleep(5000);
		WebElement drp=driver.findElement(By.xpath("//select[@id='course']"));
		Select SD=new Select(drp);
		SD.selectByVisibleText("Java");
	}

}
