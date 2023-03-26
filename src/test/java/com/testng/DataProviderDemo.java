package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @Test(dataProvider = "datas")
    public void login(String username, String passeord) {
        System.out.println("username=" + username + "passeord=" + passeord);

    }

    @DataProvider
    public Object[][] datas() {
        Object[][] datas = {
                {
                        "zhangsan", "123"
                }, {
                "lisi", "333"
        }, {
                "wangwu", "123"
        }
        };
        return datas;
    }


}
