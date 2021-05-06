package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ddnCountry = driver.findElement(By.id("countries"));
		Select sc = new Select(ddnCountry);
		List<WebElement> alloptions = sc.getOptions();
		File file = new File("D:\\Eclipse\\seleniumframework\\Excel Sheets\\Book.xlsx");

		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Book2");

		for (int i = 0; i < alloptions.size(); i++) {
			WebElement allop = alloptions.get(i);
			String text = allop.getText();
			System.out.println(text);

			Row r = s.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(text);
		}

		FileOutputStream o = new FileOutputStream(file);
		w.write(o); 

		System.out.println("done.....");

	}
	}

