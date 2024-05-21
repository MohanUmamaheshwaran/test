package Hotel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel  {
	
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
		
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select select1=new Select(state);
		select1.selectByVisibleText("Tamil Nadu");
		
		
		
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.id("city"));
		Select select2=new Select(city);
		select2.selectByVisibleText("Chennai");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select select3=new Select(room);
		select3.selectByVisibleText("Luxury");
		
		WebElement check_in = driver.findElement(By.name("check_in"));
		check_in.click();
		WebElement in_date = driver.findElement(By.xpath("//a[text()='28']"));
		in_date.click();
		
		
		WebElement check_out = driver.findElement(By.name("check_out"));
		check_out.click();
		WebElement out_date = driver.findElement(By.xpath("//a[text()='30']"));
		out_date.click();
		
		WebElement no_of_rooms = driver.findElement(By.id("no_rooms"));
		Select select4=new Select(no_of_rooms);
		select4.selectByVisibleText("2-Two");
		
		WebElement no_of_adults = driver.findElement(By.id("no_adults"));
		Select select5=new Select(no_of_adults);
		select5.selectByVisibleText("3-Three");
		
		WebElement no_of_child = driver.findElement(By.id("no_child"));
		no_of_child.click();
		
		no_of_child.sendKeys("2");
		
		
		WebElement framesearch= driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(framesearch);
		
		WebElement btn_search = driver.findElement(By.id("searchBtn"));
		btn_search.click();
		
		driver.switchTo().parentFrame();
		
		
		
		WebElement hotelname = driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Luxury']"));
		String text3 = hotelname.getText();
		System.out.println(text3);
		
		WebElement gettxtprice = driver.findElement(By.xpath("//strong[@class='total-prize'][1]"));
		String text4= gettxtprice.getText();
		System.out.println(text4);
		 
		WebElement btn_continue = driver.findElement(By.xpath("//a[text()='Continue'][1]"));
		btn_continue.click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
		
		WebElement text_bookhotel = driver.findElement(By.xpath("//a[text()='Book Hotel']"));
		String text5 = text_bookhotel.getText();
		System.out.println(text5);
		
		WebElement radiobtn = driver.findElement(By.id("own"));
		radiobtn.click();
		
		WebElement sa_title = driver.findElement(By.id("user_title"));
		Select select6=new Select(sa_title);
		select6.selectByVisibleText("Mr.");
		
		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Mohan");
		
		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("sam");
		
		WebElement phnnum = driver.findElement(By.id("user_phone"));
		phnnum.sendKeys("7358559867");
		
		WebElement email = driver.findElement(By.id("user_email"));
		email.sendKeys("sammohan027@gmail.com");
		
		WebElement chckbtn = driver.findElement(By.id("gst"));
		chckbtn.click();
		
		WebElement gst_no = driver.findElement(By.id("gst_registration"));
		gst_no.sendKeys("9043592058");
		
		WebElement com_name = driver.findElement(By.id("company_name"));
		com_name.sendKeys("Greens Tech OMR Branch");
		
		WebElement com_address = driver.findElement(By.id("company_address"));
		com_address.sendKeys("Thoraipakkam");
		
		WebElement nextbtn = driver.findElement(By.id("step1next"));
		nextbtn.click();
		
		WebElement Early_btn = driver.findElement(By.id("early"));
		Early_btn.click();
		
		WebElement otherreq = driver.findElement(By.id("other_request"));
		otherreq.sendKeys("very Good");
		
		WebElement nextbtn2 = driver.findElement(By.id("step2next"));
		nextbtn2.click();
		
		WebElement card = driver.findElement(By.xpath("//div[@class='credit-card pm']"));
		card.click();
		
		WebElement payment_type = driver.findElement(By.id("payment_type"));
		Select select7=new Select(payment_type);
		select7.selectByVisibleText("Debit Card");
		
		WebElement card_type = driver.findElement(By.id("card_type"));
		Select select8=new Select(card_type);
		select8.selectByVisibleText("Visa");
		
		WebElement card_no= driver.findElement(By.id("card_no"));
		card_no.sendKeys("5555555555552222");
		
		WebElement nameoncard= driver.findElement(By.id("card_name"));
		nameoncard.sendKeys("Mohan");
		
		WebElement month= driver.findElement(By.id("card_month"));
		Select select9=new Select(month);
		select9.selectByVisibleText("June");
		
		WebElement cvv_no= driver.findElement(By.id("cvv"));
		cvv_no.sendKeys("027");
		
		
		WebElement submitbtn = driver.findElement(By.id("submitBtn"));
		submitbtn.click();
		
		WebElement order_id = driver.findElement(By.xpath("//h2[@name='booking-code']/strong"));
		String text6 = order_id.getText();
		System.out.println(text6);
		
		WebElement confrm_booking = driver.findElement(By.xpath("//h2[contains(text(),' Booking is Confirmed ')]"));
		String text7 = confrm_booking.getText();
		System.out.println(text7);
		
		WebElement hotel_name = driver.findElement(By.xpath("(//div[@class='seccess-box text-center']//strong)[2]"));
		String text8 = hotel_name.getText();
		System.out.println(text8);
		
		WebElement gotohome = driver.findElement(By.xpath("//button[text()='Go To Home']"));
		gotohome.click();
		
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Welcome Mohan')]"));
		click.click();
		
		WebElement myacct = driver.findElement(By.xpath("//a[text()='My Account']"));
		myacct.click();
		
		WebElement gettextbooking = driver.findElement(By.xpath("//div[@class='col-md-5'][1]"));
		String text9 = gettextbooking.getText();
		System.out.println(text9);
		
		WebElement orderid = driver.findElement(By.xpath("(//div[@class='room-code']//span)[1]"));
		String text10 = orderid.getText();
		System.out.println(text10);
		
		WebElement hotelname1 = driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Luxury']"));
		String text11 = hotelname1.getText();
		System.out.println(text11);
		
		
		WebElement getprice = driver.findElement(By.xpath("//strong[@class='total-prize'][1]"));
		String text12= getprice.getText();
		System.out.println(text12);
		
		WebElement btn_edit = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		btn_edit.click();
		
		WebElement check_in2 = driver.findElement(By.name("check_in"));
		check_in2.click();
		WebElement modify_date = driver.findElement(By.xpath("//a[text()='29']"));
		modify_date.click();
		
		WebElement confrm_btn = driver.findElement(By.xpath("//button[text()='Confirm']"));
		confrm_btn.click();
		
		WebElement msg = driver.findElement(By.xpath("//li[@class='alertMsg']"));
		String text13 = msg.getText();
		System.out.println(text13);
		
		WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'Welcome Mohan')]"));
		click1.click();
		
		WebElement myacct1 = driver.findElement(By.xpath("//a[text()='My Account']"));
		myacct1.click();
		
		WebElement gettextbooking1 = driver.findElement(By.xpath("//div[@class='col-md-5'][1]"));
		String text14 = gettextbooking1.getText();
		System.out.println(text14);
		
		WebElement orderid2= driver.findElement(By.xpath("(//div[@class='room-code']//span)[1]"));
		String tex = orderid2.getText();
		System.out.println(tex);
		
		WebElement hotelname2 = driver.findElement(By.xpath("//h5[text()='Hyatt Regency Chennai Luxury']"));
		String tex1 = hotelname2.getText();
		System.out.println(tex1);
		
		
		WebElement getprice1 = driver.findElement(By.xpath("//strong[@class='total-prize'][1]"));
		String tex2= getprice1.getText();
		System.out.println(tex2);
		
		WebElement cancel_btn = driver.findElement(By.xpath("//a[text()='Cancel']"));
		cancel_btn.click();
		
		
		Alert a = driver.switchTo().alert();
		a.accept();
	
		WebElement msg1 = driver.findElement(By.xpath("//li[@class='alertMsg']"));
		String tex3 = msg1.getText();
		System.out.println(tex3);
	
	
	

}}
