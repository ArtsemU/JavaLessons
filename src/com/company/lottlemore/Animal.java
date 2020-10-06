package com.company.lottlemore;

public abstract class Animal
{
    public abstract void saySmth();
    public abstract void eat();
    public abstract void doSmth(String s, int i);

    public  void walk(String place)
    {
        System.out.println("I'm walking to" + place);
    }
}
