package com.excel;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.List;

public class TestNGDemo1 {
    @Test(dataProvider = "dataProvider")
    public void test(CaseInfo caseInfo){
        System.out.println(caseInfo.getAge());
        System.out.println("提交代码");


        System.out.println(caseInfo.getName());
    }
    @DataProvider
    public Object[] dataProvider() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/exceldemo.xlsx");
        ImportParams importParams = new ImportParams();
        List<CaseInfo> caseInfos = ExcelImportUtil.importExcel(fileInputStream, CaseInfo.class, importParams);
        Object[] objects = caseInfos.toArray();
        fileInputStream.close();

        return objects;
    }






}
