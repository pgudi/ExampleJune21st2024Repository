package org.example.reflection5;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.lang.reflect.Method;

public class RunnerScript {
    public static void main(String[] args) {
        executeScripts();
    }

    private static void executeScripts()
    {
        FileInputStream fin=null;
        Workbook wb=null;
        Sheet sh=null;
        Row row=null;
        Cell cell=null;
        try
        {
            fin=new FileInputStream("./testdata/data_Runner.xlsx");
            wb=new XSSFWorkbook(fin);
            sh = wb.getSheet("Sheet1");
            int rc=sh.getPhysicalNumberOfRows();
            for(int r=1;r<rc;r++)
            {
                row=sh.getRow(r);

                cell=row.getCell(0);
                String pkgclassname=cell.getStringCellValue();

                cell=row.getCell(1);
                String methodname=cell.getStringCellValue();

                System.out.println(pkgclassname+ " ==  "+methodname);
                //Create object dynamically
                Class clsObject=Class.forName(pkgclassname);
                Object obj=clsObject.getConstructor().newInstance();

                Method method=obj.getClass().getMethod(methodname);
                method.invoke(obj);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                wb.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
