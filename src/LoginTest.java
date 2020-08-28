

import org.testng.annotations.Tes

import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends TestBase{
    
	@Test(alwaysRun=true)
	public void Dologin()
	{
		
	WebElement element=driver.findElement(By.id("identifierId"));
	element.sendKeys("kr.nikhil21@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		WebElement element1=driver.findElement(By.name("password"));
		element.sendKeys("---------------");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
	}
}
