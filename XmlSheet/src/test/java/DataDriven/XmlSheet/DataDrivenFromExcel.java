package DataDriven.XmlSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFromExcel {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\chinni_chakravarthi\\Desktop\\TestData.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		ArrayList<String> al=new ArrayList<>();
		int sheetCount=book.getNumberOfSheets();
		for (int i=0;i<sheetCount;i++) {
			if(book.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet=book.getSheetAt(i);
				Iterator<Row> rows=sheet.rowIterator();
				Row firstRow=rows.next();
				Iterator<Cell> columns=firstRow.cellIterator();
				System.out.println("columns is :"+columns);
				while(columns.hasNext()) {
					Cell column=columns.next();
					int k=0;
					int col=0;
					if(column.getStringCellValue().equalsIgnoreCase("place")) {
						col=k;
					}
					k++;
					//System.out.println("---");
					while(rows.hasNext()) {
						//System.out.println("***");
						Row row=rows.next();
						System.out.println("***");
						if(row.getCell(col).getStringCellValue().equalsIgnoreCase("kalidindi")) {
							Iterator<Cell> cv=row.cellIterator();
							System.out.println(cv);
							System.out.println("***");
							while(cv.hasNext()) {
							Cell c=cv.next();
							System.out.println("valu of c is :"+c);
							if(c.getCellType()==CellType.STRING) {
								al.add(c.getStringCellValue());
							}
							}
						}
					}
				}
			}
		}
		
		System.out.println(al);
	}

}
