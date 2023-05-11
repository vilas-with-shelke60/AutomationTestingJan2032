package utility;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	static XSSFWorkbook workbook;
	
	public static String[][] testData()
	{
		
		
		try
		{
		//we need to read excel
		FileInputStream file = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\AutomationTestingJan23\\TestData\\Workbook2.xlsx");
		
		//Ms Excel file
		workbook=new XSSFWorkbook(file);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//need to move into sheet
		XSSFSheet sheet=workbook.getSheet("ContactData");
		
		int rows =sheet.getLastRowNum();
		
		System.out.println(rows);
		
		int column = sheet.getRow(0).getLastCellNum();
		
		System.out.println(column);
		
		String data[][]=new String[rows][column];
		
		for(int i=0;i<rows;i++){//outer for loop will handle rows 
			
			for(int j=0;j<column;j++)//inner for loop will handle column/cell 
			{
				
			    data[i][j] =sheet.getRow(i+1).getCell(j).toString();
			   // System.out.print(data+"     ");
			 
		}
			//System.out.println();
	}
        return data;

	}
	 
}
