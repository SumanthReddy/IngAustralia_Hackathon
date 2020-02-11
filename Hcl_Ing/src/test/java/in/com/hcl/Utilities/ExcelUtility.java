package in.com.hcl.Utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	 
		public void writeExcel(String fileName,String sheetName,List<String> Writedta) throws IOException{
			String filePath = (System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell");
			File file =    new File(filePath+"\\"+fileName);		
			FileInputStream inputStream = new FileInputStream(file);
			Workbook TestdataWorkbook = null;		
			String fileExtensionName = fileName.substring(fileName.indexOf("."));		
			if(fileExtensionName.equals(".xlsx")){

				TestdataWorkbook = new XSSFWorkbook(inputStream);
			}

			else if(fileExtensionName.equals(".xls")){

				TestdataWorkbook = new HSSFWorkbook(inputStream);
			}   	

			Sheet sheet = TestdataWorkbook.getSheet(sheetName);	

			int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();		

			Row row = sheet.getRow(0);

			Row newRow = sheet.createRow(rowCount+1);


			for(int j = 0; j<row.getLastCellNum(); j++)
			{

				//Fills data in row by coul

				Cell cell = newRow.createCell(j);

				cell.setCellValue(Writedta.get(j));

			}
			inputStream.close();
			FileOutputStream outputStream = new FileOutputStream(file);
			TestdataWorkbook.write(outputStream);		
			outputStream.close();

		}	
		
		
		public void setExcelData(String fileName,String sheetName,int rowNum,int colNum,String data) throws InvalidFormatException, IOException{

			 FileInputStream inp = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
			 Workbook wb = WorkbookFactory.create(inp); 
			 Sheet sheet = wb.getSheet(sheetName); 
			//int lastRow = sheet.getLastRowNum();
			 Row row = sheet.createRow(rowNum);		 
			row.createCell(colNum).setCellValue(data);			 
			// Now this Write the output to a file 
			FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
			wb.write(fos); 
			fos.close();  
		}
		
		
		
		public String getExcelData(String fileName,String sheetName , int rowNum , int colNum) throws InvalidFormatException, IOException{
		      FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);    
		      Row row = sh.getRow(rowNum);
		      String data = row.getCell(colNum).getStringCellValue();
		      return data;
		}
		
		

		public int getRowCount(String fileName,String sheetName) throws InvalidFormatException, IOException{    
		      FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);
		      int rowCount = sh.getLastRowNum()+1;
		      return rowCount;
		}	

		public int getcellCount(String fileName,String sheetName,int rowNum) throws InvalidFormatException, IOException{
		      FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+".\\src\\main\\java\\com\\qa\\Resource\\AppdataExcell"+"\\"+fileName);
		      Workbook wb = WorkbookFactory.create(fis);
		      Sheet sh = wb.getSheet(sheetName);    
		      Row row = sh.getRow(rowNum);
		     return row.getLastCellNum();     
		}

	     public String[][] getExcelData(String fileName, String sheetName) throws EncryptedDocumentException, IOException {
			XSSFSheet ExcelWSheet;
			XSSFWorkbook ExcelWBook;
			String[][] arrayExcelData = null;
			// Reading Excel File
			FileInputStream ExcelFile = new FileInputStream(fileName);

			String fileExtensionName = fileName.substring(fileName.indexOf("."));

			if (fileExtensionName.equals(".xlsx")) {
				ExcelWBook = new XSSFWorkbook(ExcelFile);
				ExcelWSheet = ExcelWBook.getSheet(sheetName);
				int totalNoOfRows = ExcelWSheet.getLastRowNum();
				int totalNoOfCols_0 = ExcelWSheet.getRow(0).getLastCellNum();
				arrayExcelData = new String[totalNoOfRows][totalNoOfCols_0];
				for (int i = 0; i < totalNoOfRows; i++) {
					int totalNoOfCols = ExcelWSheet.getRow(i).getLastCellNum();
					for (int j = 0; j < totalNoOfCols; j++) {
						arrayExcelData[i][j] = ExcelWSheet.getRow(i + 1).getCell(j).getStringCellValue();
					}
				}
				System.out.println(arrayExcelData);
			}

			else if (fileExtensionName.equals(".xls")) {
				Workbook ExcelWBook1;
				Sheet ExcelWSheet1;
				ExcelWBook1 = WorkbookFactory.create(ExcelFile);
				ExcelWSheet1 = ExcelWBook1.getSheet(sheetName);
				int totalNoOfRows = ExcelWSheet1.getLastRowNum();
				int totalNoOfCols_0 = ExcelWSheet1.getRow(0).getLastCellNum();
				arrayExcelData = new String[totalNoOfRows][totalNoOfCols_0];
				for (int i = 0; i < totalNoOfRows; i++) {
					int totalNoOfCols = ExcelWSheet1.getRow(i).getLastCellNum();
					for (int j = 0; j < totalNoOfCols; j++) {
						arrayExcelData[i][j] = ExcelWSheet1.getRow(i + 1).getCell(j).getStringCellValue();
					}
				}
				System.out.println(arrayExcelData);
			}

			return arrayExcelData;
		}
	     
}
