package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {
//select one checkbox
	// total no of checkboxes
	// select all the checkboxes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement Third = driver.findElement(By.xpath("//input[@value='blue']"));
//		Third.click();
		List<WebElement> totalCheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		System.out.println(totalCheck.size());
		for (int i = 0; i < totalCheck.size(); i++) {
			totalCheck.get(i).click();
		}
//		for(WebElement checkBox:totalCheck) {
//			checkBox.click();
//		}
//		
		//driver.quit();
	}

}
