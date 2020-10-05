package com.company.myinterface;

public class Plain implements Transport
{
    @Override
    public void go()
    {
        System.out.println("Take off");
    }

    @Override
    public void stop()
    {
        System.out.println("We are going to landing");
    }
}
