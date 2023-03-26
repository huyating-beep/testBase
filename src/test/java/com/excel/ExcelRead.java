package com.excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelRead {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/test/resources/exceldemo.xlsx");
        Workbook sheets = WorkbookFactory.create(fis);
        //读取单个sheet数据
//        Sheet sheet1 = sheets.getSheet("Sheet1");
        //读取所有sheet数据
        for (Sheet sheet1 : sheets) {
            for (Row row : sheet1) {
                for (Cell cell : row) {
                    cell.setCellType(CellType.STRING);
                    System.out.print(cell.getStringCellValue() + "   ");
                }
                System.out.println();
            }
        }
//        int lastRowNum = sheet1.getLastRowNum();
//        for (int i = 0; i <= lastRowNum; i++) {
//            Row row = sheet1.getRow(i);
//            for (int j = 0; j < row.getLastCellNum(); j++) {
//                Cell cell = row.getCell(j);
//                cell.setCellType(CellType.STRING);
//                System.out.print(cell.getStringCellValue() + "  ");
//            }
//            System.out.println();
//        }
        fis.close();
    }


}

