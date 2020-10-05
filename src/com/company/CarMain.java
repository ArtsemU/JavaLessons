package com.company;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.color = "Black";
        car.maxWeight = 1000;
        car.maxSpeed = 150;
        car.addWeight(200);
        car.drive(10);
        car.addWeight(500);
        car.drive(70);

        System.out.println(Car.var);
        car.var = 120;
        System.out.println(Car.var);
        car.var = 150;
        System.out.println(car.var);

        Car car1 = new Car();
        System.out.println(car1.var);
    }
}
