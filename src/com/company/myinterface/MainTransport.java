package com.company.myinterface;

public class MainTransport
{
    public static void main(String[] args)
    {
        Plain plain = new Plain();
        Car car = new Car();

        car.go();
        car.stop();

        plain.go();
        plain.stop();
    }
}
