package in.com.hcl.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import in.com.hcl.Utilities.Crossbrowser;
import in.com.hcl.Utilities.GenericMethods;
import in.com.hcl.Utilities.Crossbrowser;
import junit.framework.Assert;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Pages.homepage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@RunWith(Cucumber.class)
public class INGBankingStepDefinition extends Crossbrowser {

	homepage home = new homepage(driver);
	homepage hp = PageFactory.initElements(driver, homepage.class);

	public static WebDriver driver;

	Test result;

	GenericMethods gen = new GenericMethods();

	Properties prop = new Properties();

	/*-----------Scenario-1------------------------*/
	@Given("^user is on Homepage$")
	public void user_is_on_homepage() throws Throwable {
		BrowserIntialisation();
	}

	@When("^clicks on Bank and Save$")
	public void clicks_on_bank_and_Save() throws Throwable {

		driver.findElement(By.xpath("//span[contains(text(),'Bank & Save')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@And("^user click on Personal Term Deposit$")
	public void user_click_on_personal_Term_Deposit() throws Throwable {
		homepage home = new homepage(driver);
		homepage hp = PageFactory.initElements(driver, homepage.class);

		/*
		 * WebElement element=driver.findElement(By.xpath(
		 * "//li[@class='menu-cell active']//div[@class='column intro bg-gray']//li[2]//a[1]//div[1]"
		 * )); element.click(); Actions action=new Actions(driver);
		 * 
		 * action.moveToElement(element).build().perform();
		 * 
		 * 
		 * WebElement el=driver.findElement(By.xpath(
		 * "//h6[contains(text(),'Personal Term Deposit')]")); el.click();
		 */

		homepage.PTM();
	}

	@Then("^Personal Term Deposit Page is populated$")
	public void personal_term_deposit_page_is_populated() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Term Deposits. Bank Term Deposits - ING", title);

	}

	/*--------------------------Scenario-2-----------------------*/
	@Given("^user is on Personal Deposit Page$")
	public void user_is_on_personal_deposit_page() throws Throwable {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	@When("^user clicks on OpenNow$")
	public void user_clicks_on_opennow() throws Throwable {
		// driver.findElement(By.xpath("//div[@class='savings-main']//a[@class='ING-button
		// blue'][contains(text(),'Open now')]")).click();
		homepage home = new homepage(driver);
		homepage hp = PageFactory.initElements(driver, homepage.class);
		hp.pop();
		Thread.sleep(1000);
		hp.customer();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	/*
	 * @And("^user clicks on New Customer$") public void
	 * user_clicks_on_new_customer() throws Throwable { homepage home=new
	 * homepage(driver); homepage hp = PageFactory.initElements(driver,
	 * homepage.class); Thread.sleep(1000); hp.customer(); try{ String
	 * title=driver.getTitle(); System.out.println(title); } catch
	 * (NoSuchElementException e){ e.printStackTrace();
	 * 
	 * }
	 * 
	 * }
	 */

	@Then("^user is on Open Personal Term Deposit Page$")
	public void user_is_on_open_personal_term_deposit_page() throws Throwable {
		String Urlpage = driver.getCurrentUrl();
		System.out.println(Urlpage);

		// Assert.assertEquals(Urlpage,prop.getProperty("NavigateURL"));

	}

	/*----------------------Scenario-3-------------------*/

	@Given("^user is on Personal Term Deposit Page$")
	public void user_is_on_personal_term_deposit_page() throws Throwable {
		homepage home = new homepage(driver);
		homepage hp = PageFactory.initElements(driver, homepage.class);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Secure Banking Login - ING")) {
			System.out.println("User is on New Page");
		} else {
			System.out.println("User is on different page");
		}
	}

	@When("^user fill the form with following details$")
	public void user_fill_the_form_with_following_details(DataTable data) throws Throwable {

		List<List<String>> obj = data.raw();

		String absolutepath = System.getProperty("user.dir");
		String filepath = absolutepath + "\\ScreenShots";

		homepage home = new homepage(driver);
		homepage hp = PageFactory.initElements(driver, homepage.class);

		hp.single();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//input[@aria-label='Nationality (Citizenship)']")).sendKeys(obj.get(0).get(0));

		driver.findElement(By.cssSelector("input[aria-label='Given name']")).sendKeys(obj.get(0).get(1));

		driver.findElement(By.cssSelector("input[aria-label='Middle name (if you have one)']"))
				.sendKeys(obj.get(0).get(2));

		driver.findElement(By.cssSelector("input[aria-label='Family name']")).sendKeys(obj.get(0).get(3));

		driver.findElement(By.cssSelector("input[aria-label='Date of birth (dd/mm/yyyy)']"))
				.sendKeys(obj.get(0).get(4));
		driver.findElement(By.cssSelector("input[aria-label='Place of birth']")).sendKeys(obj.get(0).get(5));

		driver.findElement(By.cssSelector("input[aria-label='Country of birth']")).sendKeys(obj.get(0).get(6));

		driver.findElement(By.cssSelector("input[aria-label='Email address']")).sendKeys(obj.get(0).get(7));

		driver.findElement(By.cssSelector("input[aria-label='Mobile']")).sendKeys(obj.get(0).get(8));
		WebElement errormsg = driver.findElement(By.cssSelector("span[id='mobilePhoneInput_validationErrorSpan']"));
		String m1 = errormsg.getText();
		System.out.println(m1);
		driver.findElement(By.cssSelector("input[aria-label='Other phone (optional)']")).sendKeys(obj.get(0).get(9));
		driver.findElement(By.cssSelector("input[aria-label='Enter address']")).sendKeys(obj.get(0).get(10));

		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//span[text()='Same as residential address']")).click();
		hp.unittype();

		WebElement restradio = driver.findElement(By.cssSelector("label[for='greaterThanThree']"));
		restradio.click();
		// Boolean radiobt = restradio.isSelected();
		WebElement tax = driver.findElement(By.xpath("//label[contains(text(),'No')]"));
		tax.click();
		driver.findElement(By.cssSelector("[aria-describedby='securityQuestion_validationErrorSpan']"))
				.sendKeys(obj.get(0).get(11));
		// driver.navigate().back();
		// hp.pop();
		// driver.findElement(By.cssSelector("//span[text()='Continue']")).click();
		File Browerscreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Browerscreenshot, new File(filepath + "/" + "_" + System.nanoTime() + ".png"));

	}

	@And("^clicks on continue$")
	public void clicks_on_continue() throws Throwable {

	}

	/*---------------------------Scenario-4------------------------*/
	@Given("^User is on Personal Term Deposite Page$")

	public void user_is_on_personal_term_deposite_page() throws Throwable {
		homepage home = new homepage(driver);
		homepage hp = PageFactory.initElements(driver, homepage.class);
		driver.navigate().to("https://www.ing.com.au/savings/term-deposit.html");
		hp.pop();
		Thread.sleep(1000);
		hp.customer();
		//driver.switchTo().alert().accept();
		String url = driver.getCurrentUrl();
		System.out.println(url);

		String title = driver.getTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("Secure Banking Login - ING")) {
			System.out.println("User is on New Page");
		} else {
			System.out.println("User is on different page");
		}
	}

	@When("^User provides Invalid Date$")
	public void user_provides_invalid_date(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();

		String absolutepath = System.getProperty("user.dir");
		String filepath = absolutepath + "\\ScreenShots";

		homepage home = new homepage(driver);
		homepage hp = PageFactory.initElements(driver, homepage.class);
				
		hp.single();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,200)");

		driver.findElement(By.xpath("//input[@aria-label='Nationality (Citizenship)']")).sendKeys(obj.get(0).get(0));

		driver.findElement(By.cssSelector("input[aria-label='Given name']")).sendKeys(obj.get(0).get(1));

		driver.findElement(By.cssSelector("input[aria-label='Middle name (if you have one)']"))
				.sendKeys(obj.get(0).get(2));

		driver.findElement(By.cssSelector("input[aria-label='Family name']")).sendKeys(obj.get(0).get(3));

		driver.findElement(By.cssSelector("input[aria-label='Date of birth (dd/mm/yyyy)']"))
				.sendKeys(obj.get(0).get(4));

		driver.findElement(By.cssSelector("input[aria-label='Place of birth']")).sendKeys(obj.get(0).get(5));
		Thread.sleep(2000);

		WebElement err = driver.findElement(By.xpath("//span[contains(text(),'Please enter something here')]"));

		String mesg = err.getText();

		System.out.println(err.getText());
		Assert.assertEquals("Please enter something here - this field can't be blank", mesg);
		if (mesg.equals("Please enter something here - this field can't be blank")) {
			System.out.println("Message displays correctly");
		} else {
			System.out.println("Messages displays incorrectly");
		}
		Assert.assertEquals("Please enter something here this field can't be blank", mesg);

		driver.findElement(By.cssSelector("input[aria-label='Country of birth']")).sendKeys(obj.get(0).get(6));
		
		driver.findElement(By.cssSelector("input[aria-label='Email address']")).sendKeys(obj.get(0).get(7));

		driver.findElement(By.cssSelector("input[aria-label='Mobile']")).sendKeys(obj.get(0).get(8));
		
		WebElement errormsg = driver.findElement(By.xpath("//span[contains(text(),'mobile numbers must start with ')]"));
		
		String m1 = errormsg.getText();
		System.out.println(m1);
		
	}

	@Then("^user should get error message$")
	public void user_should_get_error_message() throws Throwable {

	}

}
