package com.company.lottlemore;

public class Cat extends Animal
{
    @Override
    public void saySmth()
    {
        System.out.println("Mew mew");
    }

    @Override
    public void eat()
    {
        System.out.println("I like milk");
    }

    @Override
    public void doSmth(String s, int i)
    {
        System.out.println("I did " + s + " " + i + " times");
    }
}
