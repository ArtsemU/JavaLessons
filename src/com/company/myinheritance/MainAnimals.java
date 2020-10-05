package com.company.myinheritance;

public class MainAnimals
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Vasya";
        dog.name = "Kitty";

        cat.walk("garden");
        dog.walk("park");

        cat.feed("milk");
        dog.sit();

    }
}
