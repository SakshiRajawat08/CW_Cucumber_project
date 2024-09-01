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
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mens {
	
	WebDriver driver;
	Actions actions;
	SoftAssert assert1;
	
	@Given("open the browser, enter the naptol url in men")
	public void open_the_browser_enter_the_naptol_url_in_men() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		driver.get("https://www.naaptol.com/");
		assert1 = new SoftAssert();
	    
	}
	
	@And("select the Apparel & Accessories from shopping categories dropdown in men")
	public void select_the_apparel_accessories_from_shopping_categories_dropdown_in_men() {
	    
        driver.findElement(By.cssSelector("[class='arrowNav']")).click();
		
		WebElement apparel = driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories.html'])[1]"));
		actions.moveToElement(apparel).build().perform();
	}


	@When("user click on the innerwear link")
	public void user_click_on_the_innerwear_link() {
		
		driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories/mens-wear/mens-innerwear.html'])[1]")).click();
	    
	}

	@Then("user click on the all the checkboxes and click on set")
	public void user_click_on_the_all_the_checkboxes_and_click_on_set() throws InterruptedException {
		
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

	@When("user click on the Scottish club2,Branded from Brand")
	public void user_click_on_the_scottish_club2_branded_from_brand() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox38493")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox8313")).click();
	    
	}

	@Then("user click on the checkbox from Price")
	public void user_click_on_the_checkbox_from_price() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("priceFilterBox1")).click();
	    
	}

	@Then("user click on the more than fifty% discount")
	public void user_click_on_the_more_than_fifty_discount() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("discountFilterBox1")).click();
	    
	}

	@Then("user click on the black color")
	public void user_click_on_the_black_color() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f1")).click();
	    
	}
	
	@Then("take screenshot")
	public void take_screenshot() throws IOException {
		
        TakesScreenshot st = (TakesScreenshot) driver;
	    
	    // getScreenshots is used to take screenshot
	    
	    File imageFile = st.getScreenshotAs(OutputType.FILE);
	    
	    // path where screenshots are present
	    
	    File imgFile = new File("C:\\Users\\singh\\OneDrive\\Pictures\\Screenshots\\SR09.png");
	    
	    FileUtils.copyFile(imageFile, imgFile);
	    
	}

	@Then("close browser")
	public void close_browser() {
		
		driver.quit();
	    
	}



	
}


