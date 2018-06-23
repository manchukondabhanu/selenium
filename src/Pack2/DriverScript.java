
package Pack2;
import static Pack2.AppFunctions.*;



import java.lang.reflect.Method;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class DriverScript {
static String keyword;
static String testobject;
static String testdata;
static String flag;
static String sheetname="Sheet1"; 
public static void main(String args[]) throws InvalidFormatException, Exception{
	
   loadPropeties(System.getProperty("user.dir")+"/src/Pack2/OR.properties");
  XcelReader xreader=new XcelReader(System.getProperty("user.dir")+"/src/Pack2/keywordexcel.xlsx");
 int rc=xreader.getRowsCount("Sheet1");
 for (int r = 1; r < rc; r++) {
	 flag=xreader.CellData(sheetname, r, 1);
	 if (flag.equals("Y"))
	 {
	try {
			keyword=xreader.CellData(sheetname, r, 4);
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {
			testobject=xreader.CellData(sheetname, r, 5);
		} catch (Exception e) {
			// TODO: handle exception
		}
	try {
			testdata=xreader.CellData(sheetname, r, 6);
		} catch (Exception e) {
			// TODO: handle exception
		}
		AppFunctions kword=new AppFunctions();
		Method  
		m=kword.getClass().getMethod(keyword,String.class,String.class);
		String result=(String)
		m.invoke(kword, testobject,testdata);
		xreader.setCellData(sheetname, r, 7, result);
	}
   else
	 {
	System.out.println("***********************************");	
	}	
}
}	
}