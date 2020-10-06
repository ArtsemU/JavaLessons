package com.company.myinheritance;

public class Animal {
    String name;
    String color;
    int xpackage;
    public int var;

    public void walk(String place)
    {
        System.out.println("We are moving to " + place);
    }

    public void sleep()
    {
        xpackage = 10;
        System.out.println("Zzz...");
    }

    public void sound()
    {
        System.out.println("Hello!");
    }
}
