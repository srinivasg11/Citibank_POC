package com.citibank.pages;

import java.util.Properties;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.report.ReportUtil;
import com.util.ReadPropertiesFileTest;

public class MakeMyTripPages{

	private static final String filename = null;
	ReadPropertiesFileTest readfile = new ReadPropertiesFileTest();
	Properties prop = readfile.readPropertiesFile(filename);

	@FindBy(xpath = "//*[@id=\"react-autowhatever-1\"]/../input")
	WebElement location;

	@FindBy(id = "fromCity")
	WebElement from_location_input;

	@FindBy(id = "toCity")
	WebElement to_location_input;

	@FindBy(xpath = "//a[contains(text(),'Search')]")
	WebElement Search_button;

	@FindBy(xpath = "//*[@id=\"react-autowhatever-1-section-0-item-0\"]")
	WebElement location_selection;
	
	public static ChromeDriver driver;
	public MakeMyTripPages() {
		PageFactory.initElements(driver, this);
	}

	public void navigateTo_SearchFlights(ChromeDriver driver) throws InterruptedException {
		driver.get(prop.getProperty("APP_URL"));
		driver.manage().window().maximize();
		driver.findElement(By.id("fromCity")).sendKeys("DEL");
		Thread.sleep(20000);
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0"))).click().perform();
		driver.findElement(By.id("toCity")).sendKeys("BOM");
		act.moveToElement(driver.findElement(By.id("react-autowhatever-1-section-0-item-0"))).click().perform();
		Thread.sleep(20000);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Search')]"))).click().perform();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/p"));
	}

	/*public void location_click(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(location));
		location.click();
	}

	public void from_location_inputField(ChromeDriver driver) {
		from_location_input.sendKeys("YYZ");
	}

	public void location_selection(ChromeDriver driver) {
		location_selection.click();
	}

	public void to_location_inputField(ChromeDriver driver) {
		to_location_input.sendKeys("DEL");
	}

	public void search_button_click(ChromeDriver driver) {
		Search_button.click();
	}*/
}
