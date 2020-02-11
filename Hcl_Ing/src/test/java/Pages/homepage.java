package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	public static WebDriver driver;

	@FindBy(xpath = "//li[@class='menu-cell active']//div[@class='column intro bg-gray']//li[2]//a[1]//div[1]")
	public static WebElement personalTermDeposit;

	@FindBy(xpath = "//h6[contains(text(),'Personal Term Deposit')]")
	public static WebElement prest;

	@FindBy(xpath = "//div[@class='savings-main']//a[@class='ING-button blue'][contains(text(),'Open now')]")
	public static WebElement opennow;

	@FindBy(linkText = "New customer")
	public static WebElement newcustomer;

	@FindBy(xpath = "//label[contains(text(),'Single')]")
	public static WebElement radiobtn;

	@FindBy(xpath = "//input[@aria-label='Nationality (Citizenship)']")
	public static WebElement nationality;

	@FindBy(xpath = "//*[@id='dropMenuItem']/div/paper-item[1]")
	public static WebElement title;

	@FindBy(xpath = "//input[@id='titleDropdown_targetInput']")
	public static WebElement radibtn1;

	@FindBy(xpath = "//span[text()='Professor']")
	public static WebElement radibtn2;

	@FindBy(xpath = "//label[contains(text(),'Male')]")
	public static WebElement radibtn3;

	@FindBy(xpath = "input[aria-label='Given name']")
	public static WebElement name;

	@FindBy(xpath = "//div[contains(@class,'address-parent style-scope ing-structured-address flip-address-form')]//ing-input[@id='unit-number']//input[@id='inputField']")
	public static WebElement unit;

	@FindBy(xpath = "//div[contains(@class,'address-parent style-scope ing-structured-address flip-address-form')]//ing-input[@id='street-or-house-number']//input[@id='inputField']")
	public static WebElement stnum;

	@FindBy(xpath = "//div[contains(@class,'address-parent style-scope ing-structured-address flip-address-form')]//ing-input[@id='street-name']//input[@id='inputField']")
	public static WebElement stname;

	@FindBy(xpath = "//ing-input-auto-complete[@id='street-type']//div[contains(@class,'filter-container style-scope ing-input-auto-complete')]//input[@id='inputField']")
	public static WebElement sttyp;

	@FindBy(xpath = "//div[contains(@class,'address-parent style-scope ing-structured-address flip-address-form')]//ing-input[@id='suburb']//input[@id='inputField']")
	public static WebElement subr;
	
	@FindBy(xpath="//span[@id='mobilePhoneInput_validationErrorSpan']")
	public static WebElement msg;

	public homepage(WebDriver driver) {

		homepage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public static void PTM() {

		personalTermDeposit.click();
		Actions action = new Actions(driver);

		action.moveToElement(personalTermDeposit).moveToElement(prest).click().build().perform();

	}

	public static void pop() throws InterruptedException {
		opennow.click();

	}

	public static void customer() throws InterruptedException {
		newcustomer.click();

	}

	public static void single() throws InterruptedException {

		radiobtn.click();
		Boolean checkradio = radiobtn.isSelected();

		if (checkradio == false) {
			radiobtn.click();
			System.out.println("Test has selected Radiobutton");
		} else {
			System.out.println("Radiobutton was selected on default");
		}

	}

	public static void gendertitle() throws InterruptedException {

		title.click();

	}

	public static void gendert() throws InterruptedException {

		radibtn1.click();

	}

	public static void gender() throws InterruptedException {

		radibtn2.click();

	}

	public static void gendertype() throws InterruptedException {

		radibtn3.click();

	}

	public static void unittype() throws InterruptedException {

		unit.sendKeys("123");
		// till this we called method

	}

	public static void streetnum() throws InterruptedException {

		stnum.sendKeys("#456");

	}

	public static void streetname() throws InterruptedException {

		stname.sendKeys("abc");

	}

	public static void streetype() throws InterruptedException {

		sttyp.sendKeys("india");

	}

	public static void subrub() throws InterruptedException {

		subr.sendKeys("1245");

		// we stopped postalcode

	}

	public static void msgMethod() {

		msg.getText();

	}
}