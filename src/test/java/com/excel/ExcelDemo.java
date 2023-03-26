package com.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/test/resources/exceldemo.xlsx");
        Workbook excelSheet = WorkbookFactory.create(fis);
        Sheet sheet1 = excelSheet.getSheet("Sheet1");
        Row row = sheet1.getRow(1);
        Cell name = row.getCell(0);
        Cell age = row.getCell(1);
        System.out.println(name + "" + age);
        fis.close();


//        FileInputStream fis=new FileInputStream("src/test/resources/exceldemo.xlsx");
//        Workbook excleSheet = WorkbookFactory.create(fis);
//        Sheet sheet1 = excleSheet.getSheet("Sheet1");
//        Row row = sheet1.getRow(1);
//        Cell cell = row.getCell(1);
//        System.out.println(cell);
//        fis.close();


    }
}
