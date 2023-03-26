package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
    @Test
    @Parameters({"version"})
    public void test1(String v){
        System.out.println(v);
    }
}
