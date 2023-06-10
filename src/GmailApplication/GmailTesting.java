package GmailApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailTesting 
{
	public WebDriver driver;
	public void OpenGmailUrl()
	{
		driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
	}
	public void CreateGmailAccount() throws Exception
	{
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("sai");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("gujja");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys("gujjas0178");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("gujja@123");
		Thread.sleep(1000);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("gujja@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("phoneNumberId")).sendKeys("7386302056");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recoveryEmail")).sendKeys("naresh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("month")).click();
		Thread.sleep(1000);
		new Select (driver.findElement(By.id("month"))).selectByVisibleText("August");
		Thread.sleep(1000);
		driver.findElement(By.id("day")).sendKeys("18");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(1000);
		driver.findElement(By.id("gender")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Male");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div[2]/div[1]/div/div/button/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		Thread.sleep(1000);
	}
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		GmailTesting gt=new GmailTesting();
		gt.OpenGmailUrl();
		gt.CreateGmailAccount();

	}

}
