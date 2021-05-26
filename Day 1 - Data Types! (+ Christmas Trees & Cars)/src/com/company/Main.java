package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car birthdayGift = new Car(500,5000.545, true);
        System.out.println("Birthday Car V1");
        birthdayGift.getIn();
        birthdayGift.getIn();
        birthdayGift.getIn();
        System.out.println("Miles Left: " + birthdayGift.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayGift.maxMilesPerFillUp());

        System.out.println("Birthday Car V2");
        birthdayGift.printVariable();
        birthdayGift.getOut();

        System.out.println("Birthday Car V3");
        birthdayGift.printVariable();
    }

}
