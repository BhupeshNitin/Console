package ActiveScaler.Application_Pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testexcel 
{
    public static void main(String[] args) throws Exception
    {
    	String[][] excelData = null;
    	String filepath="C:\\Users\\nitin.thalia\\Desktop\\test_data.xlsx";
    	String Sheetname="Sheet1";
    	File file = new File(filepath);
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet(Sheetname);
		//int totalrow = sheet.getLastRowNum() + 1;
		int totalrow = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total number of col" +  col);
		System.out.println("Total number of row" +  totalrow);
		excelData = new String[totalrow][col];
		for(int i=1;i<totalrow;i++)
		{
			for(int j=0;j<col;j++)
			{
				excelData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(excelData[i][j]);
			}
		}
		
	}
}