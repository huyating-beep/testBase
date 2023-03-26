package com.excel;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExcelBaseParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.params.ExcelExportEntity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class EasyPOIDemo {
    public static void main(String[] args) throws Exception {
//        FileInputStream fis = new FileInputStream("src/test/resources/exceldemo.xlsx");
//        ImportParams importParams = new ImportParams();
//        List<CaseInfo> list = ExcelImportUtil.importExcel(fis, CaseInfo.class, importParams);
//        for (CaseInfo info : list) {
//            System.out.println(info);
//        }

//        FileInputStream fileInputStream = new FileInputStream("src/test/resources/exceldemo.xlsx");
//        ImportParams importParams = new ImportParams();
//        importParams.setStartRows(0);
//        importParams.setSheetNum(1);
//
//        List<CaseInfo> caseInfos = ExcelImportUtil.importExcel(fileInputStream, CaseInfo.class, importParams);
//        for (CaseInfo caseInfo : caseInfos) {
//            System.out.println(caseInfo);
//        }





        FileInputStream fileInputStream = new FileInputStream("src/test/resources/exceldemo.xlsx");
        ImportParams importParams = new ImportParams();
        List<CaseInfo> caseInfos = ExcelImportUtil.importExcel(fileInputStream, CaseInfo.class, importParams);
        Object[] objects = caseInfos.toArray();
        for (Object o : objects) {
            System.out.println(o);
        }

        fileInputStream.close();

    }
}
