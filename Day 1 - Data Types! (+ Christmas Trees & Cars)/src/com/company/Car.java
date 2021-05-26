package com.company;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4732.43;
    boolean isCarOn = true;
    char carGrade = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int noOfPeopleInCar = 1;

    public Car(int customMinSpeed, double customWeight, boolean customIsTheCarOn) {
        minSpeed = customMinSpeed;
        weight = customWeight;
        isCarOn = customIsTheCarOn;

    }

    public void printVariable() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isCarOn);
        System.out.println(carGrade);
        System.out.println(nameOfCar);
        System.out.println(noOfPeopleInCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        noOfPeopleInCar++;
    }

    public void getOut() {
        noOfPeopleInCar--;
    }


    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

}
