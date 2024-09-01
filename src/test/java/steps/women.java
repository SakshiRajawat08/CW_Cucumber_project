package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class women {
	
	WebDriver driver;
	Actions actions;
	SoftAssert assert2;
	
	@Given("open the browser, enter the naaptol url")
	public void open_the_browser_enter_the_naaptol_url() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		driver.get("https://www.naaptol.com/");
		assert2 = new SoftAssert();
	    
	}

	@Given("select the apparel & accessories from shopping categories dropdown")
	public void select_the_apparel_accessories_from_shopping_categories_dropdown() {
		
		driver.findElement(By.cssSelector("[class='arrowNav']")).click();
		
		WebElement apparel = driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories.html'])[1]"));
		actions.moveToElement(apparel).build().perform();
	   
	}

	@When("user click on the bottom wear link")
	public void user_click_on_the_bottom_wear_link1() {
		
		driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories/womens-wear/leggings.html'])[1]")).click();
	    
	}

	@When("user click on anyproduct")
	public void user_click_on_anyproduct() {
		
		driver.findElement(By.xpath("(//*[@href='/leggings/water-repellent-stretchable-stylish-pants-by-ariki/p/12613789.html'])[2]")).click();
	    
	}

	@When("Add to cart page should be displayed")
	public void add_to_cart_page_should_be_displayed() {
		
		String soft = driver.findElement(By.linkText("Water Repellent Stretchable Stylish Pants By Ariki")).getText();
		assert2.assertEquals(soft, "Water Repellent Stretchable Stylish Pants By Ariki");
		assert2.assertAll();
	    
	}

	@Then("user click on the add to cart")
	public void user_click_on_the_add_to_cart() {
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		driver.findElement(By.linkText("Click here to Buy")).click();
		driver.navigate().to("https://www.naaptol.com/shop-online/apparels-accessories/womens-wear/leggings.html");
		
	    
	}


	@Then("user click on all the checkboxes from personalise search and click on set")
	public void user_click_on_all_the_checkboxes_from_personalise_search_and_click_on_set() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isexoutStock")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isfreeship")).click();
		
		driver.findElement(By.linkText("Set")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isexoutStock")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isfreeship")).click();
		
		driver.findElement(By.linkText("Set")).click();
	    
	}

	@Then("user click on the pakhi,American indigo,Stylexa,Vrindam Creations,Airiki from Brands")
	public void user_click_on_the_pakhi_american_indigo_stylexa_vrindam_creations_airiki_from_brands() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox38380")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox38398")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox38894")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox39033")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox39156")).click();
	}

	@Then("user click on the all the checkboxes from Price")
	public void user_click_on_the_all_the_checkboxes_from_price() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("priceFilterBox1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("priceFilterBox2")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("priceFilterBox3")).click();
	    
	}

	@Then("user click on the all the checkboxes from Discount")
	public void user_click_on_the_all_the_checkboxes_from_discount() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("discountFilterBox3")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("discountFilterBox2")).click();
	    
	}

	@Then("user click on the all the checkboxes from Type")
	public void user_click_on_the_all_the_checkboxes_from_type() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox1f1")).click();
	}

	@When("user select  most popular from sortby dropdown")
	public void user_select_most_popular_from_sortby_dropdown() throws InterruptedException {
		
		Thread.sleep(2000);
		
		WebElement sort = driver.findElement(By.id("sortByFilter"));
		Select by = new Select(sort);
		by.selectByValue("popular");
	    
	}
	
	@When("user search western wear in search bar")
	public void user_search_western_wear_in_search_bar() {
		
		driver.findElement(By.xpath("//*[@id='header_search_text']")).sendKeys("western wear");
	    
	}

	@When("user click on the search link")
	public void user_click_on_the_search_link() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='search'])[2]")).click();
	    
	}

	@Then("weatern wear page should be displayed in the page")
	public void weatern_wear_page_should_be_displayed_in_the_page() {
		
		
	    
	}

	@When("user click on the lehangas")
	public void user_click_on_the_lehangas() {
		
		driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories/womens-wear/lehengas.html'])[1]")).click();
	    
	}

	@When("user click on the Add to Compare1,Add to Compare2")
	public void user_click_on_the_add_to_compare1_add_to_compare2() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@checked='checked']")).click();
		driver.findElement(By.linkText("Set")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("cpid12426288")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("cpid12610415")).click();
	    
	}

	@When("user click on compare now")
	public void user_click_on_compare_now() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='compareButton']")).click();
	   
	}


	@When("user click on the Stylexa from Brand")
	public void user_click_on_the_stylexa_from_brand() {
		
		driver.findElement(By.cssSelector("[class='arrowNav']")).click();
		driver.findElement(By.xpath("(//*[@href=\"/shop-online/apparels-accessories.html\"])[2]")).click();
		
	    driver.findElement(By.xpath("(//*[@title='Stylexa'])[2]")).click();
	}

	@Then("Stylexa Apparel and Accessories page should be displayed")
	public void stylexa_apparel_and_accessories_page_should_be_displayed() {
		
		String stylex = driver.findElement(By.xpath("(//*[@class='head'])[1]")).getText();
		assert2.assertEquals(stylex, "Stylexa Apparel & Accessories");
		assert2.assertAll();
	    
	}
	
	@Then("takes screenshots")
	public void takes_screenshots() throws IOException {
	    
        TakesScreenshot st = (TakesScreenshot) driver;
	    
	    // getScreenshots is used to take screenshot
	    
	    File imageFile = st.getScreenshotAs(OutputType.FILE);
	    
	    // path where screenshots are present
	    
	    File imgFile = new File("C:\\Users\\singh\\OneDrive\\Pictures\\Screenshots\\SR09.png");
	    
	    FileUtils.copyFile(imageFile, imgFile);
	}

	@Then("close browsers")
	public void close_browsers() {
		
		driver.quit();
	    
	}



	
}