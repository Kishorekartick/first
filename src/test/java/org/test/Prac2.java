package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Prac2 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Eclipse\\seleniumframework\\Excel Sheets\\demo.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("datas");




		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();


				if(type==1) {
					String name = c.getStringCellValue();
					System.out.println(name);
				}
				if(type==0) {
					double d = c.getNumericCellValue();
					long l = (long)d;
					System.out.println(l);
				}
			}
		}
	}
}