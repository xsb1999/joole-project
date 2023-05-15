package com.example.jooleproject.util;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();
        newList.add("1");
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");


        List<String> mysqlList = new ArrayList<>();
        mysqlList.add("1");
        mysqlList.add("2");
        mysqlList.add("5");
        mysqlList.add("6");

        List<String> retainList = new ArrayList<>();
        retainList.addAll(newList);
        boolean b1 = retainList.retainAll(mysqlList);
        System.out.println("保留的元素: " + retainList);
    }
}
