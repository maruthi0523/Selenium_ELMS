package com.elmspageobjects;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

public class ReadDataFromExcel {

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException, InvalidFormatException {

		// Create an object of File class to open xlsx file
		//File file = new File(filePath + "\\" + fileName);

		// Create an object of FileInputStream class to read excel file
		//FileInputStream inputStream = new FileInputStream(file);

		//Workbook guru99Workbook = null;
		String path ="/home/css/Documents/Elms_selenium/Elms_automation/src/main/resources/xlsfile/ExcelData.xlsx";
		Workbook guru99Workbook = WorkbookFactory.create(new File(path));
		//Workbook workbook = WorkbookFactory.create(new File(path));
		//System.out.println("@@@@@@@@@"+guru99Workbook);
       // System.out.println("Workbook has " + guru99Workbook.getNumberOfSheets() + " Sheets : ");
        Sheet sheet = guru99Workbook.getSheetAt(0);
       /* Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
               // String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cell + "\t");
            }
            System.out.println();
        }*/

		
		
		
		
		// Find the file extension by splitting file name in substring and getting only
		// extension name
		//String fileExtensionName = fileName.substring(fileName.indexOf("."));

		// Check condition if the file is xlsx file
		/*if (fileExtensionName.equals(".xlsx")) {
			// If it is xlsx file then create object of XSSFWorkbook class
			//guru99Workbook = new XSSFWorkbook(inputStream);
		}*/
		// Check condition if the file is xls file

		/*else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class
			//guru99Workbook = new HSSFWorkbook(inputStream);
		}*/

		// Read sheet inside the workbook by its name
		Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

		// Find number of rows in excel file
		int rowCount = guru99Sheet.getLastRowNum() - guru99Sheet.getFirstRowNum();
		//System.out.println("rowCount"+rowCount);

		// Create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount + 1; i++) {

			Row row = guru99Sheet.getRow(i);

			// Create a loop to print cell values in a row
			for (int j = 0; j < row.getLastCellNum(); j++) {
				
				// Print Excel data in console
				//System.out.print(row.getCell(j).getStringCellValue() + "|| ");
				System.out.print(row.getCell(j));
				if(j < row.getLastCellNum()-1)
				{
					System.out.print("||");
				}

			}

			System.out.println();
		}
	}

	// Main function is calling readExcel function to read data from excel file

	public static void main(String... strings) throws IOException, InvalidFormatException {

		// Create an object of ReadGuru99ExcelFile class

		ReadDataFromExcel objExcelFile = new ReadDataFromExcel();
		
		// Prepare the path of excel file
		// String filePath =
		// System.getProperty("../MavenProject/src/main/java/com/excel/ExcelData.xlsx");
		//System.getProperty("user.dir") +
		String filePath = "/home/css/Documents/Elms_selenium/Elms_automation/src/main/resources/xlsfile";
		///MavenProject/src/main/java/com/excel/ExcelData.xlsx
		// Call read file method of the class to read data
		//objExcelFile.readExcel(filePath, "", "Data");
		
		objExcelFile.readExcel(filePath,"ExcelData.xlsx", "Data");

	}

}
