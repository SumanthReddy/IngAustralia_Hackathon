package in.com.hcl.Utilities;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.gherkin.model.Scenario;

public class GenericMethods {
	
	public static WebDriver driver;
	
	
    public void killBrowser(Scenario scenario) throws IOException{
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("./target/fn.png");
        FileUtils.copyFile(SrcFile, DestFile);
        
	}
	
	
	public void PageloadTimeout(){
		
		Timeouts timeouts = driver.manage().timeouts();
		timeouts.pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public void ImplicitloadTimeout(){
		
		Timeouts timeouts = driver.manage().timeouts();
		timeouts.implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void SwitchtoNewWindow(){
		
	Set s = driver.getWindowHandles();
	Iterator itr = s.iterator();
	String w1 = (String) itr.next();
	String w2 = (String) itr.next();
	driver.switchTo().window(w2);
	}

	public static void switchToOldWindow() {
	Set s = driver.getWindowHandles();  
	Iterator itr = s.iterator();
	String w1 = (String) itr.next();
	String w2 = (String) itr.next();
	driver.switchTo().window(w1);
	}
	public static void switchToParentWindow() {

		driver.switchTo().defaultContent();

}
	public static void takeScreenshotOfWebelement(WebDriver driver,WebElement element, String Destination) throws Exception {
    
		File v = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage bi = ImageIO.read(v);
		org.openqa.selenium.Point p = element.getLocation();
		int n = element.getSize().getWidth();
		int m = element.getSize().getHeight();
		BufferedImage d = bi.getSubimage(p.getX(), p.getY(), n, m);
		ImageIO.write(d,"string",v);
		FileUtils.copyFile(v, new File(Destination));
	}


	public static void pressKeyDown(WebElement element) {
		element.sendKeys(Keys.DOWN);

	}
	public void pressKeyEnter(WebElement element) {

		element.sendKeys(Keys.ENTER);
	}
	
	public static void pressKeyUp(WebElement element) {
		element.sendKeys(Keys.UP);
		}
	
	public static void moveToTab(WebElement element) {
		element.sendKeys(Keys.chord(Keys.ALT, Keys.TAB));
		}
	
	public static void navigate_forward() {
		driver.navigate().forward();
		}
	public static void navigate_back() {
		driver.navigate().back();
		}
	public static void refresh() {
		driver.navigate().refresh();
		}
	
	public static void clearTextField(WebElement element) {
		element.clear();

		}
	public static void checkbox_Checking(WebElement checkbox) {
		boolean checkstatus;
		checkstatus = checkbox.isSelected();
		if (checkstatus == true) {
		System.out.println("Checkbox is already checked");
		} else {
		checkbox.click();
		System.out.println("Checked the checkbox");
		}
		}
	public static void radiobutton_Select(WebElement Radio) {
		boolean checkstatus;
		checkstatus = Radio.isSelected();
		if (checkstatus == true) {
		System.out.println("RadioButton is already checked");
		} else {
		Radio.click();
		System.out.println("Selected the Radiobutton");
		}
		}
	public static void checkbox_Unchecking(WebElement checkbox) {
		boolean checkstatus;
		checkstatus = checkbox.isSelected();
		if (checkstatus == true) {
		checkbox.click();
		System.out.println("Checkbox is unchecked");
		} else {
		System.out.println("Checkbox is already unchecked");
		}
		}
	public static void radioButton_Deselect(WebElement Radio) {
		boolean checkstatus;
		checkstatus = Radio.isSelected();
		if (checkstatus == true) {
		Radio.click();
		System.out.println("Radio Button is deselected");
		} else {
		System.out.println("Radio Button was already Deselected");
		}
		}

    public static void dragAndDrop(WebElement fromWebElement,WebElement toWebElement) throws InterruptedException {
       Actions builder = new Actions(driver);
       builder.clickAndHold(fromWebElement).moveToElement(toWebElement).perform();
       Thread.sleep(2000);
       builder.release(toWebElement).build().perform();

}
    public static void hoverWebelement(WebElement HovertoWebElement)
    		throws InterruptedException {
    		Actions builder = new Actions(driver);
    		builder.moveToElement(HovertoWebElement).build().perform();
    		

    		}
    
    public static void doubleClickWebelement(WebElement doubleclickonWebElement)
    		throws InterruptedException {
    		Actions builder = new Actions(driver);
    		builder.doubleClick(doubleclickonWebElement).perform();
    		Thread.sleep(2000);

    		}
    public static void clickCheckboxFromList(String xpathOfElement,String valueToSelect) {

    		List<WebElement> lst = driver.findElements(By.xpath(xpathOfElement));
    		for (int i = 0; i < lst.size(); i++) {
    		List<WebElement> dr = lst.get(i).findElements(By.tagName("label"));
    		for (WebElement f : dr) {
    		System.out.println("value in the list :"+ f.getText());
    		if (valueToSelect.equals(f.getText())) {
    		f.click();
    		break;
    		}
    		}
    		}
    		}
    public static void downloadFile(String href, String fileName)
    		throws Exception {
    		URL url = null;
    		URLConnection con = null;
    		int i;
    		url = new URL(href);
    		con = url.openConnection();
    		File file = new File(".//OutputData//" + fileName);
    		BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
    		BufferedOutputStream bos = new BufferedOutputStream(
    		new FileOutputStream(file));
    		while ((i = bis.read()) != -1) {
    		bos.write(i);
    		}
    		bos.flush();
    		bis.close();
    		}
}
