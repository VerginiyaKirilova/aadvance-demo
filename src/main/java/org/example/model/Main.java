package org.example.model;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();
        System.out.println();

        Car car3 = Car.builder()
                 .brand("BMW")
                .engineVolume("111")
                .model("x5")
                .build();
        System.out.println(car3.getBrand());

    }
}
