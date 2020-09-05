package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        double d = 1.1;
        String s = "My first string";
        System.out.println(x);
        System.out.println(d);
        System.out.println(s);
        PrintMe();
        int[] listArray = new int[8];

        System.out.println(listArray);


    }
    static void PrintMe()
    {
        System.out.println("I can write a method!!!");
    }
}
