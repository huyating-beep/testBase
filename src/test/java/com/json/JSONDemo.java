package com.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONDemo {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //1.map对象转JSON
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("age", 28);
        map.put("sex", "女");
        String json = objectMapper.writeValueAsString(map);
        System.out.println(json);
        System.out.println("============");
        //2.JSON转对象
        String jsonStr="{\"name\":\"zhangsan\",\"age\":18}";
        Student student = objectMapper.readValue(jsonStr, Student.class);
        System.out.println(student);
        System.out.println("============");



        String str="{\"name\":\"lemo12\",\"students\":[{\"name\":\"zhangsan\",\"age\":18}]}";
        ClassRoom classRoom = objectMapper.readValue(str, ClassRoom.class);
        System.out.println(classRoom.getName());
        for (Student student1 : classRoom.getStudents()) {
            System.out.println(student1);
        }


    }
}
