package com.fantasid.java;

import java.util.Date;
import java.util.HashMap;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!");
        showDate();
    }

    public static void showDate() {

        Date date = new Date();
        System.out.println(date);
        System.out.println("date = " + date);
        getMap();



    }

    private static void getMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", "18");
    }

    public static String showDate(String name) {
        System.out.println(name + " is eating");
        return "SUCCESS";
    }

}
