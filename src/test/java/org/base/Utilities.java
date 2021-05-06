package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	public static WebDriver driver;

	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\seleniumframework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	public static void launchUrl(String data) {
		driver.get(data);
	}
	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static  void getCurrentUrl() {
		driver.getCurrentUrl();

	}
	public static void getTitle() {
		driver.getTitle();

	}
	public static void getText(WebElement element) {
		element.getText();
	}
	public static void getAttribute(WebElement element ,String data) {
		element.getAttribute(data);
	}
	public static void close() {
		driver.close();

	}	
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void moveToElement(WebElement target) {
		Actions ac = new Actions(driver);
		ac.moveToElement(target).perform();

	}
	public static void rightClick(WebElement target) {
		Actions ac = new Actions(driver);
		ac.contextClick(target).perform();

	}
	public static void doubleClick(WebElement target) {
		Actions ac = new Actions(driver);
		ac.doubleClick(target).perform();

	}
	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source,target).perform();

	}
	public static void keyPress(int index) throws AWTException {
		Robot rc = new Robot();
		rc.keyPress(index);

	}
	public static void keyRelease(int index) throws AWTException {
		Robot rc = new Robot();
		rc.keyRelease(index);

	}
	public static void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public static void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}
	public static void alertSendkeys(String data) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(data);

	}
	public static void getScreenshot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\selenium");

	}
	public static void frameId(String Id) {
		driver.switchTo().frame(Id);
	}
	public static void frameName(String data) {
		driver.switchTo().frame(data);
	}
	public  static void frameElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void frameIndex(int id) {
		driver.switchTo().frame(id);
	}
	public static void executeScriptSet(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(data, element);

	}
	public static void executeScriptGet(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("return arguments[0].getAttribute('value')", element);

	}
	public static void executeScriptC(String data ,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(data, element);

	}
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}
	public static void selectByValue(WebElement element, String data) {
		Select sc = new Select(element);
		sc.selectByValue(data);
	}
	public static void selectByIndex(WebElement element, int id) {
		Select sc = new Select(element);
		sc.selectByIndex(id);
	}
	public static void selectByVisibleText(WebElement element, String data) {
		Select sc = new Select(element);
		sc.selectByVisibleText(data);
	}
	public static void getOptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> list = sc.getOptions();

	}
	public static void getAllSelectedOptions(WebElement element) {
		Select sc = new Select(element);
		List<WebElement> list = sc.getOptions();

	}
	public static void getFirstSelectedOptions(WebElement element) {
		Select sc = new Select(element);
		WebElement fst = sc.getFirstSelectedOption();

	}

	public static void isMultiple(WebElement element) {
		Select sc = new Select(element);
		boolean b = sc.isMultiple();
	}
	public static void deSelectByIndex(WebElement element, int id) {
		Select sc = new Select(element);
		sc.deselectByIndex(id);	
	}
	public static void deSelectByValue(WebElement element, String data) {
		Select sc = new Select(element);
		sc.deselectByValue(data);
	}
	public static void deSelectByVisibleText(WebElement element, String data) {
		Select sc = new Select(element);
		sc.deselectByVisibleText(data);	
	}
	public static void deSelectAll(WebElement element, String data) {
		Select sc = new Select(element);
		sc.deselectAll();	
	}
	public static void getWindowHandle() {
		String prtWindow = driver.getWindowHandle();
	}
	public static  void getWindowHandles() {
		Set<String> allWindow = driver.getWindowHandles();

	}
	public static void switchWindow(String string) {
		driver.switchTo().window(string);
	}
	public static void quit() {
		driver.quit();
	}
	public static WebElement findElementById(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}
	public static WebElement findElementByXpath(String data) {
		WebElement findElement = driver.findElement(By.xpath(data));
		return findElement;
	}
	public static WebElement findElementByName(String data) {
		WebElement findElement = driver.findElement(By.name(data));
		return findElement;

	}
	public static String getDataFromExcel(String pathname,String name,int rowNo,int cellNo ) throws IOException  {
		File file = new File(pathname);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet(name);
		Row r =	s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		String value ="";
		if(cellType==1) {
			value = c.getStringCellValue();
		}else if(DateUtil.isCellDateFormatted(c)) {
			Date datecellvalue =c.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("DD-MMM-YYYY");
			format.format(datecellvalue);
		}else {
			double numericCellValue = c.getNumericCellValue();
			long l = (long)numericCellValue;
			value = String.valueOf(l);
		}


		return value;

	}
}


















