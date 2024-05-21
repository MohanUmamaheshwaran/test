package Hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class booking {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtemail = driver.findElement(By.xpath("//input[@id= 'email']"));
		txtemail.sendKeys("sammohan027@gmail.com");
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@id= 'pass']"));
		txtpass.sendKeys("Cricket@123");
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		clickbtn.click();
		
		Thread.sleep(3000);
		
		WebElement text = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String text2 = text.getText();
		System.out.println(text2);
		Thread.sleep(3000);
		
		WebElement clickhotel= driver.findElement(By.xpath("//h3[text()='Hotel Booking']"));
		clickhotel.click();
		
		WebElement framesearch= driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(framesearch);
		
		WebElement btn_search = driver.findElement(By.id("searchBtn"));
		btn_search.click();
		
		driver.switchTo().parentFrame();
		
		
		WebElement errmsgstate = driver.findElement(By.xpath("//div[@id='invalid-state']"));
		String text3 = errmsgstate.getText();
		System.out.println(text3);
		
		WebElement errmsgcity = driver.findElement(By.xpath("//div[@id='invalid-city']"));
		String text4 = errmsgcity.getText();
		System.out.println(text4);
		
		WebElement errmsgcheckindate = driver.findElement(By.xpath("//div[@id='invalid-check_in']"));
		String tex = errmsgcheckindate.getText();
		System.out.println(tex);
		
		WebElement errmsgcheckoutdate = driver.findElement(By.xpath("//div[@id='invalid-check_out']"));
		String tex1 = errmsgcheckoutdate.getText();
		System.out.println(tex1);
		
		WebElement errmsgno_of_room = driver.findElement(By.xpath("//div[@id='invalid-no_rooms']"));
		String tex2 = errmsgno_of_room.getText();
		System.out.println(tex2);
		
		WebElement errmsg_no_of_adults = driver.findElement(By.xpath("//div[@id='invalid-no_adults']"));
		String tex3 = errmsg_no_of_adults.getText();
		System.out.println(tex3);
		
		
		
		
		
		

}}
