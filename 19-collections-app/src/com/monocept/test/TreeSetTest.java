package com.monocept.test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<String>();
        set1.add("xyz");
        set1.add("lmn");
        set1.add("abc");
        System.out.println(set1);
    }
}
