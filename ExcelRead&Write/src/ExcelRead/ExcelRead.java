package ExcelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		//File fis = new File("‪‪‪D:\\Sibu123.xlsx");
		//Read value from Excel
		FileInputStream file = new FileInputStream("D:\\Sibu123.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sh= wb.getSheet("Sheet1");
		XSSFRow rw = sh.getRow(8);
		XSSFCell cl=rw.getCell(1);
		System.out.println(cl);
		cl.setCellType(CellType.STRING);
		cl.setCellValue("Sarangii");
		//Write Value in Excel
		FileOutputStream ip=new FileOutputStream("D:\\Sibu123.xlsx");
		wb.write(ip);
		wb.close();
		
		
		
		
		

	}

}
