package stepDefinitionmercury;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MercuryTravelsClass {
	
	public WebDriver d;
	public WebElement holidaydest;
	public WebElement selectdest;
	public WebElement holidaybtn;
	public WebElement logo;
	public WebElement duration;
	public WebElement cal;
	public WebElement nxt;
	public WebElement dt;
	public WebElement type_of_holiday;
	public WebElement serbtn;
	

	@Given("Launch Site")
	public void launch_site() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    opt.addArguments("--remote-allow-origins=*");
	    
	    d = new ChromeDriver(opt);
	    d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    d.manage().window().maximize();
	    d.get("https://www.mercurytravels.co.in/");
	}
	@When("Check page title and get all link of the page")
	public void check_page_title_and_get_all_link_of_the_page() 
	{
	 String hometitle = d.getTitle();
		System.out.println("Title of the page :" + hometitle); 
		
		List <WebElement> homepagelinks = d.findElements(By.tagName("a"));
		System.out.println("Total links on home page :" + homepagelinks.size());
	}
	@When("Fill details on Holidays tab")
	public void fill_details_on_holidays_tab() {
		holidaydest = d.findElement(By.id("holiday_category_id"));
		holidaydest.click();
		holidaydest.sendKeys("jammu");
		
		//selectdest = d.findElement(By.cssSelector("#ui-id-180"));
		//selectdest = d.findElement(By.xpath("//*[@id=\'ui-id-52\']"));
		//selectdest = d.findElement(By.id("ui-id-16"));
		
		selectdest = d.findElement(By.xpath("//*[@id=\"ui-id-14\"]"));
		selectdest.click();
		
		
		
		holidaybtn = d.findElement(By.xpath("//*[@id=\"int_auto_comp_param\"]/div/div/div[3]/div/div/button"));
		holidaybtn.click();
		
		
	}
	@When("Fill other details of Holidays and click on search")
	public void fill_other_details_of_holidays_and_click_on_search() {
		
		duration = d.findElement(By.xpath("//select[@name='nights']"));
		
		Select dur = new Select(duration);
		
		dur.selectByVisibleText("5Nights / 6Days");
		
		cal = d.findElement(By.xpath("//input[@id='dphh1']"));
		cal.click();
		
		nxt = d.findElement(By.xpath("/html/body/div[16]/div[1]/table/thead/tr[1]/th[3]"));
		nxt.click();
		
		dt = d.findElement(By.xpath("/html/body/div[16]/div[1]/table/tbody/tr[4]/td[1]"));
		dt.click();
		
		type_of_holiday = d.findElement(By.xpath("//select[@name='theme']"));
		
		Select toh = new Select(type_of_holiday);
		toh.selectByVisibleText("Honeymoon");
		
		serbtn = d.findElement(By.xpath("//*[@id=\"dom_auto_comp_param\"]/div/div[5]/button"));
		serbtn.click();
	}
	@When("Click on Logo image")
	public void click_on_logo_image() 
	{
	 logo = d.findElement(By.xpath("/html/body/nav[2]/div/div[1]/div/a/img"));
	 logo.click();
	}
	@When("Click on Flight Tab")
	public void click_on_flight_tab() {
	    
	}
	@When("Fill details on Flight tab for one way")
	public void fill_details_on_flight_tab_for_one_way() {
	    
	}
	@When("Click on Modify Search and Select Other Date")
	public void click_on_modify_search_and_select_other_date() {
	    
	}
	@When("Click on Right Arrow")
	public void click_on_right_arrow() {
	    
	}
	@When("Click on Hotel tab")
	public void click_on_hotel_tab() {
	    
	}
	@When("Fill details for hotels")
	public void fill_details_for_hotels() {
	    
	}
	@When("Click on Symphony of Sea")
	public void click_on_symphony_of_sea() {
	    
	}
	@When("Click on Canada in winter from top menu under international holiday")
	public void click_on_canada_in_winter_from_top_menu_under_international_holiday() {
	    
	}
	@When("Click on Toronto and Details and book now")
	public void click_on_toronto_and_details_and_book_now() {
	    
	}
	@When("Click on Leh tour package")
	public void click_on_leh_tour_package() {
	    
	}
	@When("Click on Sell Forex online")
	public void click_on_sell_forex_online() {
	    
	}
	@When("Fill details for Forex")
	public void fill_details_for_forex() {
	    
	}
	@When("Click on Register button")
	public void click_on_register_button() {
	    
	}
	@Then("Check After Registration page")
	public void check_after_registration_page() {
	    
	}




}
