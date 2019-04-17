package com.zhb.javaSE;

public class Car {
    private String color;
    private String pp;
    private String carid;
    private String price;

    public Car() {
    }

    public Car(String color, String pp, String carid, String price) {
        this.color = color;
        this.pp = pp;
        this.carid = carid;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", pp='" + pp + '\'' +
                ", carid='" + carid + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.carid = "浙A8888";
        car.color = "红色";
        car.pp = "ajha";
        car.price ="5021540241";
        Car car2 = new Car("浙A66666","蓝色","jkjk","646464");
        System.out.println(car.toString());
        System.out.println(car2.toString());
    }
}
