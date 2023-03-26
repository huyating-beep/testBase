package com.yaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class YamlDemo {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        //1、对象转Yaml
//        Map<String, Object> map = new HashMap<>();
//        map.put(
//        "name", "zhangsan");
//        String yaml = objectMapper.writeValueAsString(map);
//        System.out.println(yaml);
        //2.Yaml转对象
        Map map = objectMapper.readValue(new FileInputStream("/Users/huyating/IdeaProjects/test_base/src/test/resources/test.yaml"), Map.class);
        System.out.println(map);
    }
}
