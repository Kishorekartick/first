package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.Utilities;

import org.junit.AfterClass;
import org.junit.Test;
import org.login.BookingPage;
import org.login.ContinuePage;
import org.login.LoginPage;
import org.login.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prac4 extends Utilities{
	@Test
	public void tc0() {
		getDriver();
		launchUrl("http://www.adactin.com/HotelApp/");
		maximize();
	}
	@Test
	public void tc1() throws IOException {
		LoginPage login = new LoginPage();
		enterText(login.getTxtUsername(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1, 0));
		enterText(login.getTxtPassword(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1, 1));
		btnClick(login.getBtnLogin());
	}
	@Test
	public void tc2() throws IOException {
		SearchPage sr = new SearchPage();
		selectByVisibleText(sr.getDdloction(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,2) );
		selectByVisibleText(sr.getDdnHotel(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas",1, 3) );
		selectByVisibleText(sr.getDdRoomType(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas",1, 4) );
		selectByVisibleText(sr.getDdRoomNos(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas",1,5) );
		enterText(sr.getDddatepickin(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,6) );
		enterText(sr.getDddatepickout(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas",1, 7) );
		enterText(sr.getDdAdultroom(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,8) );
		enterText(sr.getDdnChildRoom(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,9) );
		btnClick(sr.getBtnSubmit());
	}
	@Test
	public void tc3() {
		ContinuePage ct = new ContinuePage();
		btnClick(ct.getBtnRadio());
		btnClick(ct.getBtnContinue());
	}
	@Test
	public void tc4() throws IOException, InterruptedException {
		BookingPage bp = new BookingPage();
		enterText(bp.getFirstName(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,10));
		enterText(bp.getLastName(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,11));
		enterText(bp.getAddress(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,12));
		enterText(bp.getCrdCard(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,13));
		selectByVisibleText(bp.getCrdCardType(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,14));
		selectByVisibleText(bp.getExpiryMonth(),getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,15));
		selectByVisibleText(bp.getExpiryYear(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,16));
		enterText(bp.getCrdCvv(), getDataFromExcel("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx", "datas", 1,17));
		btnClick(bp.getBookNow());
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.id("order_no"));
		String text = element.getAttribute("value");

		File f = new File("D:\\Eclipse\\seleniumframework\\Excel Sheets\\adactin.xlsx");
		FileInputStream iStream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(iStream);
		Sheet s = w.getSheet("datas");
		Row row = s.createRow(0);
		Cell cell = row.createCell(18);
		
		cell.setCellValue(text);
		FileOutputStream oStream = new FileOutputStream(f);
		w.write(oStream);

		System.out.println(text);

	}
	@AfterClass
	public static void afterclass() {
		System.out.println("done");


	}

}
