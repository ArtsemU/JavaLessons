package com.company.myinheritance;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog extends Animal
{
    int weight;

    public void sit()
    {
        System.out.println("I'm sitting");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void sleep() {
        System.out.println("Rrrr... Zzzz...");
    }

    public void lay()
    {
        System.out.println("I'm laying");
    }
}
