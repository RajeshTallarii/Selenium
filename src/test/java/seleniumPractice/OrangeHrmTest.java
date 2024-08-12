package seleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1) Launch browser
//	2) open url
//		https://opensource-demo.orangehrmlive.com/
//	3) Provide username  - Admin
//	4) Provide password  - admin123
//	5) Click on Login button 
//	6) Verify the title of dashboard page   
//		Exp title : OrangeHRM
//	7) close browser

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\RTALLARI\\Downloads\\chromedriver-win64
		// (1)\\chromedriver-win64\\chromedrive.exe");
		// Launching the browser
		WebDriver driver = new ChromeDriver();
		// open the url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		SubmitBtn.click();
		// Verify title of dashboard page
		String act_title = driver.getTitle();
		System.out.println(act_title);
		String exp_title = "OrangeHRM";
		if (act_title.equals(exp_title)) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}
		// Label verification "dashboard"
		// String act_label="";

		String act_label = driver
				.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"))
				.getText();
		System.out.println(act_label);

		String exp_label = "Dashboard";
		System.out.println(act_label.equals(exp_label));
		if (act_label.equals(exp_label)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}
		// close browse
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		System.out.println(atag.size());
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		FluentWait fwait = new FluentWait(driver);
		//fwait.withTimeout(Duration.ofSeconds(50));
		Thread.sleep(5000);
		WebElement link = driver.findElement(By.linkText("OrangeHRM, Inc"));
		link.click();
		Set<String> windowIds = driver.getWindowHandles();
		for (String winid : windowIds) {
			System.out.println(winid);
		}
		System.out.println(windowIds);
		driver.quit();
	}

}
