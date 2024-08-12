package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		String windowId =driver.getWindowHandle();
//		System.out.println(windowId);
//		String windowId2="3E187FC008AA5A6576B07C6946FA8C5E";
//		System.out.println(windowId.equals(windowId2));
//		if(windowId.equals(windowId2)) {
//			System.out.println("Test passed");
//		}
//		else
//		{
//			System.out.println("Test failed");
//		}
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		//search button
		driver.findElement(By.name("submit_search")).click();
		
		//link text & partial linktext
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Printed Chiffon")).click();
        driver.quit();
	}

}
