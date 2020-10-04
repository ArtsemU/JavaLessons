package com.company;

public class Car {
    int speed;
    int maxSpeed;
    int weight;
    int maxWeight;
    String color;

    public void addWeight(int w)
    {
        weight += w;
        System.out.println("Weight is: " + weight);
    }

    public void drive(int s)
    {
        if (weight >= maxWeight)
        {
            speed += s;
        }
        else
        {
            System.out.println("Cant drive");
        }
    }
}
