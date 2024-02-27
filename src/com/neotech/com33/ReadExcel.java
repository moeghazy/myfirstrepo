package com.neotech.com33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir") + "/test_data/Homework.xlsx";
		System.out.println(filePath);

		FileInputStream fis = new FileInputStream(filePath);
		// read from the ecxel file
		Workbook book = new XSSFWorkbook(fis);
		// sheet-----> row ----> col(Cell)

		// creating sheet object
		Sheet sheet = book.getSheet("Companies");

		Row r = sheet.getRow(2);
		int cols = r.getLastCellNum();
		
		List<Object> list = new ArrayList();

		for (int i = 0; i < sheet.getPhysicalNumberOfRows() - 1; i++) {
			list.add(sheet.getRow(2).getCell(i));

		}
		System.out.println(list.toString());

		Set<Double> col = new HashSet<Double>();
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			col.add(sheet.getRow(i).getCell(4).getNumericCellValue());

		}
		System.out.println(col);

		book.close();
		fis.close();

	}

}
