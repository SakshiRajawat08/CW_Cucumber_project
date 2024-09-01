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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class accessories {
	
	WebDriver driver;
	Actions actions;
	
	@Given("open the browser, enter the naaptol url in acc")
	public void open_the_browser_enter_the_naaptol_url_in_acc() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		driver.get("https://www.naaptol.com/");
	    
	}

	@Given("select the aparel & acessories from shopping categories dropdown")
	public void select_the_aparel_acessories_from_shopping_categories_dropdown() {
		
        driver.findElement(By.cssSelector("[class='arrowNav']")).click();
		
		WebElement app = driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories.html'])[1]"));
		actions.moveToElement(app).build().perform();
	    
	}

	@When("user click on the eyewear link")
	public void user_click_on_the_eyewear_link() {
		
		driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories/clothing-accessories/eyewear.html'])[1]")).click();
	    
	}

	@Then("user click on the anyproduct")
	public void user_click_on_the_anyproduct() {
		
		driver.findElement(By.xpath("(//*[@href='/eyewear/rimless-one-power-reading-glasses-b1-g1-2rg1/p/12613272.html'])[2]")).click();
	}

	@Then("user click on the with case on delivery,exclude out of stock and click on set")
	public void user_click_on_the_with_case_on_delivery_exclude_out_of_stock_and_click_on_set() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isexoutStock")).click();
		
		driver.findElement(By.linkText("Set")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("isexoutStock")).click();
		
		driver.findElement(By.linkText("Set")).click();
	    
	}

	@Then("user click on the all checkboxes of brand")
	public void user_click_on_the_all_checkboxes_of_brand() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox8313")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox39120")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox8313")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("brandFilterBox39120")).click();
	    
	}

	@Then("user click on the forty-fifty% discount")
	public void user_click_on_the_forty_fifty_discount() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("discountFilterBox1")).click();
	}

	@When("user click on the mens wallet link")
	public void user_click_on_the_mens_wallet_link() {
		
		driver.findElement(By.linkText("Men's Wallets")).click();
	}

	@Then("user click on the checkbox of card slot")
	public void user_click_on_the_checkbox_of_card_slot() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f1")).click();
    }

	@Then("user click on the all the checkboxes of type in mens wallet")
	public void user_click_on_the_all_the_checkboxes_of_type_in_mens_wallet() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f2")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox1f2")).click();
	}

	@When("user click on the sunglasses link")
	public void user_click_on_the_sunglasses_link() {
		
		driver.findElement(By.xpath("(//*[@href='/shop-online/apparels-accessories/clothing-accessories/sunglasses.html'])[1]")).click();
	    
	}

	@Then("user click on the eyeglasses checkbox")
	public void user_click_on_the_eyeglasses_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f1")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f1")).click();
	}

	@Then("user click on the full rim checkbox")
	public void user_click_on_the_full_rim_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f2")).click();
	}

	@Then("user click on the female checkbox")
	public void user_click_on_the_female_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("featureFilterBox0f3")).click();
	    
	}
	
	@Then("take a screenshot")
	public void take_a_screenshot() throws IOException {
	    TakesScreenshot st = (TakesScreenshot) driver;
	    
	    // getScreenshots is used to take screenshot
	    
	    File imageFile = st.getScreenshotAs(OutputType.FILE);
	    
	    // path where screenshots are present
	    
	    File imgFile = new File("C:\\Users\\singh\\OneDrive\\Pictures\\Screenshots\\SR09.png");
	    
	    FileUtils.copyFile(imageFile, imgFile);
	}

	@Then("close the browser")
	public void close_the_browser() {
		
		driver.quit();
	    
	}



	
}
	

	



