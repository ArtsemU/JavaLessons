package com.company.myinterface;

public class Car implements Transport
{
    @Override
    public void go()
    {
        System.out.println("We are moving!");
    }

    @Override
    public void stop()
    {
        System.out.println("Please! Stop!");
    }
}
