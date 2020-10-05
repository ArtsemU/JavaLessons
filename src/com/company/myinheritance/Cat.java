package com.company.myinheritance;

public class Cat extends Animal
{
    public void feed(String feed)
    {
        System.out.println("I like " + feed);
        xpackage = 90;
    }

    @Override
    public void sound()
    {
        System.out.println("Mew mew mew");
    }
}
