package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://formstone.it/components/dropdown/demo/");
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.manage().window().maximize();
//		WebElement drpIn =driver.findElement(By.xpath("//select[@id='demo_label']"));
////		drpIn.click();
////		System.out.println(drpIn.getText());
//		Select drp= new Select(drpIn);
//		drp.selectByVisibleText("Indiana");getOptions
//		List<WebElement> opt= drp.();
//		System.out.println(opt.size());;
//		for(int i=0;i<opt.size();i++) {
//			System.out.println(opt.get(i).getText());
//		}
//		for(WebElement we:opt) {
//			we.getText();
//		}
		driver.findElement(By.cssSelector("li#menu-item-7128")).click();
		
		//driver.quit();
	}

}
