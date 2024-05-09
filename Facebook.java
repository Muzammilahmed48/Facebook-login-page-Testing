package facebook.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
  
boolean logo =driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
  System.out.println(logo);
		WebElement loginbtn=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		loginbtn.click();
		Thread.sleep(3000);
		WebElement nameinput=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		nameinput.click();
		nameinput.sendKeys("muzammil");
		WebElement surnameinput=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		surnameinput.click();
		surnameinput.sendKeys("nazar basha");
		WebElement mailinput= driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mailinput.click();
		mailinput.sendKeys("muzammil123@gmail.com");
		WebElement passwordinput=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		passwordinput.click();
		passwordinput.sendKeys("428328158");
		WebElement dayinput=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		dayinput.click();
		dayinput.sendKeys("12");
		WebElement monthinput=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		monthinput.click();
		monthinput.sendKeys("may");
		WebElement yearinput=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		yearinput.click();
		yearinput.sendKeys("2002");
		WebElement genderinput=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		genderinput.click();
		WebElement signupbutton=driver.findElement(By.xpath("//button[@name='websubmit']"));
		signupbutton.click();
		
		
	}

}
