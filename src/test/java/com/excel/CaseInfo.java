package com.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class CaseInfo {
    @Excel(name = "name")
    private String name;
    @Excel(name = "age")
    private Integer age;

    public CaseInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CaseInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public CaseInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

