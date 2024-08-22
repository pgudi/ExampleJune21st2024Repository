package com.sgtesting.excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteExcelAssignment {
    public static void main(String[] args) {
        readWriteFile();
    }

    private static void readWriteFile()
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        Workbook wb=null;
        Sheet sh1=null;
        Sheet sh2=null;
        Row sh1row=null;
        Row sh2row=null;
        Cell sh1cell=null;
        Cell sh2cell=null;
        try
        {
            fin=new FileInputStream("D:\\EXCEL\\Demo1.xlsx");
            wb=new XSSFWorkbook(fin);
            sh1=wb.getSheet("Sheet1");
            sh2=wb.getSheet("Sheet2");
            if(sh2==null)
            {
                sh2=wb.createSheet("Sheet2");
            }
            sh1row=sh1.getRow(0);
            int cc=sh1row.getPhysicalNumberOfCells();
            int r=0;
            for(int c=0;c<cc;c++)
            {
                sh2row=sh2.getRow(r);
                if(sh2row==null)
                {
                    sh2row=sh2.createRow(r);
                    r=r+1;
                }
                //1st Sheet cells
                sh1cell=sh1row.getCell(c);
                String data=sh1cell.getStringCellValue();

                //2nd Sheet Cells
                sh2cell=sh2row.createCell(0);
                sh2cell.setCellValue(data);
            }
            fout=new FileOutputStream("D:\\EXCEL\\Demo1.xlsx");
            wb.write(fout);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
                fout.close();
                wb.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
