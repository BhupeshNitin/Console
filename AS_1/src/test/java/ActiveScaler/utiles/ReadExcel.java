package ActiveScaler.utiles;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel
{
	 XSSFWorkbook workbook;
	static XSSFSheet sheet;
	int totalcol;
	int totalrow;
	int i,j;
	public static Object[][] getdata(String filepath,String Sheetname) throws Exception
	{
	String[][] excelData = null;
		File file = new File(filepath);
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet(Sheetname);
		int totalrow = sheet.getLastRowNum()+1;
		XSSFRow row=sheet.getRow(0);
		int totalcol = row.getLastCellNum();
//		System.out.println(totalrow);
//		System.out.println(totalcol);
		excelData = new String[totalrow][totalcol];
	for(int i=1;i<totalrow;i++)
	{
		for(int j=0;j<totalcol;j++)
		{
			excelData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();

		}
	
	}

	return excelData;
	}
	

}

